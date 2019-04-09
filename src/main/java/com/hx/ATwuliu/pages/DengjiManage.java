package com.hx.ATwuliu.pages;
import com.hx.ATwuliu.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.junit.Assert.*;

/**
 * Created by Administrator on 2019/4/2.
 */
public class DengjiManage extends Actions {
    /*************************************************************************************/
    //页面控件
    /***********************
    /*登记管理页面*/
    @FindBy(xpath = "//div[@class=\"index_carWrap-2oN3Y\"]/div[1]/div ")
    private WebElement Div_Rukudengji;     //入库登记制卡

    @FindBy(xpath = "//div[@class=\"index_carWrap-2oN3Y\"]/div[2]/div ")
    private WebElement Div_Chukudengji;     //出库登记制卡

    @FindBy(id="icCardNum")
    private WebElement Ipt_QueryIdcardnum;     //卡号输入框-可复用

    @FindBy(id="plateNumber")
    private WebElement Ipt_Platenum;     //车牌号输入框-可复用

    @FindBy(xpath = "//span[@class=\"ant-form-item-children\"]/button[span=\"查 询\"]")
    private WebElement Btn_Query;     //查询按钮

    @FindBy(xpath = "//span[@class=\"ant-form-item-children\"]/button[span=\"重 置\"]")
    private WebElement Btn_Reset;     //重置按钮
    /***********************
    /*出入库登记页面*/
    @FindBy(xpath = "//div[@class=\"add_leftArea-3fP4S\"]//label[@title=\"卡号：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_Idcardnum;     //卡号输入框

    @FindBy(xpath = "//div[@class=\"add_leftArea-3fP4S\"]//label[@title=\"承运人姓名：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_Chengyunren;     //承运人姓名输入框

    @FindBy(xpath = "//div[@class=\"add_leftArea-3fP4S\"]//label[@title=\"身份证号：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_Shenfenzhenhao;     //身份证号输入框

    @FindBy(xpath = "//div[@class=\"add_leftArea-3fP4S\"]//button[span=\"拍摄承运人照片\"]")
    private WebElement Btn_Zhaopian;     //上传照片按钮

    @FindBy(xpath = "//div[@class=\"page-control center\"]/button[span=\"返 回\"]")
    private WebElement Btn_Revert;     //返回按钮

    @FindBy(xpath = "//div[@class=\"page-control center\"]/button[span=\"保存并打印\"]")
    private WebElement Btn_Saveprint;     //保存并打印按钮

    @FindBy(xpath = "//div[@class=\"page-control center\"]/button[span=\"保 存\"]")
    private WebElement Btn_Save;     //保存按钮

    /***********************
     /*调度管理页面*/

   /* @FindBy(id="icCardNum")
    private WebElement Ipt_QueryIdcardnum;     //卡号输入框-可复用

    @FindBy(id="plateNumber")
    private WebElement Ipt_Platenum;     //车牌号输入框-可复用*/

    @FindBy(id="driverName")
    private WebElement Ipt_Drivername;     //车牌号输入框

  /*  @FindBy(xpath = "//span[@class=\"ant-form-item-children\"]/button[span=\"查 询\"]")
    private WebElement Btn_Query;     //查询按钮 -可复用

    @FindBy(xpath = "//span[@class=\"ant-form-item-children\"]/button[span=\"重 置\"]")
    private WebElement Btn_Reset;     //重置按钮   -可复用*/



}
