package com.wsx.ones.common.util;

import java.util.UUID;

import com.wsx.ones.finalstr.common.CommonFinalUtil;

/**
 * 
 * @author wangshuaixin
 *
 */
public class UUIDUtils {

	/**
	 * 
	 * @return
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replace(CommonFinalUtil.ENGLISH_SPIT, CommonFinalUtil.STRING_EMPTY);
	}
	
}
