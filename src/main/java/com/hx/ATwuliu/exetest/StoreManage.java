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
 * Created by Administrator on 2019/4/22.
 */
public class StoreManage {

    public InitPage initPage = new InitPage();
    CommonPage commonPage = initPage.commonPage;
    KucunManage kucunManage = initPage.kucunManage;

    @DataProvider(name="chuqikucun")
    public Object[][] chuqikucun() {
        return new Object[][]{
                {"海绵宝宝", "混合小麦", "100","0p5-保中一"}
        };
    }

    /*********测试用例***************************
     1、新增仓房初期库存
     2、提交审核初期库存数据
     3、初期库存列表数据查询
     ********************************************/

    @Test(dataProvider = "chuqikucun")
    public void chuqikucunTest(){

        commonPage.closeCurrentTab();
    }
}
