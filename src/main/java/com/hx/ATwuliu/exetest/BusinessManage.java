package com.hx.ATwuliu.exetest;

import java.io.IOException;
import java.lang.*;
import com.hx.ATwuliu.util.*;
import com.hx.ATwuliu.pages.*;
import org.testng.annotations.*;
//import org.junit.Before;
import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import com.hx.ATwuliu.util.CSVRead;

import static com.hx.ATwuliu.util.CSVRead.getTestData;
//import static com.hx.ATwuliu.util.ExcelRead.getTestData2;
/**
 * Created by Administrator on 2019/3/29.
 */
public class BusinessManage {

    public InitPage initPage = new InitPage();
    CommonPage commonPage = initPage.commonPage;

    @BeforeTest
    public void beforeTest() {
        Actions.timestamp();    //生成统一时间戳
    }

    //读取CSV测试数据
    @DataProvider(name="loginInfo")
//        public Object[][] loginInfo() {
//        return new Object[][]{
//                {"德清出入库管理系统", "zhongxinku", "123456"}
//        };
//    }
    public static Object[][] getData() throws IOException {
        return getTestData("E:\\ATchuruku\\testdata\\BusinessManage.csv");
    }

    @Test(priority = 1, groups = {"Common"}, dataProvider = "loginInfo")
    public void login(String ExpectedTitle,String username, String password) {
        Actions.delay(10000);
        Actions.assertTitle(ExpectedTitle);
        commonPage.login(username, password);
    }

}
