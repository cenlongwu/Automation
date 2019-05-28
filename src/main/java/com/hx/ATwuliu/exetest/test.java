package com.hx.ATwuliu.exetest;

import com.hx.ATwuliu.pages.ChurukudanPinZheng;
import com.hx.ATwuliu.pages.CommonPage;
import com.hx.ATwuliu.pages.PlanManage;
import com.hx.ATwuliu.util.Actions;
import com.hx.ATwuliu.util.InitPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.script.ScriptException;

/**
 * Created by Lenovo on 2019/4/11.
 */
public class test {
    //111
    //XXX
    public InitPage initPage = new InitPage();
    CommonPage commonPage = initPage.commonPage;
    ChurukudanPinZheng churukudanPinZheng=initPage.churukudanPinZheng;
    PlanManage planManage = initPage.planManage;
    @BeforeTest
    public void beforeTest() {
        //Actions.timestamp();    //生成统一时间戳
    }

    //登录
    @DataProvider(name="loginInfo")
    public Object[][] loginInfo() {
        return new Object[][]{
                {"德清出入库管理系统", "zhongxinku", "123456"}
        };
    }
    @Test(priority = 1, groups = {"Common"}, dataProvider = "loginInfo")
    public void login(String expectedTitle,String username, String password) throws ScriptException {
        commonPage.login(expectedTitle, username, password);
        Actions.delay(3000);
        commonPage.fetchTabName();
        // commonPage.test();
      //  churukudanPinZheng.test();
      //  commonPage.accessL3Gouxiaojihua();
      //  planManage.test();
    }

    @DataProvider(name="Gouxiaojihua")
    public Object[][] gouxiaojihua() {
        return new Object[][]{
                {"购销201904191637", "销售", "粳稻谷", "二等", "中央储备", "其他储备粮", "2019", "0p7-保中一", "45"}
        };
    }
    /*********测试用例***************************
     *  1.新增购销计划
     *  2.提交购销计划
     ********************************************/
    @Test(priority = 2, groups = {"Common"}, dataProvider = "Gouxiaojihua")
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
                {"轮换201904191637", "粳稻谷", "三等", "商品粮", "纯贸易商品粮", "轮出", "0p6-保中一", "4.8"}
        };
    }
    /*********测试用例***************************
     *  1.新增轮换计划
     *  2.提交轮换计划
     ********************************************/
    @Test(priority = 3, groups = {"Common"}, dataProvider = "Lunhuanjihua")
    public void lunhuanjihuaTest(String planWenhao, String pinzhong, String dengji, String kucunXingzhi_1,
                                 String kucunXingzhi_2, String yewuType, String cangwei, String number){
        commonPage.accessL3Lunhuanjihua();
        planManage.addLunhuanjihua(planWenhao, pinzhong, dengji, kucunXingzhi_1, kucunXingzhi_2, yewuType, cangwei, number);
        planManage.submitLunhuanjihua();
        commonPage.closeCurrentTab();
    }

    @DataProvider(name="Diaorudiaochujihua")
    public Object[][] diaorudiaochujihua() {
        return new Object[][]{
                {"调入调出201904191637", "调入", "北京", "粳稻谷", "四等", "政策性储存", "国家临时存储", "2018", "C01-称重中", "88.152"}
        };
    }
    /*********测试用例***************************
     *  1.新增调入调出计划
     *  2.提交调入调出计划
     ********************************************/
    @Test(priority = 4, groups = {"Common"}, dataProvider = "Diaorudiaochujihua")
    public void diaorudiaochujihuaTest(String planWenhao, String yewuType, String liangshiQuxiang, String pinzhong, String dengji, String kucunXingzhi_1,
                                       String kucunXingzhi_2, String getYear, String cangwei, String number){
        commonPage.accessL3Diaorudiaochujihua();
        planManage.addDiaorudiaochujihua(planWenhao, yewuType, liangshiQuxiang, pinzhong, dengji, kucunXingzhi_1, kucunXingzhi_2, getYear, cangwei, number);
        planManage.submitDiaorudiaochujihua();
        commonPage.closeCurrentTab();
    }

}
