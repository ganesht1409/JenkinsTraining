package com.jenkins.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loggerexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=LogManager.getLogger(Loggerexample.class);
		
		System.out.println("Hello world");

		logger.error("This is error");
		logger.warn("This is warning");
		logger.fatal("This is fatal");

	}

}
