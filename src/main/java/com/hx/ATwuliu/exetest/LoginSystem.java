package com.hx.ATwuliu.exetest;

import com.hx.ATwuliu.pages.CommonPage;
import com.hx.ATwuliu.util.InitPage;
import com.hx.ATwuliu.util.InitPre;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



/**
 * Created by Administrator on 2019/4/15.
 */
public class LoginSystem {

    public InitPage initPage = new InitPage();
    CommonPage commonPage = initPage.commonPage;


    @DataProvider(name="loginInfo")
    protected Object[][] loginInfo() {
        return new Object[][]{
                {"德清出入库管理系统", "zhongxinku", "123456"}
        };
    }

    @Test(dataProvider = "loginInfo")
    public void login(String expectedTitle,String username, String password) {
        commonPage.login(expectedTitle,username, password);
    }


}
