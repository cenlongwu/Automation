package com.hx.ATwuliu.pages;


import com.hx.ATwuliu.util.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.hx.ATwuliu.util.InitPre.driver;

/**
 * Created by Administrator on 2019/4/17.
 */
public class ZhijianManage extends Actions{

    /************************************************************************************************************/
    //质检报告单


    @FindBy(id="reportNumber")
    private WebElement Ipt_DanjuNum;    //单据编号输入框

    @FindBy(xpath = "//*[@id=\"app\"]//button[span=\"查 询\"]")
    private WebElement Btn_Query;     //查询按钮

    @FindBy(xpath = "//*[@id=\"app\"]//div[@class=\"ant-btn-group\"]/button[span=\"新 增\"]")
    private WebElement Btn_Add;     //新增按钮

    @FindBy(xpath = "//*[@id=\"app\"]//div[@class=\"ant-btn-group\"]/button[span=\"提 交\"]")
    private WebElement Btn_Submit;     //提交按钮

    @FindBy(xpath = "//div[@class=\"ant-spin-nested-loading\"]//tr[1]/td[1]//input[@type=\"checkbox\"]")
    private WebElement Cbox_Submit;     //单据编号复选框

    /*************************************/
    //质检报告单新增页面






    public void addZhijianbaogaodan(){

    }
}
