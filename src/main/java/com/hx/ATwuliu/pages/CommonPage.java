package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.junit.Assert.*;


/**
 * Created by Administrator on 2019/3/29.
 */
public class CommonPage extends Actions{
    /*************************************************************************************/
    //页面控件

    /*登入页面*/
    @FindBy(id="username")
    private WebElement Ipt_usename;    //用户名输入框

    @FindBy(id="password")
    private WebElement Ipt_password;  //密码输入框

    @FindBy(tagName = "button")
    private WebElement Btn_login;     //登录按钮


    /*************************************************************************************/


    /*************************************************************************************/
    //封装完可执行的方法
    public void login(String expectedTitle,String username,String password) {
        wait.until(ExpectedConditions.elementToBeClickable(Ipt_usename));
        Actions.assertTitle(expectedTitle);
        waitForPageLoad();
        Ipt_usename.sendKeys(username);
        Ipt_password.sendKeys(password);
        Btn_login.click();
    }



    /*************************************************************************************/



}
