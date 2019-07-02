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
    public int initReTryNum=1;   //初始失败尝试次数
    public int maxReTryNum=2;   //最大失败尝试次数
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(initReTryNum<=maxReTryNum){
            String message="方法<"+iTestResult.getName()+">执行失败，准备开始第"+initReTryNum+"次重试";
            logger.info(message);
            Reporter.setCurrentTestResult(iTestResult);
            Reporter.log(message);
            initReTryNum++;
            return true;
        }
        return false;
    }
}
