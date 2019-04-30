package com.hx.ATwuliu.util;

import com.hx.ATwuliu.exetest.StoreManage;
import com.hx.ATwuliu.pages.*;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by wucenlong on 2017/9/13.
 */
public class InitPage extends InitPre{

    public CommonPage commonPage=PageFactory.initElements(driver,CommonPage.class);
    public ChurukudanPinZheng churukudanPinZheng=PageFactory.initElements(driver,ChurukudanPinZheng.class);
    public PlanManage planManage=PageFactory.initElements(driver,PlanManage.class);
    public HetongManage hetongManage=PageFactory.initElements(driver,HetongManage.class);
    public DaibanShixiang daibanShixiang=PageFactory.initElements(driver,DaibanShixiang.class);
    public ZhinengChuruku zhinengChuruku=PageFactory.initElements(driver,ZhinengChuruku.class);
    public KucunManage kucunManage=PageFactory.initElements(driver,KucunManage.class);
//    public VerifyResultPage verifyResultPage=PageFactory.initElements(driver,VerifyResultPage.class);
}
