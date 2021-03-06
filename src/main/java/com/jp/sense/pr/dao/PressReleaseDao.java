package com.jp.sense.pr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jp.sense.pr.model.dto.PressReleaseListDTO;
import com.jp.sense.pr.model.dto.PressReleaseNewDTO;
import com.jp.sense.pr.model.dto.ReportDataDTO;
import com.jp.sense.pr.model.dto.ReportDataGraphDTO;
import com.jp.sense.pr.model.dto.ReportDataOverallDTO;
import com.jp.sense.pr.model.entity.PressRelease;

public interface PressReleaseDao {

	// ---------- //

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table press_release
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table press_release
	 * @mbg.generated
	 */
	int insert(PressRelease record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table press_release
	 * @mbg.generated
	 */
	int insertSelective(PressRelease record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table press_release
	 * @mbg.generated
	 */
	PressRelease selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table press_release
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(PressRelease record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table press_release
	 * @mbg.generated
	 */
	int updateByPrimaryKey(PressRelease record);

	/**
	 * --プレスリリースを取得する
	 * 
	 * @author ネィ
	 */
	List<PressRelease> selectAll();
	
	/**
	 * --新着プレスリリースを取得する
	 * 
	 * @author ネィ
	 */
	List<PressReleaseNewDTO> selectPRListNew();
	
	/**
	 * --いま話題プレスリリースを取得する
	 * 
	 * @author ネィ
	 */
	List<PressReleaseNewDTO> selectPRListImaWadai(Integer count);
	
	/**
	 * --今日プレスリリースを取得する
	 * 
	 * @author ネィ
	 */
	List<PressReleaseNewDTO> selectPRListKyou(Integer count);
	
	/**
	 * --今週プレスリリースを取得する
	 * 
	 * @author ネィ
	 */
	List<PressReleaseNewDTO> selectPRListKonShuu(Integer count);
	
	/**
	 * --今月プレスリリースを取得する
	 * 
	 * @author ネィ
	 */
	List<PressReleaseNewDTO> selectPRListKonGatsu(Integer count);
	
	/**
	 * --企業の分析データを取得する
	 * 
	 * @author ネィ
	 */
	ReportDataOverallDTO selectReportDataOverall(Integer compId);
	
	/**
	 * --企業の分析データ一覧を取得する
	 * 
	 * @author ネィ
	 */
	List<ReportDataDTO> selectReportData(@Param("compId") Integer compId, @Param("pageStartCount") Integer pageStartCount, @Param("pageCount") Integer pageCount);
	
	/**
	 * --グラフのため、企業の分析データ一覧を取得する
	 * 
	 * @author ネィ
	 */
	List<ReportDataGraphDTO> selectReportDataGraphDay(@Param("compId") Integer compId);
	
	/**
	 * --グラフのため、企業の分析データ一覧を取得する
	 * 
	 * @author ネィ
	 */
	List<ReportDataGraphDTO> selectReportDataGraphWeek(@Param("compId") Integer compId);
	
	/**
	 * --グラフのため、企業の分析データ一覧を取得する
	 * 
	 * @author ネィ
	 */
	List<ReportDataGraphDTO> selectReportDataGraphMonth(@Param("compId") Integer compId);

	/**
	 * --pr-home-1017 プレスリリース画像取得
	 * 
	 * @author テイ
	 */
	List<PressReleaseListDTO> selectPrImage(Integer cid);
	
	/**
	 * --pr-home-1017 プレスリリース一覧取得
	 * 
	 * @author テイ
	 */
	List<PressReleaseListDTO> selectPrList(Integer cid);

	/**
	 * --pr-home-1017 検索ボタン押下
	 * 
	 * @author テイ
	 */
	List<PressReleaseListDTO> pushKensakuBtn(String keyword, Integer cid);
	
	/**
	 * --pr-home-1017 もっと見るボタン押下
	 * 
	 * @author テイ
	 */
	List<PressReleaseListDTO> selectPrListMore(Integer cid,Integer count);
	
}