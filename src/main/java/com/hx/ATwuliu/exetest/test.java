package com.hx.ATwuliu.exetest;

import com.hx.ATwuliu.pages.ChurukudanPinZheng;
import com.hx.ATwuliu.pages.CommonPage;
import com.hx.ATwuliu.pages.PlanManage;
import com.hx.ATwuliu.util.Actions;
import com.hx.ATwuliu.util.InitPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Lenovo on 2019/4/11.
 */
public class test {
    public InitPage initPage = new InitPage();
    CommonPage commonPage = initPage.commonPage;
    ChurukudanPinZheng churukudanPinZheng=initPage.churukudanPinZheng;
    PlanManage planManage = initPage.planManage;
    @BeforeTest
    public void beforeTest() {
        Actions.timestamp();    //生成统一时间戳
    }

    //登录
    @DataProvider(name="loginInfo")
    public Object[][] loginInfo() {
        return new Object[][]{
                {"德清出入库管理系统", "zhongxinku", "123456"}
        };
    }
    @Test(priority = 1, groups = {"Common"}, dataProvider = "loginInfo")
    public void login(String expectedTitle,String username, String password) {
        commonPage.login(expectedTitle, username, password);
        commonPage.test();
        churukudanPinZheng.test();
      //  commonPage.accessL3Gouxiaojihua();
      //  planManage.test();
    }
}
