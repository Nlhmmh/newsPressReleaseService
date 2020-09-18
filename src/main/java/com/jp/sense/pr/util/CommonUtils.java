package com.jp.sense.pr.util;

import java.util.Arrays;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  共通処理を記述するクラス
 *  共通メソッドを追加する
 */
public class CommonUtils {
    
	private static Logger logger = LoggerFactory.getLogger(CommonUtils.class);
	
	/**
	 *	文字列のNull又は空チェック処理
	 * 
	 * @param value
	 * @return 確認状態
	 */
	public static boolean checkNullOrEmpty(String value) {
		if ("".equals(value)|| value == null) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 *	氏名分割処理
	 * 
	 * @param fullname
	 * @return 分割したリスト
	 */
	public static List<String> splitNameSeiMeiBySpace(String fullname) {
		String[] nameArray = {"", ""};
		
		fullname = fullname.trim();
		if (checkNullOrEmpty(fullname) && fullname.contains(" ")) {
			nameArray = fullname.split(" ");
		}
		
		return Arrays.asList(nameArray);
	}
	
	/**
	 *	電話番号分割処理
	 *
	 * @param phoneNo
	 * @return 分割したリスト
	 */
	public static List<String> splitPhoneNo(String phoneNo) {
		String[] phoneNoArray = {"", "", ""};
		
		if (checkNullOrEmpty(phoneNo)) {
			if (phoneNo.length() == 10) {
				phoneNoArray[0] = phoneNo.substring(0, 2);
				phoneNoArray[1] = phoneNo.substring(2, 6);
				phoneNoArray[2] = phoneNo.substring(6, 10);
			} else if (phoneNo.length() == 11) {
				phoneNoArray[0] = phoneNo.substring(0, 3);
				phoneNoArray[1] = phoneNo.substring(3, 7);
				phoneNoArray[2] = phoneNo.substring(7, 11);
			}
		}
		
		return Arrays.asList(phoneNoArray);
	}
	
	/**
	 *	FAX分割処理
	 *
	 * @param faxNo
	 * @return 分割したリスト
	 */
	public static List<String> splitFaxNo(String faxNo) {
		String[] faxNoArray = {"", "", ""};
		
		if (checkNullOrEmpty(faxNo)) {
			if (faxNo.length() == 10) {
				faxNoArray[0] = faxNo.substring(0, 2);
				faxNoArray[1] = faxNo.substring(2, 6);
				faxNoArray[2] = faxNo.substring(6, 10);
			} else if (faxNo.length() == 11) {
				faxNoArray[0] = faxNo.substring(0, 3);
				faxNoArray[1] = faxNo.substring(3, 7);
				faxNoArray[2] = faxNo.substring(7, 11);
			}
		}
		
		return Arrays.asList(faxNoArray);
	}
	
	/**
	 * 文字列がNullの場合は空文字列で返還する。
	 * 
	 */
	public static String null2Blank (String target) {
		return target != null ? target : "" ;
	}
	
	/**
	 * 文字列を指定したフォーマットでDateに変換。
	 * 変換できない場合はNullを返す。
	 */
	public static Date str2DateByFormat (String target,String format) {
		
		if ("".equals(null2Blank(target))) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date;
		try {
			date = sdf.parse(target);
			return date;
		} catch (ParseException e) {
			return null;
		}
	}
	
	/**
	 * 文字列をIntegerに変換。
	 * 変換できない場合はNullを返す。
	 */
	public static Integer str2Integer (String target) {
		
		if ("".equals(null2Blank(target))) {
			return null;
		}
		
		Integer lnt;
		try {
			lnt = Integer.parseInt(target);
			return lnt;
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	/**
	 * Stringをintに変更処理
	 * 
	 * @param stringToConvert
	 * @return int
	 */
	public static int str2Int (String stringToConvert) {
		try {
			if (checkNullOrEmpty(stringToConvert)) {
				return Integer.valueOf(stringToConvert);
			} else {
				return 0;
			}
		} catch (NumberFormatException e) {
			logger.error("パラメータ一が数字ではありません。クラス名　：　" + "CommonUtils");
			return 0;
		}
	}
}