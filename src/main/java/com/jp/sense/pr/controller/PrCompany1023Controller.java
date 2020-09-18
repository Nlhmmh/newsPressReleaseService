package com.jp.sense.pr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.sense.pr.model.dto.ReportDataDTO;
import com.jp.sense.pr.model.dto.ReportDataGraphDTO;
import com.jp.sense.pr.model.dto.ReportDataOverallDTO;
import com.jp.sense.pr.security.CompUserDetails;
import com.jp.sense.pr.service.PrCompany1023Service;

/**
 * --レポート一覧
 * --コントローラー
 * 
 * @author ネィ
 */
@Controller
public class PrCompany1023Controller {
	
	@Autowired
	PrCompany1023Service prCompany1023Service;
	
	/**
	 * --レポート一覧画面
	 * 
	 * @param loginUser
	 * @param model
	 * @return　HTML文字列
	 */
	@RequestMapping("/company/report_list")
	public String index(@AuthenticationPrincipal CompUserDetails loginUser, Model model) {
		
		// ●レポートグラフのデータ取得  
		List<ReportDataGraphDTO> reportDataGraphDTOList = prCompany1023Service.selectReportDataGraphDay(loginUser.getCompanyId());
		// ●アクセス日リスト
		List<String> dateList = new ArrayList<String>();
		for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
			dateList.add(reportDataGraphDTO.getAccessTime_string1());
		}
		model.addAttribute("dateList", dateList);
		// ●PVリスト
		List<Integer> pvList = new ArrayList<Integer>();
		for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
			pvList.add(reportDataGraphDTO.getPv());
		}
		model.addAttribute("pvList", pvList);
		// ●UUリスト
		List<Integer> uuList = new ArrayList<Integer>();
		for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
			uuList.add(reportDataGraphDTO.getUu());
		}
		model.addAttribute("uuList", uuList);
		
		// ●レポート表示データ
		ReportDataOverallDTO reportDataOverallDTO = prCompany1023Service.selectReportDataOverall(loginUser.getCompanyId());
		model.addAttribute("reportOverallData", reportDataOverallDTO);
		
		// ●レポート一覧リスト
		List<ReportDataDTO> reportDataDTOList = prCompany1023Service.selectReportData(loginUser.getCompanyId(), 0, 10);
		model.addAttribute("compId", loginUser.getCompanyId());
		model.addAttribute("reportDataList", reportDataDTOList);
		model.addAttribute("startPageCount", 0);
		model.addAttribute("endPageCount", 10);
		model.addAttribute("pageCount", 10);
		model.addAttribute("overallCount", reportDataDTOList.size() != 0 ? reportDataDTOList.get(0).getOverallCount() : 0);
		
		return "pr-company-1023.html";
		
	}
	
	/**
	 * --前、後のレポート一覧画面
	 * 
	 * @param loginUser
	 * @param startPageCount
	 * @param pageCount
	 * @param model
	 * @return　HTML文字列
	 */
	@RequestMapping("/company/report_list/next")
	public String next(@AuthenticationPrincipal CompUserDetails loginUser, int startPageCount, int pageCount, Model model) {
		
		// ●レポートグラフのデータ取得  
		List<ReportDataGraphDTO> reportDataGraphDTOList = prCompany1023Service.selectReportDataGraphDay(loginUser.getCompanyId());
		// ●アクセス日リスト
		List<String> dateList = new ArrayList<String>();
		for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
			dateList.add(reportDataGraphDTO.getAccessTime_string1());
		}
		model.addAttribute("dateList", dateList);
		// ●PVリスト
		List<Integer> pvList = new ArrayList<Integer>();
		for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
			pvList.add(reportDataGraphDTO.getPv());
		}
		model.addAttribute("pvList", pvList);
		// ●UUリスト
		List<Integer> uuList = new ArrayList<Integer>();
		for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
			uuList.add(reportDataGraphDTO.getUu());
		}
		model.addAttribute("uuList", uuList);

		// ●レポート表示データ
		ReportDataOverallDTO reportDataOverallDTO = prCompany1023Service.selectReportDataOverall(loginUser.getCompanyId());
		model.addAttribute("reportOverallData", reportDataOverallDTO);
		
		// ●レポート一覧リスト
		List<ReportDataDTO> reportDataDTOList = prCompany1023Service.selectReportData(loginUser.getCompanyId(), startPageCount * pageCount, pageCount);
		int overallCount = reportDataDTOList.size() != 0 ? reportDataDTOList.get(0).getOverallCount() : 0;
		model.addAttribute("compId", loginUser.getCompanyId());
		model.addAttribute("reportDataList", reportDataDTOList);
		model.addAttribute("startPageCount", startPageCount);
		model.addAttribute("endPageCount", overallCount < startPageCount * pageCount + pageCount ? overallCount : startPageCount * pageCount + pageCount);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("overallCount", overallCount);
		
		return "pr-company-1023.html";
		
	}
	
	/**
	 * --レポートグラフ画面
	 * 
	 * @param loginUser
	 * @param startPageCount
	 * @param pageCount
	 * @param model
	 * @return　HTML文字列
	 */
	@RequestMapping("/company/report_list/graph")
	public String graph(@AuthenticationPrincipal CompUserDetails loginUser, String graphMode, Model model) {
		
		if ("day".equals(graphMode)) {
			// ●レポートグラフのデータ取得  
			List<ReportDataGraphDTO> reportDataGraphDTOList = prCompany1023Service.selectReportDataGraphDay(loginUser.getCompanyId());
			// ●アクセス日リスト
			List<String> dateList = new ArrayList<String>();
			for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
				dateList.add(reportDataGraphDTO.getAccessTime_string1());
			}
			model.addAttribute("dateList", dateList);
			// ●PVリスト
			List<Integer> pvList = new ArrayList<Integer>();
			for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
				pvList.add(reportDataGraphDTO.getPv());
			}
			model.addAttribute("pvList", pvList);
			// ●UUリスト
			List<Integer> uuList = new ArrayList<Integer>();
			for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
				uuList.add(reportDataGraphDTO.getUu());
			}
			model.addAttribute("uuList", uuList);
		} else if ("week".equals(graphMode)) {
			// ●レポートグラフのデータ取得  
			List<ReportDataGraphDTO> reportDataGraphDTOList = prCompany1023Service.selectReportDataGraphWeek(loginUser.getCompanyId());
			// ●アクセス日リスト
			List<String> dateList = new ArrayList<String>();
			for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
				dateList.add(reportDataGraphDTO.getAccessTime_string1());
			}
			model.addAttribute("dateList", dateList);
			// ●PVリスト
			List<Integer> pvList = new ArrayList<Integer>();
			for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
				pvList.add(reportDataGraphDTO.getPv());
			}
			model.addAttribute("pvList", pvList);
			// ●UUリスト
			List<Integer> uuList = new ArrayList<Integer>();
			for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
				uuList.add(reportDataGraphDTO.getUu());
			}
			model.addAttribute("uuList", uuList);
		} else  if ("month".equals(graphMode)) {
			// ●レポートグラフのデータ取得  
			List<ReportDataGraphDTO> reportDataGraphDTOList = prCompany1023Service.selectReportDataGraphMonth(loginUser.getCompanyId());
			// ●アクセス日リスト
			List<String> dateList = new ArrayList<String>();
			for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
				dateList.add(reportDataGraphDTO.getAccessTime_string1());
			}
			model.addAttribute("dateList", dateList);
			// ●PVリスト
			List<Integer> pvList = new ArrayList<Integer>();
			for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
				pvList.add(reportDataGraphDTO.getPv());
			}
			model.addAttribute("pvList", pvList);
			// ●UUリスト
			List<Integer> uuList = new ArrayList<Integer>();
			for (ReportDataGraphDTO reportDataGraphDTO : reportDataGraphDTOList) {
				uuList.add(reportDataGraphDTO.getUu());
			}
			model.addAttribute("uuList", uuList);
		}
		
		return "pr-company-1023-graph.html :: graph";
		
	}

}
