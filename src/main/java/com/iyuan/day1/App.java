package com.iyuan.day1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springall.xml");
		TestService testService = (TestService) context.getBean("testService");
		testService.say();
		TestDao testDao = (TestDao) context.getBean("testDao");
		testDao.say();
	}
}
