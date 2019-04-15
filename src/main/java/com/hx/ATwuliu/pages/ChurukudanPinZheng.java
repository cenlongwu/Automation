package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.Actions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.Reporter;
//import org.junit.Assert.*;

/**
 * Created by Administrator on 2019/4/1.
 */
public class ChurukudanPinZheng extends Actions {

    //public final static String ValCangwei="0p6-保中一";
    /*************************************************************************************/
    //页面控件

    /*入库通知书页面*/
    //@FindBy(id="noticeNum")
    @FindBy(xpath = "//input[@id=\"noticeNum\" and @placeholder=\"请输入\"]")
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

    @FindBy(xpath = "//div[@class=\"ant-spin-nested-loading\"]//tr[1]/td[1]//input[@type=\"radio\"]")
    private WebElement RBtn_ChooseTongzhishu;     //单选通知书编号

    /*入库通知书页面--新增*/
    @FindBy(xpath = "//input[@id=\"noticeNum\" and starts-with(@value,\"ZX_\")]")
    private WebElement Ipt_ZidongTongzhishuNum;     //通知书编号输入框(自动生成通知书编号)

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

    @FindBy(id = "noticeName")
    private WebElement Ipt_DanjuMingcheng;      //单据名称输入框

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]/div/form/div/div[2]/div/div[2]/div[3]/div[2]//span/div/div")
    private WebElement Div_Dengji;      //等级下拉框

    /*等级下拉框数据*/
    @FindBy(xpath = "//div[@id='41ddd663-4b5e-4632-8215-c7c29a7d31cc']/ul/li[text()='一等']")
    private WebElement SJ_01;
    @FindBy(xpath = "//div[@id='41ddd663-4b5e-4632-8215-c7c29a7d31cc']/ul/li[text()='二等']")
    private WebElement SJ_02;
    @FindBy(xpath = "//div[@id='41ddd663-4b5e-4632-8215-c7c29a7d31cc']/ul/li[text()='三等']")
    private WebElement SJ_03;
    @FindBy(xpath = "//div[@id='41ddd663-4b5e-4632-8215-c7c29a7d31cc']/ul/li[text()='四等']")
    private WebElement SJ_04;
    @FindBy(xpath = "//div[@id='41ddd663-4b5e-4632-8215-c7c29a7d31cc']/ul/li[text()='五等']")
    private WebElement SJ_05;
    @FindBy(xpath = "//div[@id='41ddd663-4b5e-4632-8215-c7c29a7d31cc']/ul/li[text()='等外']")
    private WebElement SJ_06;

    /*************************************************************************************/
    //封装完可执行的方法

    private String TongzhishuBianhao;



    public String addRukutongzhishu(String customerName,String Pinzhong,String Amount,String Cangwei){
        Btn_Add.click();   //进入新增入库通知书页面
        delay(2000);
        this.TongzhishuBianhao=null;
        this.TongzhishuBianhao=Ipt_ZidongTongzhishuNum.getAttribute("value");    //获取新建通知书编号
        //Reporter.log("新增的入库通知书编号为："+TongzhishuBianhao);
        System.out.println(this.TongzhishuBianhao);
        //wait.until(ExpectedConditions.elementToBeClickable(Ipt_Customer));  //选择客户
        //Ipt_Customer.click();
        safeClick(Ipt_Customer);
        //wait.until(ExpectedConditions.elementToBeClickable(Ipt_CustomerName));
        //Ipt_CustomerName.sendKeys(customerName);
        safeSendkeys(Ipt_CustomerName,customerName);  //搜索框输入客户名
        Btn_CustomerQuery.click();
        delay(1500);
        RBtn_Customer.click();
        Btn_ConfirmCustomer.click();
        delay(1500);
        //Ipt_PinZhong.click();   //选择品种
        safeClick(Ipt_PinZhong);   //选择品种
        delay(1500);
        Ipt_PinZhongName.sendKeys(Pinzhong);
        Btn_PinZhongQuery.click();
        delay(2000);
        RBtn_Pinzhong.click();
        //safeClick(RBtn_Pinzhong);
        Btn_ConfirmPinzhong.click();
        //wait.until(ExpectedConditions.elementToBeClickable(Ipt_Amount));  //输入数量
        //Ipt_Amount.sendKeys(Amount);
        safeSendkeys(Ipt_Amount,Amount);
        //wait.until(ExpectedConditions.elementToBeClickable(Ipt_CangWei));  //输入、选择数量
       // Ipt_CangWei.sendKeys(Cangwei);
        safeSendkeys(Ipt_CangWei,Cangwei);
        //wait.until(ExpectedConditions.elementToBeClickable(Li_CangWei));
        //Li_CangWei.click();
        safeClick(Li_CangWei);
        safeClick(Btn_Confirm);  //点击确认保存
    return this.TongzhishuBianhao;
    }

    public void SubmitRukutongzhishu(){
        try{
            delay(1000);
            safeSendkeys(Ipt_TongzhishuNum,this.TongzhishuBianhao); //输入并查找通知书编号
            safeClick(Btn_Query);
            //safeClick(RBtn_ChooseTongzhishu);  //选中搜到的通知书编号
            delay(1000);
            RBtn_ChooseTongzhishu.click();
            safeClick(Btn_Submit);
        }catch(StaleElementReferenceException eo){
          // Reporter.log("出现StaleElementReferenceException错误");
        }catch (NoSuchElementException e1){
           // Reporter.log("出现NoSuchElementException错误");
        }
    }
    /******************************/
    /***********仅供测试************/
    /******************************/
    public void test(){
        //点击新增，点击客户，选择客户，点击确定
        Btn_Add.click();
        Ipt_Customer.click();
        Ipt_CustomerName.sendKeys("海绵宝宝");
        Btn_CustomerQuery.click();
        delay(2000);
        RBtn_Customer.click();
        safeClick(Btn_ConfirmCustomer);
        //点击单据名称输入框，输入信息
        safeSendkeys(Ipt_DanjuMingcheng, "单据名称test");
        //选择下拉框等级
        String value = "四等";
        //判断想要选择的数据对应的WebElement对象，返回数据类型为WebElement
        WebElement result;
        //  select_DropdownBox(Div_Dengji, value, result);
    }


    /*************************************************************************************/





    /*************************************************************************************/
}
