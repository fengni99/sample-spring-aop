/**
 * Copyright (c) 2016 Baozun All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Baozun.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Baozun.
 *
 * BAOZUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE, OR NON-INFRINGEMENT. BAOZUN SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
 * THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */
package com.discovery.darchrow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.discovery.darchrow.service.HelloWorld;

public class TestAop {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = 
	            new ClassPathXmlApplicationContext("spring-aop.xml");
		HelloWorld hwA =(HelloWorld)ctx.getBean("helloWorldAImpl");
		HelloWorld hwB =(HelloWorld)ctx.getBean("helloWorldBImpl");
		hwA.printHello();
		hwA.doPrint();
		System.out.println("-----------");
		hwB.printHello();
		hwB.doPrint();
	}
}
