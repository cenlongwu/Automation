package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
//import org.junit.Assert.*;

/**
 * Created by Administrator on 2019/4/1.
 */
public class ChurukudanPinZheng extends Actions {

    /*************************************************************************************/
    //页面控件

    /*入库通知书页面*/
    @FindBy(id="noticeNum")
    private WebElement Ipt_TongzhishuNum;    //通知书编号输入框

    @FindBy(xpath = "//*[@id=\"app\"]//button[span=\"查 询\"]")
    private WebElement Btn_Query;     //查询按钮

    @FindBy(xpath = "//*[@id=\"app\"]//div[@class=\"ant-btn-group\"]/button[span=\"新 增\"]")
    private WebElement Btn_Add;     //新增按钮

    @FindBy(xpath = "//*[@id=\"app\"]//div[@class=\"ant-btn-group\"]/button[span=\"修 改\"]")
    private WebElement Btn_Modify;     //修改按钮

    @FindBy(xpath = "//*[@id=\"app\"]//div[@class=\"ant-btn-group\"]/button[span=\"删 除\"]")
    private WebElement Btn_Delete;     //删除按钮

    @FindBy(xpath = "//*[@id=\"app\"]//div[@class=\"ant-btn-group\"]/button[span=\"提 交\"]")
    private WebElement Btn_Submit;     //提交按钮

    @FindBy(xpath = "//*[@id=\"app\"]//div[@class=\"ant-btn-group\"]/button[span=\"中 止\"]")
    private WebElement Btn_Suspend;     //中止按钮

    @FindBy(xpath = "//*[@id=\"app\"]//div[@class=\"ant-btn-group\"]/button[span=\"完 成\"]")
    private WebElement Btn_Complete;     //完成按钮




    /*入库通知书页面--新增*/
    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//input[@type=\"text\" and @id=\"noticeNum\"]")
    private WebElement Ipt_DTongzhishuNum;     //通知书编号输入框(自动生成通知书编号)

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]/div/form//span[@id=\"businessDate\"]/div/input")
    private WebElement Ipt_AddBusinessDate;     //业务日期输入框

    @FindBy(xpath ="//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"客户\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_Customer;     //客户输入框

    @FindBy(xpath ="//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"品种\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_PinZhong;     //品种输入框

    @FindBy(xpath ="//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"数量\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_Amount;     //数量输入框（默认disable）

    @FindBy(xpath ="//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"仓位\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_CangWei;     //仓位输入框（默认disable）

    @FindBy(xpath ="//button/span[text()=\"确 认\"]")
    private WebElement Btn_Confirm;     //确认按钮
    /*************************************************************************************/
    //封装完可执行的方法

    public String addRukutongzhishu(/*String customerName,String Pinzhong,int Amount,String Cangwei*/){
        String TongzhishuBianhao=Ipt_DTongzhishuNum.getText();
            Reporter.log("新增的入库通知书编号为："+TongzhishuBianhao);
            Btn_Add.click();
            setAttrByJS(Ipt_Customer,"value","海绵宝宝");
     return TongzhishuBianhao;
    }




    /*************************************************************************************/
}
