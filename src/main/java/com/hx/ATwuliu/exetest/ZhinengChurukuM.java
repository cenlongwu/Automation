package com.hx.ATwuliu.exetest;

import com.hx.ATwuliu.pages.*;
import com.hx.ATwuliu.util.Actions;
import com.hx.ATwuliu.util.InitPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/4/22.
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
    public Object[][] rukuDengji() {
        return new Object[][]{
                {"粮仓入库","LS1103", "浙G","sx","330724200012017789"},
                {"粮仓出库","LS1104", "浙G","sx","330724200012017789"}
        };
    }

    /*********测试用例***************************
     *  1.添加入库登记
     ********************************************/
    @Test(dataProvider = "RukuDengji")
    public void rukuDengji(String dengjiType,String idcardnum,String platenum,String chengyunren,String shenfenzheng) {
        commonPage.accessL2DengjiManage();
        //zhinengChuruku.rukuDengji();
        zhinengChuruku.dengjiZhika(dengjiType,idcardnum, platenum,chengyunren, shenfenzheng);
        commonPage.closeCurrentTab();

    }


    @DataProvider(name="DiaoduGuanli")
    public Object[][] diaoduGuanli() {
        return new Object[][]{
                {"LS1103","海绵宝宝"},
                {"LS1104","海绵宝宝"}
        };
    }

    /******************************************************
     * 1.调度管理
     * ***************************************************/
    @Test(dataProvider = "DiaoduGuanli")
    public void diaoduGuanli(String idcardnum, String kehuming) {
        commonPage.accessL2DiaoduManage();
        zhinengChuruku.diaoduGuanli(idcardnum,kehuming);
        commonPage.closeCurrentTab();

    }
}
