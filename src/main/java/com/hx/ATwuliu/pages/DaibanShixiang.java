package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Administrator on 2019/4/1.
 */
public class DaibanShixiang extends Actions {
    /*************************************************************************************/
    //页面控件

    //审批处理主页面
    @FindBy(xpath = "//*[@id=\"approvalNum\"]")
    private WebElement Ipt_ShenPiBianHao;      //审批编号输入框

    @FindBy(xpath = "//span/button[1]")
    private WebElement Btn_Query;          //查询按钮

    @FindBy(xpath = "//*[@id=\"app\"]//span/button[2]\n")
    private WebElement Btn_Reset;           //重置按钮

    @FindBy(xpath = "//*[@id=\"app\"]//tr[1]/td[1]/span/label/span/input")
    private WebElement Btn_GouXuan;     //勾选第一条

    @FindBy(xpath = "//*[@id=\"app\"]//div[2]/div[1]/div/button[1]")
    private WebElement Btn_ShenPi;      //审批按钮

    @FindBy(xpath = "//*[@id=\"app\"]//div/button[2]")
    private WebElement Btn_BoHui;      //驳回按钮

    @FindBy(xpath = "//div[@class=\"ant-modal-confirm-btns\"]/button[span=\"确 定\"]")
    private WebElement Btn_Conform;      //确定按钮

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/div/div[2]/div/div/div[2]/button[1]")
    private WebElement Btn_QuXiao;      //取消按钮

    @FindBy(className= "ant-modal-confirm-body")
    private WebElement Div_Comformbody;      //确认信息


    //审核处理里的明细
    @FindBy(xpath = "//*[@id=\"app\"]//div[2]/button[1]")
    private WebElement Btn_FanHui;             //明细里面的返回按钮

    @FindBy(xpath = "//div[2]/button[2]")
    private WebElement Btn_MingXiBoHui;      //明细里的驳回按钮

    @FindBy(xpath = "//div[2]/button[3]")
    private WebElement Btn_MingXiShenPi;           //明细里的审批按钮

    //审批查询主页面
    @FindBy(xpath = "//*[@id=\"approvalNum\"]")
    private WebElement Ipt_ShenPiBianHao2;        //审批编号2输入框

    @FindBy(xpath = "//*[@id=\"approvalLink\"]/div/div")
    private WebElement Ipt_ShenPiLiu;     //审批流选择框

    @FindBy(xpath = "//*[@id=\"status\"]/div/div")
    private WebElement Ipt_ShenPiZhuangTai;     //审批状态选择框

    @FindBy(xpath = "//span/button[1]")
    private WebElement Btn_ChaXun;     //查询按钮

    @FindBy(xpath = "//span/button[2]")
    private WebElement Btn_ChongZhi;        //重置按钮

    //封装完可执行的方法

    public void processShenpi(String shenpibianhao){
        try{
            delay(1000);
            Ipt_ShenPiBianHao.clear();
            safeSendkeys(Ipt_ShenPiBianHao,shenpibianhao);
            delay(1000);
            Btn_GouXuan.click();
            Btn_ShenPi.click();
            delay(1000);
            Btn_Conform.sendKeys(Keys.ENTER);
            delay(2000);
            Reporter.log("【"+shenpibianhao+"】审批成功！");
        }catch(StaleElementReferenceException eo){
            Reporter.log("出现StaleElementReferenceException错误");
        }catch (NoSuchElementException e1){
            Reporter.log("出现NoSuchElementException错误");
        }
    }
    
}