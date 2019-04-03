package com.hx.ATwuliu.util;

import com.hx.ATwuliu.pages.*;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by wucenlong on 2017/9/13.
 */
public class InitPage extends InitPre{

    public CommonPage commonPage=PageFactory.initElements(driver,CommonPage.class);
    public ChurukudanPinZheng churukudanPinZheng=PageFactory.initElements(driver,ChurukudanPinZheng.class);
//    public ImageRepoPage imageRepoPage=PageFactory.initElements(driver,ImageRepoPage.class);
//    public CreateAppPage createAppPage=PageFactory.initElements(driver,CreateAppPage.class);
//    public VerifyResultPage verifyResultPage=PageFactory.initElements(driver,VerifyResultPage.class);
}
