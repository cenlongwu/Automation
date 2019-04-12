package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;

import static com.hx.ATwuliu.util.InitPre.driver;
//import org.junit.Assert.*;

/**
 * Created by Administrator on 2019/4/1.
 */
public class ChurukudanPinZheng extends Actions {

    //public final static String ValCangwei="0p6-保中一";
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

    @FindBy(xpath = "//div[@class=\"ant-spin-nested-loading\"]//tr[1]/td[1]")
    private WebElement RBtn_ChooseTongzhishu;     //单选通知书编号

    /*入库通知书页面--新增*/
    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//input[@type=\"text\" and @id=\"noticeNum\"]")
    private WebElement Ipt_DTongzhishuNum;     //通知书编号输入框(自动生成通知书编号)

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]/div/form//span[@id=\"businessDate\"]/div/input")
    private WebElement Ipt_AddBusinessDate;     //业务日期输入框

    @FindBy(xpath ="//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"客户\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_Customer;     //客户输入框

    /*********客户弹出框里的控件**************************/
    @FindBy(xpath ="//div[@class=\"query-form\"]//label[@title=\"客户名称：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_CustomerName;     //客户名称 查询输入框

    //@FindBy(xpath ="//div[@class=\"query-form\"]//button[span=\"查 询\"]")
    @FindBy(xpath ="//div[text()=\"客户\"]/parent::div/following-sibling::div[@class=\"ant-modal-body\"]//button[span=\"查 询\"]")
        private WebElement Btn_CustomerQuery;     // 查询按钮（客户名称）

    @FindBy(xpath ="//div[@class=\"ant-modal-content\"]//div[text()=\"客户\"]/parent::div/following-sibling::div[@class=\"ant-modal-body\"]//input[@type=\"radio\"]")
    private WebElement RBtn_Customer;     // 单选按钮（选择客户）

    @FindBy(xpath ="//div[text()=\"客户\"]/parent::div/following-sibling::div[@class=\"ant-modal-footer\"]//span[text()=\"确 定\"]/parent::button")
    private WebElement Btn_ConfirmCustomer;     // 确定按钮（选择客户-弹出框页面）
    /****************************************************/

    @FindBy(xpath ="//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"品种\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_PinZhong;     //品种输入框

    /*********品种弹出框里的控件**************************/
    @FindBy(xpath ="//div[@class=\"query-form\"]//label[@title=\"品种名称：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_PinZhongName;     //品种名称 查询输入框

    //@FindBy(xpath ="//div[@class=\"query-form\"]//button[span=\"查 询\"]")
    @FindBy(xpath ="//div[text()=\"品种\"]/parent::div/following-sibling::div[@class=\"ant-modal-body\"]//button[span=\"查 询\"]")
    private WebElement Btn_PinZhongQuery;     // 查询按钮（品种名称）

    @FindBy(xpath ="//div[@class=\"ant-modal-content\"]//div[text()=\"品种\"]/parent::div/following-sibling::div[@class=\"ant-modal-body\"]//input[@type=\"radio\"]")
    private WebElement RBtn_Pinzhong;     // 单选按钮（选择品种）

    @FindBy(xpath ="//div[text()=\"品种\"]/parent::div/following-sibling::div[@class=\"ant-modal-footer\"]//span[text()=\"确 定\"]/parent::button")
    private WebElement Btn_ConfirmPinzhong;     // 确定按钮（选择品种-弹出框页面）
    /****************************************************/

    @FindBy(xpath ="//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"数量\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_Amount;     //数量输入框（默认disable）

    @FindBy(xpath ="//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"仓位\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_CangWei;     //仓位输入框（默认disable）

    //@FindBy(xpath ="//li[text()="+ValCangwei+"]")
    @FindBy(xpath ="//div[contains(@class,\"ant-select-dropdown\")]//ul/li[1]")
    private WebElement Li_CangWei;     //仓位下拉列表

    @FindBy(xpath ="//button/span[text()=\"确 认\"]/parent::button")
    private WebElement Btn_Confirm;     //确认按钮



    /*************************************************************************************/
    //封装完可执行的方法

    private static String TongzhishuBianhao;



    public String addRukutongzhishu(String customerName,String Pinzhong,String Amount,String Cangwei){
        Btn_Add.click();   //进入新增入库通知书页面
        this.TongzhishuBianhao=Ipt_DTongzhishuNum.getText();    //获取新建通知书编号
        Reporter.log("新增的入库通知书编号为："+TongzhishuBianhao);
        wait.until(ExpectedConditions.elementToBeClickable(Ipt_Customer));  //选择客户
        Ipt_Customer.click();
        wait.until(ExpectedConditions.elementToBeClickable(Ipt_CustomerName));
        Ipt_CustomerName.sendKeys(customerName);
        Btn_CustomerQuery.click();
        //wait.until(ExpectedConditions.elementToBeClickable(RBtn_Customer));
        delay(2000);
        RBtn_Customer.click();
        Btn_ConfirmCustomer.click();
        //wait.until(ExpectedConditions.elementToBeClickable(Ipt_PinZhong));  //选择品种
        delay(1000);
        Ipt_PinZhong.click();
        //wait.until(ExpectedConditions.elementToBeClickable(Ipt_PinZhongName));
        delay(2000);
        Ipt_PinZhongName.sendKeys(Pinzhong);
        Btn_PinZhongQuery.click();
        delay(2000);
        RBtn_Pinzhong.click();
        Btn_ConfirmPinzhong.click();
        wait.until(ExpectedConditions.elementToBeClickable(Ipt_Amount));  //输入数量
        Ipt_Amount.sendKeys(Amount);
        wait.until(ExpectedConditions.elementToBeClickable(Ipt_CangWei));  //输入、选择数量
        Ipt_CangWei.sendKeys(Cangwei);
        wait.until(ExpectedConditions.elementToBeClickable(Li_CangWei));
        Li_CangWei.click();
        Btn_Confirm.click();    //点击确认保存
    return this.TongzhishuBianhao;
    }

    public void SubmitRukutongzhishu(){
        try{
            wait.until(ExpectedConditions.visibilityOf(Ipt_TongzhishuNum));    //输入并查找通知书编号
            Ipt_TongzhishuNum.sendKeys(this.TongzhishuBianhao);
            Btn_Query.click();
            RBtn_ChooseTongzhishu.click();    //选中搜到的通知书编号
            Btn_Submit.click();
        }catch(StaleElementReferenceException eo){
            Reporter.log("出现StaleElementReferenceException错误");
        }catch (NoSuchElementException e1){
            Reporter.log("出现NoSuchElementException错误");
        }
    }



    /*************************************************************************************/
}
