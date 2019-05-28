package com.hx.ATwuliu.exetest;

import com.hx.ATwuliu.pages.*;
import com.hx.ATwuliu.util.Actions;
import com.hx.ATwuliu.util.InitPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/4/30.0000
 */
public class ZhinengChurukuM {

    public InitPage initPage = new InitPage();
    CommonPage commonPage=initPage.commonPage;
    ZhinengChuruku zhinengChuruku =initPage.zhinengChuruku;

    @BeforeClass
    public void beforeClass() {
        Actions.timestampMM();    //生成统一时间戳
        Actions.timestampHH();
        Actions.timestampYYYY();
    }

    @DataProvider(name="RukuDengji")
    public Object[][] rukuDengjiTest() {
        return new Object[][]{
                {"粮仓入库","LS", "浙G","sx","330724200012017789"}
        };
    }

    /*********测试用例***************************
     1、新增入库入门登记
     ********************************************/
    @Test(dataProvider = "RukuDengji")
    public void rukuDengjiTest(String dengjiType,String idcardnum,String platenum,String chengyunren,String shenfenzheng) {
        commonPage.accessL2DengjiManage();
        zhinengChuruku.dengjiZhika(dengjiType,idcardnum, platenum,chengyunren, shenfenzheng);
        commonPage.closeCurrentTab();
    }


    @DataProvider(name="RukuDiaodu")
    public Object[][] rukuDiaoduTest() {
        return new Object[][]{
                {"海绵宝宝"},
        };
    }

    /******************************************************
     1、调度管理列表数据查询
     2、调度分配
     * ***************************************************/
    @Test(dataProvider = "RukuDiaodu")
    public void rukuDiaoduTest(String kehuming) {
        commonPage.accessL2DiaoduManage();
        zhinengChuruku.diaoduGuanli(kehuming);
        commonPage.closeCurrentTab();

    }

    @DataProvider(name="ChukuDengji")
    public Object[][] chukuDengjiTest() {
        return new Object[][]{
                {"粮仓出库","LS", "浙G","sx","330724200012017789"}
        };
    }

    /*********测试用例***************************
     1、新增出库入门登记
     ********************************************/
    @Test(dataProvider = "ChukuDengji")
    public void chukuDengjiTest(String dengjiType,String idcardnum,String platenum,String chengyunren,String shenfenzheng) {
        commonPage.accessL2DengjiManage();
        zhinengChuruku.dengjiZhika(dengjiType,idcardnum, platenum,chengyunren, shenfenzheng);
        commonPage.closeCurrentTab();
    }


    @DataProvider(name="ChukuDiaodu")
    public Object[][] chukuDiaoduTest() {
        return new Object[][]{
                {"德清粮食公司（演示）"},
        };
    }

    /******************************************************
     1、调度管理列表数据查询
     2、调度分配
     * ***************************************************/
    @Test(dataProvider = "ChukuDiaodu")
    public void chukuDiaoduTest(String kehuming) {
        commonPage.accessL2DiaoduManage();
        zhinengChuruku.diaoduGuanli(kehuming);
        commonPage.closeCurrentTab();

    }


    @DataProvider(name="RukudanLuru")
    public Object[][] rukudanluru() {
        return new Object[][]{
                {}
        };
    }
    /********测试用例***************************
     1、新增新增入库单
     2、入库单列表条件查询
     3、入库单提交审核
     *******************************************/
    @Test(dataProvider = "RukudanLuru")
    public void rukudanluruTest(String kehuName, String kucunXingzhi_1, String kucunXingzhi_2, String chandi,
                                String jianchaYijian, String maozhong, String pizhong, String cangfang){
        commonPage.accessL3RukudanLuru();
        String danjuBianhao = zhinengChuruku.addRukudanLuru(kehuName, kucunXingzhi_1, kucunXingzhi_2, chandi,jianchaYijian, maozhong, pizhong, cangfang);
        zhinengChuruku.submitRukudanLuru(danjuBianhao);
        commonPage.closeCurrentTab();
    }

    @DataProvider(name="ChukudanLuru")
    public Object[][] chukudanluru() {
        return new Object[][]{
                {}
        };
    }
    /********测试用例***************************
     1、新增新增入库单
     2、入库单列表条件查询
     3、入库单提交审核
     *******************************************/
    @Test(dataProvider = "ChukudanLuru")
    public void chukudanluruTest(String kehuName, String chandi, String maozhong, String pizhong, String cangfang){
        commonPage.accessL3ChukudanLuru();
        String danjuBianhao = zhinengChuruku.addChukudanLuru(kehuName, chandi, maozhong, pizhong, cangfang);
        zhinengChuruku.submitChukudanLuru(danjuBianhao);
        commonPage.closeCurrentTab();
    }


    @DataProvider(name="RukudanGuanli")
    public Object[][] rukudanguanli() {
        return new Object[][]{
                {}
        };
    }
    /********测试用例***************************
     1、入库单列表数据查询
     2、入库单数据调整
     3、入库单作废
     *******************************************/
    @Test(dataProvider = "RukudanGuanli")
    public void rukudanguanliTest(String cardID, String kouliang){
        commonPage.accessL3RukudanManage();
        zhinengChuruku.updateRukudanGuanli(cardID, kouliang);
        zhinengChuruku.deleteRukudanGuanli();
        commonPage.closeCurrentTab();
    }


    @DataProvider(name="ChukudanGuanli")
    public Object[][] chukudanguanli() {
        return new Object[][]{
                {}
        };
    }
    /********测试用例***************************
     1、出库单列表数据查询
     2、出库单数据调整
     3、出库单作废
     *******************************************/
    @Test(dataProvider = "ChukudanGuanli")
    public void chukudanguanliTest(String cardID, String kouliang){
        commonPage.accessL3ChukudanManage();
        zhinengChuruku.updateChukudanGuanli(cardID, kouliang);
        zhinengChuruku.deleteChukudanGuanli();
        commonPage.closeCurrentTab();
    }
}
