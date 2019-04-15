package com.hx.ATwuliu.exetest;

import java.io.IOException;
import java.lang.*;
import com.hx.ATwuliu.util.*;
import com.hx.ATwuliu.pages.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
//import org.junit.Before;
import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import com.hx.ATwuliu.util.CSVRead;

import static com.hx.ATwuliu.util.CSVRead.getTestData;
import static com.hx.ATwuliu.util.InitPre.driver;
//import static com.hx.ATwuliu.util.ExcelRead.getTestData2;
/**
 * Created by Administrator on 2019/3/29.
 */
public class BusinessManage {

    public InitPage initPage = new InitPage();
    CommonPage commonPage = initPage.commonPage;
    ChurukudanPinZheng churukudanPinZheng=initPage.churukudanPinZheng;

    @BeforeClass
    public void beforeClass() {
        Actions.timestamp();    //生成统一时间戳
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    //读取CSV测试数据
    @DataProvider(name="loginInfo")
        public Object[][] loginInfo() {
        return new Object[][]{
                {"德清出入库管理系统", "zhongxinku", "123456"}
        };
    }
//    public static Object[][] getData() throws IOException {
//        return getTestData("E:\\ATchuruku\\testdata\\BusinessManage.csv");
//    }

    @Test( dataProvider = "loginInfo")
    public void login(String expectedTitle,String username, String password) {
        commonPage.login(expectedTitle,username, password);
    }

    @DataProvider(name="RukuTongzhishu")
    public Object[][] rukuTongzhishu() {
        return new Object[][]{
                {"海绵宝宝", "混合小麦", "100","0p4-保中一"}
        };
    }
    @Test(dataProvider = "RukuTongzhishu")
    public void rukuTongzhishuTest(String customerName,String Pinzhong,String Amount,String Cangwei){
        commonPage.accessL3Rukutongzhishu();
        churukudanPinZheng.addTongzhishu( customerName, Pinzhong, Amount, Cangwei);
        churukudanPinZheng.SubmitTongzhishu();
        commonPage.closeCurrentTab();
    }

    @DataProvider(name="ChukuTongzhishu")
    public Object[][] churkuTongzhishu() {
        return new Object[][]{
                {"海绵宝宝", "混合小麦", "101","0p4-保中一"}
        };
    }
    @Test(dataProvider = "ChukuTongzhishu")
    public void chukuTongzhishuTest(String customerName,String Pinzhong,String Amount,String Cangwei){
        commonPage.accessL3Chukutongzhishu();
        churukudanPinZheng.addTongzhishu( customerName, Pinzhong, Amount, Cangwei);
        churukudanPinZheng.SubmitTongzhishu();
        commonPage.closeCurrentTab();
    }


    @DataProvider(name="Chukutihuodan")
    public Object[][] chukutihuodan() {
        return new Object[][]{
                {"海绵宝宝", "混合小麦", "102","0p4-保中一"}
        };
    }
    @Test(dataProvider = "Chukutihuodan")
    public void chukutihuodanTest(String customerName,String Pinzhong,String Amount,String Cangwei){
        commonPage.accessL3Chukutihuodan();
        churukudanPinZheng.addTongzhishu( customerName, Pinzhong, Amount, Cangwei);
        churukudanPinZheng.SubmitTongzhishu();
        commonPage.closeCurrentTab();
    }
}
