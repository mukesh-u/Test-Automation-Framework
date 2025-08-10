package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.constants.Env;
import com.utility.JSONUtility;

public class MyRetryAnalyzer implements IRetryAnalyzer{

	private static final int MAX_NUMBER_OF_ATTEMPTS=JSONUtility.readJSON(Env.QA).getMAX_NUMBER_OF_ATTEMPTS();
	private int current_attempt=1;
	@Override
	public boolean retry(ITestResult result) {
		
		if (current_attempt<=MAX_NUMBER_OF_ATTEMPTS) {
			current_attempt++;
			return true;
		}
		return false;
	}
	
}
