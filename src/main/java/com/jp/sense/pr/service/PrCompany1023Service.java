package com.jp.sense.pr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.sense.pr.dao.PressReleaseDao;
import com.jp.sense.pr.model.dto.ReportDataDTO;
import com.jp.sense.pr.model.dto.ReportDataGraphDTO;
import com.jp.sense.pr.model.dto.ReportDataOverallDTO;

/**
 * --レポート一覧
 * --サービス
 * 
 * @author ネィ
 *
 */
@Service
@Transactional
public class PrCompany1023Service {
	
	@Autowired
	PressReleaseDao pressReleaseDao;
	
	/**
	 * --企業の分析データを取得する
	 * 
	 * @param compId
	 * @return　分析データ
	 */
	public ReportDataOverallDTO selectReportDataOverall(int compId) {
		return pressReleaseDao.selectReportDataOverall(compId);
	}
	
	/**
	 * --企業の分析データ一覧を取得する
	 * 
	 * @param compId
	 * @param startPageCount
	 * @param pageCount
	 * @return　分析データ一覧
	 */
	public List<ReportDataDTO> selectReportData(int compId, int startPageCount, int pageCount) {
		List<ReportDataDTO> reportDataDTOList = pressReleaseDao.selectReportData(compId, startPageCount, pageCount);
		for (ReportDataDTO reportDataDTO : reportDataDTOList) {
			double sumOfAcessPcPhoneTablet = reportDataDTO.getAccess_pc() + reportDataDTO.getAccess_phone() + reportDataDTO.getAccess_tablet();
			if (reportDataDTO.getAccess_pc() != 0) {
				reportDataDTO.setAccess_pc_per( Double.parseDouble(String.format("%.2f",((reportDataDTO.getAccess_pc() / sumOfAcessPcPhoneTablet) * 100.0))) );
			}
			if (reportDataDTO.getAccess_phone() != 0) {
				reportDataDTO.setAccess_phone_per( Double.parseDouble(String.format("%.2f",((reportDataDTO.getAccess_phone() / sumOfAcessPcPhoneTablet) * 100.0))) );
			}
			if (reportDataDTO.getAccess_tablet() != 0) {
				reportDataDTO.setAccess_tablet_per( Double.parseDouble(String.format("%.2f",((reportDataDTO.getAccess_tablet() / sumOfAcessPcPhoneTablet) * 100.0))) );
			}
		}
		return reportDataDTOList;
	}
	
	/**
	 * --日付ごとグラフのため、企業の分析データ一覧を取得する
	 * 
	 * @param compId
	 * @return　分析データ
	 */
	public List<ReportDataGraphDTO> selectReportDataGraphDay(int compId) {
		return pressReleaseDao.selectReportDataGraphDay(compId);
	}
	
	/**
	 * --週ごとグラフのため、企業の分析データ一覧を取得する
	 * 
	 * @param compId
	 * @return　分析データ
	 */
	public List<ReportDataGraphDTO> selectReportDataGraphWeek(int compId) {
		return pressReleaseDao.selectReportDataGraphWeek(compId);
	}
	
	/**
	 * --月ごとグラフのため、企業の分析データ一覧を取得する
	 * 
	 * @param compId
	 * @return　分析データ
	 */
	public List<ReportDataGraphDTO> selectReportDataGraphMonth(int compId) {
		return pressReleaseDao.selectReportDataGraphMonth(compId);
	}

}
