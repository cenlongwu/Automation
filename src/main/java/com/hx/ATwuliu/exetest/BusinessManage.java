package com.hx.ATwuliu.exetest;


import java.lang.*;
import com.hx.ATwuliu.util.*;
import com.hx.ATwuliu.pages.*;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.Reporter;
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
    ChurukudanPinZheng churukudanPinZheng = initPage.churukudanPinZheng;
    PlanManage planManage = initPage.planManage;
    HetongManage hetongManage = initPage.hetongManage;

    @BeforeClass
    public void beforeClass() {
        Actions.timestamp();    //生成统一时间戳
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    //读取CSV测试数据
    //    public static Object[][] getData() throws IOException {
//        return getTestData("E:\\ATchuruku\\testdata\\BusinessManage.csv");
//    }

    @DataProvider(name="RukuTongzhishu")
    public Object[][] rurkuTongzhishu() {
        return new Object[][]{
                {"海绵宝宝", "混合小麦", "100","0p4-保中一"}
        };
    }

    /*********测试用例***************************
     *  1.新增入库通知书
     *  2.提交入库通知书
     ********************************************/

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
    /*********测试用例***************************
     *  1.新增出库通知书
     *  2.提交出库通知书
     ********************************************/
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
    /*********测试用例***************************
     *  1.新增出库提货单
     *  2.提交出库提货单
     ********************************************/
    @Test(dataProvider = "Chukutihuodan")
    public void chukutihuodanTest(String customerName,String Pinzhong,String Amount,String Cangwei){
        commonPage.accessL3Chukutihuodan();
        churukudanPinZheng.addTongzhishu( customerName, Pinzhong, Amount, Cangwei);
        churukudanPinZheng.SubmitTongzhishu();
        commonPage.closeCurrentTab();
    }

    @DataProvider(name="Gouxiaojihua")
    public Object[][] gouxiaojihua() {
        return new Object[][]{
                {"购销201904161102", "", "",""}
        };
    }


    @Test(dataProvider = "Gouxiaojihua")
    public void gouxiaojihuaTest(String planWenhao, String yewuType, String pinzhong, String dengji, String kucunXingzhi_1,
                                 String kucunXingzhi_2, String getYear, String cangwei, String number){
        commonPage.accessL3Gouxiaojihua();
        planManage.addGouxiaojiahua(planWenhao, yewuType, pinzhong, dengji, kucunXingzhi_1, kucunXingzhi_2, getYear, cangwei, number);
        planManage.submitGouxiaojihua();
        commonPage.closeCurrentTab();
    }
}
