package com.hx.ATwuliu.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by wucenlong on 2017/9/13.
 */
public class InitPre {
    public static WebDriver driver;
    private final static String URL= "http://woliuadmin.woliutech.cn:8781/#/user/login";
    //private final static String URL= "http:www.baidu.com";

    public InitPre() {
        if (driver == null) {
            String chromePath = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
            String chromeDriverPath=System.getProperty("user.dir")+"\\chromedriver.exe";
//        String IEPath="C:\\Program Files\\Internet Explorer\\iexplore.exe";
//        String IEDriverPath="D:\\HXAutomation\\IEDriverServer.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--ignore-certificate-errors");
            chromeOptions.addArguments("disable-infobars");
            chromeOptions.addArguments();
            driver = new ChromeDriver(chromeOptions);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //隐式等待5秒
            driver.navigate().to(URL);
        }
    }



}
