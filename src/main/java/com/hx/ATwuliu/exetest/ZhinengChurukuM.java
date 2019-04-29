package com.hx.ATwuliu.exetest;

import com.hx.ATwuliu.pages.*;
import com.hx.ATwuliu.util.InitPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/4/22.
 */
public class ZhinengChurukuM {

    public InitPage initPage = new InitPage();
    CommonPage commonPage=initPage.commonPage;
    ZhinengChuruku zhinengChuruku =initPage.zhinengChuruku;


    @DataProvider(name="RukuDengji")
    public Object[][] rukuDengji() {
        return new Object[][]{
                {"LS", "浙G","闪闪","330724200012017789"}
        };
    }

    /*********测试用例***************************
     *  1.添加入库登记
     ********************************************/
    @Test(dataProvider = "RukuDengji")
    public void rukuDengji(String idcardnum,String platenum,String chengyunren,String shenfenzheng) {
        commonPage.accessL2DengjiManage();
        zhinengChuruku.rukuDengji();
        zhinengChuruku.dengjiZhika(idcardnum, platenum,chengyunren, shenfenzheng);
        commonPage.closeCurrentTab();

    }

    @DataProvider(name="ChukuDengji")
    public Object[][] chukuDengji() {
        return new Object[][]{
                {"LS", "浙G","闪闪","330724200012017789"}
        };
    }

    /*********测试用例***************************
     *  1.添加出库登记
     ********************************************/
    @Test(dataProvider = "ChukuDengji")
    public void chukuDengji(String idcardnum,String platenum,String chengyunren,String shenfenzheng) {
        commonPage.accessL2DengjiManage();
        /*dengjiManage.rukuDengji();
        dengjiManage.dengjiZhika(idcardnum, platenum,chengyunren, shenfenzheng);*/
        zhinengChuruku.chukuDengji();
        zhinengChuruku.dengjiZhika(idcardnum, platenum,chengyunren, shenfenzheng);
        commonPage.closeCurrentTab();

    }

    @DataProvider(name="DiaoduGuanli")
    public Object[][] diaoduGuanli() {
        return new Object[][]{
                {"德清粮食公司（演示）"}
        };
    }

    /******************************************************
     * 1.调度管理
     * ***************************************************/
    @Test(dataProvider = "DiaoduGuanli")
    public void diaoduGuanli(String Kehuming) {
        commonPage.accessL2DiaoduManage();
        zhinengChuruku.diaoduGuanli(Kehuming);
        commonPage.closeCurrentTab();

    }
}
