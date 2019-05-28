package com.hx.ATwuliu.pages;
import com.hx.ATwuliu.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import static com.hx.ATwuliu.util.InitPre.driver;
//import org.junit.Assert.*;
/**

 * Created by Administrator on 2019/4/19.

 */

public class ZhinengChuruku extends Actions{
    /*************************************************************************************/
    //页面控件
    /***********************
     /*登记管理页面*/
    @FindBy(xpath = "//div[@class=\"index_carWrap-2oN3Y\"]/div[1]/div")
    private WebElement Btn_Rukudengji;     //入库登记制卡

    @FindBy(xpath = "//div[@class=\"index_carWrap-2oN3Y\"]/div[2]/div")
    private WebElement Btn_Chukudengji;     //出库登记制卡

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

    /*****************************
     * 手工录入-入/出库单录入公用
     ****************************/
    @FindBy()
    private WebElement Btn_sglr_Add;    //新增按钮
    @FindBy()
    private WebElement Btn_sglr_Submit;    //提交按钮
    @FindBy()
    private WebElement Ipt_sglr_DanjuBianhao;   //单据编号输入框
    @FindBy()
    private WebElement Btn_sglr_Chaxun;   //查询按钮
    @FindBy()
    private WebElement RBtn_sglr_Churukudan;  //单选出/入库单
    /********************************
     * 手工录入-入/出库单录入-新增公用
     *******************************/
    @FindBy()
    private WebElement Ipt_sglr_Add_DanjuBianhao;   //单据编号
    @FindBy()
    private WebElement Ipt_sglr_Add_Tongzhishu;   //入/出库通知书输入框
    @FindBy()
    private WebElement Ipt_sglr_Add_KehuMingcheng;   //客户名称输入框
    @FindBy()
    private WebElement Btn_sglr_Add_Kehu_Chaxun;    //客户查询按钮
    @FindBy()
    private WebElement RBtn_sglr_Add_Kehu_Tongzhishu;  //单选通知书
    @FindBy()
    private WebElement Btn_sglr_Add_Kehu_Commit;  //客户弹出框确定按钮
    @FindBy()
    private WebElement Btn_sglr_Add_JianyanJianjinXinxi;    //检验检斤信息按钮
    @FindBy()
    private WebElement Ipt_sglr_Add_Maozhong;   //毛重输入框
    @FindBy()
    private WebElement Ipt_sglr_Add_Pizhong;   //皮重输入框
    @FindBy()
    private WebElement Ipt_sglr_Add_QitaKouliang;   //其他扣量输入框
    @FindBy()
    private WebElement DdBox_sglr_Add_RuliangCangfang;  //入粮仓房下拉框
    @FindBy()
    private WebElement Btn_sglr_Add_Commit;    //新增保存按钮
    /**************************
     * 手工录入-入库单录入-新增
     *************************/
    @FindBy()
    private WebElement DdBox_sglr_rukuAdd_KucunXingzhi;  //库存性质下拉框
    @FindBy()
    private WebElement DdBox_sglr_rukuAdd_KucunXingzhi_wenben;  //库存性质下拉框内文本
    @FindBy()
    private WebElement Ipt_sglr_rukuAdd_Chandi;    //产地输入框
    //产地弹出框webelement
    @FindBy()
    private WebElement RBtn_sglr_rukuAdd_Hege;   //合格单选框
    @FindBy()
    private WebElement RBtn_sglr_rukuAdd_NotHege;   //不合格单选框


    /*******************************
     * 出入库单管理-入/出库单管理公用
     ******************************/
    @FindBy()
    private WebElement Btn_crkdgl_Update;    //调整单据按钮
    @FindBy()
    private WebElement Btn_crkdgl_Delete;    //作废按钮
    @FindBy()
    private WebElement Ipt_crkdgl_DengjiCardID;   //登记卡号输入框
    @FindBy()
    private WebElement Btn_crkdgl_Chaxun;   //查询按钮
    @FindBy()
    private WebElement RBtn_crkdgl_Churukudan;  //单选出/入库单
    /***********************************
     * 手工录入-入/出库单录入-调整单据公用
     ***********************************/
    @FindBy()
    private WebElement Btn_crkdgl_Update_JianyanJianjinXinxi;    //检验检斤信息按钮
    @FindBy()
    private WebElement Ipt_crkdgl_Update_QitaKouliang;   //其他扣量输入框
    @FindBy()
    private WebElement Btn_crkdgl_Update_Commit;    //调整保存按钮




   /* public void rukuDengji(){
        Div_Rukudengji.click();
    }
    public void chukuDengji(){
        Div_Chukudengji.click();
    }*/

    private String IDcardNum;

    public String dengjiZhika(String dengjitype,String idcardnum, String platenum, String chengyunren, String shenfenzheng){
        delay(1500);
        if(dengjitype=="粮仓入库"){
            Btn_Rukudengji.click();
            Reporter.log("进行入库登记");
        }
        else if(dengjitype=="粮仓出库"){
            Btn_Chukudengji.click();
            Reporter.log("进行出库登记");
        }
        String idcardnum_real;
        idcardnum_real=(idcardnum+timestampSSS()).substring(0,6);
        safeSendkeys(Ipt_DengjiIdcardnum,idcardnum_real);
        delay(1000);
        this.IDcardNum=null;
        this.IDcardNum=Ipt_DengjiIdcardnum.getAttribute("value");    //获取IDcardnum
        System.out.println(this.IDcardNum);
        Reporter.log("新增卡号："+IDcardNum);
        safeSendkeys(Ipt_Chengyunren,chengyunren);
        Reporter.log("已填写承运人："+chengyunren);
        safeSendkeys(Ipt_Shenfenzhenghao,shenfenzheng);
        Reporter.log("已填写身份证号："+shenfenzheng);
        safeClick(Btn_Save);
        safeClick(Btn_FinalSave);
        delay(2000);
        Reporter.log("新增卡号："+"成功！");
        return this.IDcardNum;
    }

    public void diaoduGuanli(String kehuming){
        delay(2000);
        safeSendkeys(Ipt_QueryIdcardnum,IDcardNum);
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
        Reporter.log("卡号："+IDcardNum+"调度成功！");
        delay(2000);
    }

    public void qiaoyangGuanli(){}

    /*************************
     * 入库单录入
     ************************/
    public String addRukudanLuru(String kehuName, String kucunXingzhi_1, String kucunXingzhi_2, String chandi,
                             String jianchaYijian, String maozhong, String pizhong, String cangfang){
        Btn_sglr_Add.click();    //进入入库单录入新增页面
        delay(1000);

        //选择入库通知书
        safeClick(Ipt_sglr_Add_Tongzhishu);
        //搜索框输入客户
        safeSendkeys(Ipt_sglr_Add_KehuMingcheng, kehuName);
        Btn_sglr_Add_Kehu_Chaxun.click();
        delay(1000);
        RBtn_sglr_Add_Kehu_Tongzhishu.click();
        Btn_sglr_Add_Kehu_Commit.click();
        Reporter.log("已选中入库通知书：" + Ipt_sglr_Add_Tongzhishu.getText());

        //点击检验检斤信息
        safeClick(Btn_sglr_Add_JianyanJianjinXinxi);

        //选择库存性质
        String kucunXingzhiValue = DdBox_sglr_rukuAdd_KucunXingzhi_wenben.getText();    //获取下拉框中原有的值对应的WebElement:Ipt_3_kucunXingzhi_wenben
        System.out.println("kucunXingzhiValue的值：" + kucunXingzhiValue);
        select_DropdownBox(DdBox_sglr_rukuAdd_KucunXingzhi, kucunXingzhi_1, kucunXingzhi_2, kucunXingzhiValue);   //点击下拉框对应的WebElement：Ipt_1_kucunXingzhi

        //选择产地
        safeClick(Ipt_sglr_rukuAdd_Chandi);
        //XXXXXXXX
        //Reporter.log("已选择产地为：" + chandi);

        //选择检查意见
        if (jianchaYijian.equals("合格")){
            safeClick(RBtn_sglr_rukuAdd_Hege);
        }else {
            safeClick(RBtn_sglr_rukuAdd_NotHege);
        }
        Reporter.log("已选择检查意见为：" + jianchaYijian);

        //输入毛重
        Ipt_sglr_Add_Maozhong.click();
        Ipt_sglr_Add_Maozhong.sendKeys(maozhong);
        Reporter.log("已填写毛重：" + maozhong);

        //输入皮重
        Ipt_sglr_Add_Pizhong.click();
        Ipt_sglr_Add_Pizhong.sendKeys(pizhong);
        Reporter.log("已填写皮重：" + pizhong);

        //选择入粮仓房
        String cangfangValue = DdBox_sglr_Add_RuliangCangfang.getText();
        System.out.println("入粮仓房是：" + cangfangValue);
        select_DropdownBox(DdBox_sglr_Add_RuliangCangfang, cangfang, cangfangValue);

        //点击确认
        safeClick(Btn_sglr_Add_Commit);
        Reporter.log("保存成功！");
        return Ipt_sglr_Add_DanjuBianhao.getAttribute("value");
    }

    public void submitRukudanLuru(String danjuBianhao) {
        try {
            delay(1000);
            safeSendkeys(Ipt_sglr_DanjuBianhao, danjuBianhao); //输入并查找单据编号
            safeClick(Btn_sglr_Chaxun);
            delay(1000);
            RBtn_sglr_Churukudan.click();  //选中搜到的单据编号
            safeClick(Btn_sglr_Submit);
            Reporter.log("提交手工录入入库单：" + danjuBianhao + "成功!");
        } catch (StaleElementReferenceException eo) {
            Reporter.log("出现StaleElementReferenceException错误");
        } catch (NoSuchElementException e1) {
            Reporter.log("出现NoSuchElementException错误");
        }
    }
    /*************************
     * 出库单录入
     ************************/
    public String addChukudanLuru(String kehuName, String chandi, String maozhong, String pizhong, String cangfang){
        Btn_sglr_Add.click();    //进入出库单录入新增页面
        delay(1000);

        //选择出库通知书
        safeClick(Ipt_sglr_Add_Tongzhishu);
        //搜索框输入客户
        safeSendkeys(Ipt_sglr_Add_KehuMingcheng, kehuName);
        Btn_sglr_Add_Kehu_Chaxun.click();
        delay(1000);
        RBtn_sglr_Add_Kehu_Tongzhishu.click();
        Btn_sglr_Add_Kehu_Commit.click();
        Reporter.log("已选中出库通知书：" + Ipt_sglr_Add_Tongzhishu.getText());

        //点击检验检斤信息
        safeClick(Btn_sglr_Add_JianyanJianjinXinxi);

        //输入毛重
        Ipt_sglr_Add_Maozhong.click();
        Ipt_sglr_Add_Maozhong.sendKeys(maozhong);
        Reporter.log("已填写毛重：" + maozhong);

        //输入皮重
        Ipt_sglr_Add_Pizhong.click();
        Ipt_sglr_Add_Pizhong.sendKeys(pizhong);
        Reporter.log("已填写皮重：" + pizhong);

        //选择入粮仓房
        String cangfangValue = DdBox_sglr_Add_RuliangCangfang.getText();
        System.out.println("入粮仓房是：" + cangfangValue);
        select_DropdownBox(DdBox_sglr_Add_RuliangCangfang, cangfang, cangfangValue);

        //点击确认
        safeClick(Btn_sglr_Add_Commit);
        Reporter.log("保存成功！");
        return Ipt_sglr_Add_DanjuBianhao.getAttribute("value");
    }

    public void submitChukudanLuru(String danjuBianhao) {
        try {
            delay(1000);
            safeSendkeys(Ipt_sglr_DanjuBianhao, danjuBianhao); //输入并查找单据编号
            safeClick(Btn_sglr_Chaxun);
            delay(1000);
            RBtn_sglr_Churukudan.click();  //选中搜到的单据编号
            safeClick(Btn_sglr_Submit);
            Reporter.log("提交手工录入出库单：" + danjuBianhao + "成功!");
        } catch (StaleElementReferenceException eo) {
            Reporter.log("出现StaleElementReferenceException错误");
        } catch (NoSuchElementException e1) {
            Reporter.log("出现NoSuchElementException错误");
        }
    }

    /*************************
     * 入库单管理
     ************************/
    public void updateRukudanGuanli(String cardID, String kouliang){
        Btn_crkdgl_Update.click();    //进入入库单管理调整页面
        delay(1000);

        //输入登记卡号查询,选择单据
        safeClick(Ipt_crkdgl_DengjiCardID);
        safeSendkeys(Ipt_crkdgl_DengjiCardID, cardID);
        safeClick(Btn_crkdgl_Chaxun);
        Reporter.log("查询登记卡号：" + cardID + "成功！");
        safeClick(RBtn_crkdgl_Churukudan);
        safeClick(Btn_crkdgl_Update);
        Reporter.log("对登记卡号为" + cardID + "的单据进行数据调整");

        //点击检验检斤信息
        safeClick(Btn_crkdgl_Update_JianyanJianjinXinxi);

        //修改其他扣量信息
        //String qitakouliang = Ipt_crkdgl_Update_QitaKouliang.getAttribute("value");
        //if (qitakouliang.equals(null)){
        Ipt_crkdgl_Update_QitaKouliang.sendKeys(kouliang);
        //}else {}
        safeClick(Btn_crkdgl_Update_Commit);
        Reporter.log("修改其他扣量信息为：" + kouliang + "，保存成功！");
    }

    public void deleteRukudanGuanli() {
        try {
            delay(1000);
            RBtn_crkdgl_Churukudan.click();  //选中单据
            safeClick(Btn_crkdgl_Delete);
            Reporter.log("作废单据成功!");
        } catch (StaleElementReferenceException eo) {
            Reporter.log("出现StaleElementReferenceException错误");
        } catch (NoSuchElementException e1) {
            Reporter.log("出现NoSuchElementException错误");
        }
    }

    /*************************
     * 出库单管理
     ************************/
    public void updateChukudanGuanli(String cardID, String kouliang){
        Btn_crkdgl_Update.click();    //进入出库单管理调整页面
        delay(1000);

        //输入登记卡号查询,选择单据
        safeClick(Ipt_crkdgl_DengjiCardID);
        safeSendkeys(Ipt_crkdgl_DengjiCardID, cardID);
        safeClick(Btn_crkdgl_Chaxun);
        Reporter.log("查询登记卡号：" + cardID + "成功！");
        safeClick(RBtn_crkdgl_Churukudan);
        safeClick(Btn_crkdgl_Update);
        Reporter.log("对登记卡号为" + cardID + "的单据进行数据调整");

        //点击检验检斤信息
        safeClick(Btn_crkdgl_Update_JianyanJianjinXinxi);

        //修改其他扣量信息
        //String qitakouliang = Ipt_crkdgl_Update_QitaKouliang.getAttribute("value");
        //if (qitakouliang.equals(null)){
        Ipt_crkdgl_Update_QitaKouliang.sendKeys(kouliang);
        //}else {}
        safeClick(Btn_crkdgl_Update_Commit);
        Reporter.log("修改其他扣量信息为：" + kouliang + "，保存成功！");
    }

    public void deleteChukudanGuanli() {
        try {
            delay(1000);
            RBtn_crkdgl_Churukudan.click();  //选中单据
            safeClick(Btn_crkdgl_Delete);
            Reporter.log("作废单据成功!");
        } catch (StaleElementReferenceException eo) {
            Reporter.log("出现StaleElementReferenceException错误");
        } catch (NoSuchElementException e1) {
            Reporter.log("出现NoSuchElementException错误");
        }
    }
}