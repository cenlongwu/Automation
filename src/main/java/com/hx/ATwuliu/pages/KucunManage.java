package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import static com.hx.ATwuliu.util.InitPre.driver;

/**
 * Created by Administrator on 2019/4/22.
 */
public class KucunManage extends Actions{

    /************************************************************************************************************/
    //初期库存页面
    @FindBy(id = "XX")
    private WebElement Ipt_Cangfang;     //仓房输入框


    public void addChuqikucun(){

    }

}
