package com.hx.ATwuliu.pages;
import com.hx.ATwuliu.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.junit.Assert.*;
/**

 * Created by Administrator on 2019/4/18.

 */

public class ZhinengChuruku extends Actions{
    /*************************************************************************************/
    //页面控件
    /***********************
     /*登记管理页面*/
    @FindBy(xpath = "//div[@class=\"index_carWrap-2oN3Y\"]/div[1]/div")
    private WebElement Div_Rukudengji;     //入库登记制卡

    @FindBy(xpath = "//div[@class=\"index_carWrap-2oN3Y\"]/div[2]/div")
    private WebElement Div_Chukudengji;     //出库登记制卡

    @FindBy(id="icCardNum")
    private WebElement Ipt_QueryIdcardnum;     //卡号输入框-可复用

    @FindBy(id="plateNumber")
    private WebElement Ipt_QueryPlatenum;     //车牌号输入框-可复用

    @FindBy(xpath = "//*[@id=\"app\"]//button[span=\"查 询\"]")
    private WebElement Btn_Query;     //查询按钮

    @FindBy(xpath = "//*[@id=\"app\"]//button[span=\"重 置\"]")
    private WebElement Btn_Reset;     //重置按钮

    /***********************
     /*出入库登记页面*/
    @FindBy(xpath = "//div[@class=\"add_leftArea-3fP4S\"]//label[@title=\"卡号：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_DengjiIdcardnum;     //卡号输入框

    @FindBy(xpath = "//div[@class=\"add_leftArea-3fP4S\"]//label[@title=\"车牌号：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_DengjiPlatenum;     //车牌号输入框

    @FindBy(xpath = "//div[@class=\"add_leftArea-3fP4S\"]//label[@title=\"承运人姓名：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_Chengyunren;     //承运人姓名输入框

    @FindBy(xpath = "//div[@class=\"add_leftArea-3fP4S\"]//label[@title=\"身份证号：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_Shenfenzhenghao;     //身份证号输入框

    @FindBy(xpath = "//div[@class=\"add_leftArea-3fP4S\"]//button[span=\"拍摄承运人照片\"]")
    private WebElement Btn_Zhaopian;     //上传照片按钮

    @FindBy(xpath = "//div[@class=\"page-control center\"]/button[span=\"返 回\"]")
    private WebElement Btn_DengjiRevert;     //返回按钮

    @FindBy(xpath = "//div[@class=\"page-control center\"]/button[span=\"保存并打印\"]")
    private WebElement Btn_Saveprint;     //保存并打印按钮

    @FindBy(xpath = "//div[@class=\"page-control center\"]/button[span=\"保 存\"]")
    private WebElement Btn_Save;     //保存按钮

    @FindBy(xpath =" //div[@class=\"ant-modal-confirm-btns\"]/button[1]")
    private WebElement Btn_DengjiCancel;      //取消按钮

    @FindBy(xpath =" //div[@class=\"ant-modal-confirm-btns\"]/button[2]")
    private WebElement Btn_FinalSave;       //最终保存按钮

    /***********************
     /*调度管理页面*/

    /*@FindBy(id="icCardNum")
    private WebElement Ipt_Idcardnum;     //卡号输入框-可复用

    @FindBy(id="plateNumber")
    private WebElement Ipt_Platenum;     //车牌号输入框-可复用*/

    @FindBy(id="driverName")
    private WebElement Ipt_Drivername;     //承运人输入框

    /*@FindBy(xpath = "//span[@class=\"ant-form-item-children\"]/button[span=\"查 询\"]")
    private WebElement Btn_Query;     //查询按钮 -可复用

    @FindBy(xpath = "//span[@class=\"ant-form-item-children\"]/button[span=\"重 置\"]")
    private WebElement Btn_Reset;     //重置按钮   -可复用*/

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]/tr/td[2]")
    private WebElement Td_Cardnum;   //列表中卡号

    @FindBy(xpath = " //span[@class=\"ant-form-item-children\"]/span/button")
    private WebElement Btn_Tongzhishu;   //入库通知书按钮

    @FindBy(xpath = "//div[@class=\"query-form\"]//label[@title=\"客户名称：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_Kehuming;  //客户名称输入框

    @FindBy(xpath = "//form[@class=\"ant-form ant-form-inline\"]/div[2]//span/button[span=\"查 询\"]")
    private WebElement Btn_QueryKehu;  //客户名称查询

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]/tr[1]//input[@type=\"radio\"]")
    private WebElement RBtn_Tongzhishu;  //单选通知书

    @FindBy(xpath = "//div[@class=\"ant-modal-footer\"]/div/button[1]")
    private WebElement Btn_Cancel;  //取消按钮

    @FindBy(xpath = "//div[@class=\"ant-modal-footer\"]/div/button[2]")
    private WebElement Btn_Commit;  //确定按钮

    @FindBy(xpath = "//div[@class=\"ant-form-item-control\"]/span/button[span=\"返 回\"]")
    private WebElement Btn_Revert;  //返回按钮

    @FindBy(xpath = "//div[@class=\"ant-form-item-control\"]/span/button[span=\"保 存\"]")
    private WebElement Btn_Finalcommit;  //最终确定按钮

    public void rukuDengji(){
        Div_Rukudengji.click();
    }
    public void chukuDengji(){
        Div_Chukudengji.click();
    }

    private String IDcardNum;

    public String dengjiZhika(String idcardnum, String platenum, String chengyunren, String shenfenzheng){
        delay(1500);
        safeSendkeys(Ipt_DengjiIdcardnum,idcardnum+timestampHH());
        delay(1000);
        this.IDcardNum=null;
        this.IDcardNum=Ipt_DengjiIdcardnum.getAttribute("value");    //获取IDcardnum
        System.out.println(this.IDcardNum);
        safeSendkeys(Ipt_Chengyunren,chengyunren);
        safeSendkeys(Ipt_Shenfenzhenghao,shenfenzheng);
        safeClick(Btn_Save);
        safeClick(Btn_FinalSave);
        delay(1500);
        return this.IDcardNum;
    }

    public void diaoduGuanli(String kehuming){
        delay(2000);
        safeSendkeys(Ipt_QueryIdcardnum,this.IDcardNum);
        safeClick(Btn_Query);
        delay(2000);
        safeClick(Td_Cardnum);
        safeClick(Btn_Tongzhishu);
        safeSendkeys(Ipt_Kehuming,kehuming);
        Btn_QueryKehu.click();
        delay(2000);
        RBtn_Tongzhishu.click();
        safeClick(Btn_Commit);
        delay(2000);
        scroll_BarTo_element(Btn_Finalcommit);
        safeClick(Btn_Finalcommit);
    }

    public void qiaoyangGuanli(){}

}