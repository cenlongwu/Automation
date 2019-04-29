package com.hx.ATwuliu.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

/**
 * Created by Administrator on 2019/4/22.
 */
public class OverrideIReTry implements IRetryAnalyzer {
    public static Logger logger=Logger.getLogger(OverrideIReTry.class);
    public int initReTryNum=1;
    public int maxReTryNum=1;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(initReTryNum<=maxReTryNum){
            String message="方法<"+iTestResult.getName()+">执行失败，重试第"+initReTryNum+"次";
            logger.info(message);
            Reporter.setCurrentTestResult(iTestResult);
            Reporter.log(message);
            initReTryNum++;
            return true;
        }
        return false;
    }
}
