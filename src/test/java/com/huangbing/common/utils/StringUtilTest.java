/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: huangbing-common
 * @Package: com.huangbing.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月8日 下午3:25:57 
 * @version: V1.0   
 */
package com.huangbing.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.huangbing.common.utils.StringUtil;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月8日 下午3:25:57  
 */
public class StringUtilTest {

	/**
	 * Test method for {@link com.huangbing.common.utils.StringUtil#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.StringUtil#randomChineseString()}.
	 */
	@Test
	public void testRandomChineseString() {
		/*
		 * for (int i = 0; i < 10; i++) {
		 * System.out.print(StringUtil.randomChineseString()+",");
		 * 
		 * }
		 */
		
		System.out.println(StringUtil.randomChineseString(100));
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.StringUtil#generateChineseName()}.
	 */
	@Test
	public void testGenerateChineseName() {
		 for (int i = 0; i < 10; i++) {
			 System.out.println(StringUtil.generateChineseName());
			 }
	}

}
