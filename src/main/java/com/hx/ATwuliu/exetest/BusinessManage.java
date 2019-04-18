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
    ZhinengChuruku zhinengChuruku=initPage.zhinengChuruku;


    @BeforeTest
    public void beforeTest() {
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

    @Test(priority = 1, groups = {"Common1"}, dataProvider = "loginInfo")
    public void login(String expectedTitle,String username, String password) {
        commonPage.login(expectedTitle,username, password);
    }


    @DataProvider(name="RukuTongzhishu")
    public Object[][] rukuTongzhishu() {
        return new Object[][]{
                {"海绵宝宝", "混合小麦", "5","0p5-保中一"}
        };
    }

    /*********测试用例***************************
     *  1.新增入库通知书
     *  2.提交入库通知书
     ********************************************/
    @Test(priority = 2, groups = {"Common"},dataProvider = "RukuTongzhishu")
    public void rukuTongzhishuTest(String customerName,String Pinzhong,String Amount,String Cangwei){
        commonPage.accessL3Rukutongzhishu();
        churukudanPinZheng.addTongzhishu( customerName, Pinzhong, Amount, Cangwei);
        churukudanPinZheng.SubmitTongzhishu();
        commonPage.closeCurrentTab();
    }

    @DataProvider(name="ChukuTongzhishu")
    public Object[][] churkuTongzhishu() {
        return new Object[][]{
                {"海绵宝宝", "混合小麦", "6","0p5-保中一"}
        };
    }

    /*********测试用例***************************
     *  1.新增出库通知书
     *  2.提交出库通知书
     ********************************************/
    @Test(priority = 3, groups = {"Common"},dataProvider = "ChukuTongzhishu")
    public void chukuTongzhishuTest(String customerName,String Pinzhong,String Amount,String Cangwei){
        commonPage.accessL3Chukutongzhishu();
        churukudanPinZheng.addTongzhishu( customerName, Pinzhong, Amount, Cangwei);
        churukudanPinZheng.SubmitTongzhishu();
        commonPage.closeCurrentTab();
    }


    @DataProvider(name="Chukutihuodan")
    public Object[][] chukutihuodan() {
        return new Object[][]{
                {"海绵宝宝", "混合小麦", "7","0p5-保中一"}
        };
    }

    /*********测试用例***************************
     *  1.新增出库提货单
     *  2.提交出库提货单
     ********************************************/
    @Test(priority = 4, groups = {"Common"},dataProvider = "Chukutihuodan")
    public void chukutihuodanTest(String customerName,String Pinzhong,String Amount,String Cangwei){
        commonPage.accessL3Chukutihuodan();
        churukudanPinZheng.addTongzhishu( customerName, Pinzhong, Amount, Cangwei);
        churukudanPinZheng.SubmitTongzhishu();
        commonPage.closeCurrentTab();
    }

    @DataProvider(name="DengjiZhika")
    public Object[][] dengjiZhika() {
        return new Object[][]{
                {"LS", "浙G","小黄huang","330724200012017789","德清粮食公司（演示）"}
        };
    }

    /*********测试用例***************************
     *  1.添加出库登记
     *  2.调度管理
     ********************************************/
    @Test(priority = 5, groups = {"Common"},dataProvider = "DengjiZhika")
    public void dengjiZhika(String idcardnum,String platenum,String chengyunren,String shenfenzheng,String Kehuming) {
        commonPage.accessL2DengjiManage();
        /*dengjiManage.rukuDengji();
        dengjiManage.dengjiZhika(idcardnum, platenum,chengyunren, shenfenzheng);*/
        zhinengChuruku.chukuDengji();
        zhinengChuruku.dengjiZhika(idcardnum, platenum,chengyunren, shenfenzheng);
        commonPage.closeCurrentTab();
        commonPage.accessL2DiaoduManage();
        zhinengChuruku.diaoduGuanli(Kehuming);
        commonPage.closeCurrentTab();
    }


}
