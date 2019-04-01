package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.Assert;
import org.testng.asserts.Assertion;
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

    @FindBy(className = "ant-btn ant-btn-primary ant-btn-lg ant-btn-block")
    private WebElement Btn_login;     //登录按钮


    /*************************************************************************************/


    /*************************************************************************************/
    //封装完可执行的方法
    public void login(String username,String password) {
        Ipt_usename.sendKeys();
        Ipt_password.sendKeys();
        Btn_login.submit();
    }



    /*************************************************************************************/



}
