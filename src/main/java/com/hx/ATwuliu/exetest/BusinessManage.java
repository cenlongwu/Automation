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

//    //读取CSV测试数据
////    public static Object[][] getData() throws IOException {
////        return getTestData("E:\\ATchuruku\\testdata\\BusinessManage.csv");
////    }



    @DataProvider(name="RukuTongzhishu")
    public Object[][] rurkuTongzhishu() {
        return new Object[][]{
                {"海绵宝宝", "混合小麦", "100","0p4-保中一"}
        };
    }

    /*********测试用例***************************
     1.新增入库通知书
     2.查询入库通知书
     3.提交入库通知书
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
     1.新增出库通知书
     2.查询出库通知书
     3.提交出库通知书
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
     1.新增出库提货单
     2.查询出库提货单
     3.提交出库提货单
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
                {"购销201904161102", "销售", "粳稻谷", "二等", "中央储备", "其他储备粮", "2019", "0p7-保中一", "45"}
        };
    }
    /*********测试用例***************************
     1、新增购销计划
     2、提交审核购销计划
     3、购销计划条件查询
     ********************************************/
    @Test(dataProvider = "Gouxiaojihua")
    public void gouxiaojihuaTest(String planWenhao, String yewuType, String pinzhong, String dengji, String kucunXingzhi_1,
                                 String kucunXingzhi_2, String getYear, String cangwei, String number){
        commonPage.accessL3Gouxiaojihua();
        planManage.addGouxiaojihua(planWenhao, yewuType, pinzhong, dengji, kucunXingzhi_1, kucunXingzhi_2, getYear, cangwei, number);
        planManage.submitGouxiaojihua();
        commonPage.closeCurrentTab();
    }

    @DataProvider(name="Lunhuanjihua")
    public Object[][] lunhuanjihua() {
        return new Object[][]{
                {"轮换201904161100", "粳稻谷", "三等", "商品粮", "纯贸易商品粮", "轮出", "0p6-保中一", "4.8"}
        };
    }
    /********测试用例***************************
     1、新增轮换计划
     2、提交审核轮换计划
     3、轮换计划条件查询
     *******************************************/
    @Test(dataProvider = "Lunhuanjihua")
    public void lunhuanjihuaTest(String planWenhao, String pinzhong, String dengji, String kucunXingzhi_1,
                                 String kucunXingzhi_2, String yewuType, String cangwei, String number){
        commonPage.accessL3Lunhuanjihua();
        planManage.addLunhuanjihua(planWenhao, pinzhong, dengji, kucunXingzhi_1, kucunXingzhi_2, yewuType, cangwei, number);
        planManage.submitLunhuanjihua();
        commonPage.closeCurrentTab();
    }

    @DataProvider(name="Diaoruiaochujihua")
    public Object[][] diaorudiaochujihua() {
        return new Object[][]{
                {"调入调出201904161100", "调入", "北京", "粳稻谷", "四等", "政策性储存", "国家临时存储", "2018", "C01-称重中", "88.152"}
        };
    }
    /********测试用例***************************
     1、新增调入调出计划
     2、提交审核调入调出计划
     3、调入调出计划条件查询
     *******************************************/
    @Test(dataProvider = "Diaorudiaochujihua")
    public void diaorudiaochujihuaTest(String planWenhao, String yewuType, String liangshiQuxiang, String pinzhong, String dengji, String kucunXingzhi_1,
                                       String kucunXingzhi_2, String getYear, String cangwei, String number){
        commonPage.accessL3Diaorudiaochujihua();
        planManage.addDiaorudiaochujihua(planWenhao, yewuType, liangshiQuxiang, pinzhong, dengji, kucunXingzhi_1, kucunXingzhi_2, getYear, cangwei, number);
        planManage.submitDiaorudiaochujihua();
        commonPage.closeCurrentTab();
    }

    @DataProvider(name="Hetongguanli")
    public Object[][] hetongguanli() {
        return new Object[][]{
                {"合同201904161102", "中央储备", "其他储备粮", "收购合同","海绵宝宝"}
        };
    }
    /********测试用例***************************
     *  1.新增合同管理
     *  2.提交合同管理
     *******************************************/
    @Test(dataProvider = "Hetongguanli")
    public void hetongguanliTest(String hetonghao,String kucunXingzhi_1,String kucunXingzhi_2,String hetong,String kehumingcheng){
        commonPage.accessL3Hetongguanli();
        hetongManage.HetongManage(hetonghao, kucunXingzhi_1, kucunXingzhi_2,hetong , kehumingcheng);
        hetongManage.submitHetongGuali();
        commonPage.closeCurrentTab();
    }


}
