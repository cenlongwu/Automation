package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.Actions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Administrator on 2019/4/22.
 */
public class KucunManage extends Actions{

    /************************************************************************************************************/
    //初期库存页面
    @FindBy(id = "xx")
    private WebElement Btn_add; //新增按钮

    @FindBy(id = "xx")
    private WebElement Btn_commit;  //提交按钮

    @FindBy(id = "xx")
    private WebElement Ipt_Lt_danjuNum;    //单据编号文本框

    @FindBy(id = "XX")
    private WebElement Ipt_Lt_Cangfang;    //仓房输入框

    @FindBy(id = "xx")
    private WebElement Btn_query;  //查询按钮

    @FindBy(id = "xx")
    private WebElement Btn_chongzhi;    //重置按钮

    @FindBy(id = "xx")
    private WebElement CBox_danju;  //列表数据多选框

    //新增页面
    @FindBy(id = "xx")
    private WebElement Ipt_danjuNum;    //新增页面单据编号

    @FindBy(id = "xx")
    private WebElement Ipt_pinzhong;    //品种文本框

    @FindBy(id = "xx")
    private WebElement Ipt_pzName;    //品种弹框-品种名称查询框

    @FindBy(id = "xx")
    private WebElement Btn_pzQuery;    //品种弹框-查询按钮

    @FindBy(id = "xx")
    private WebElement RBtn_pzRadio;    //品种弹框-单选按钮

    @FindBy(id = "xx")
    private WebElement Btn_pzConfirm;    //品种弹框-确定按钮

    @FindBy(id = "xx")
    private WebElement Div_grade;    //等级下拉框

    @FindBy(xpath = "//body/div[3]//li[1]")
    private WebElement DdBox_grade1;    //等级下拉框，一等；二等为：//body/div[3]//li[2],以此类推

    @FindBy(id = "xx")
    private WebElement Ipt_warehouse;    //仓房货位文本框

    @FindBy(xpath = "//body/div[4]//li[1]")
    private WebElement DdBox_warehouse1;    //仓房货位下拉框-第一个仓位，第二个为：//body/div[4]//li[2]

    @FindBy(id = "xx")
    private WebElement Div_harvestyear;    //收获年度

    @FindBy(xpath = "//body/div[5]//li[1]")
    private WebElement DdBox_harvestyear1;    //收获年度下拉框，第一个年份（2020），第二个为：//body/div[5]//li[2]

    @FindBy(id = "xx")
    private WebElement Ipt_country;    //国别

    @FindBy(id = "xx")
    private WebElement Ipt_countryName;    //国别弹框-国家名称文本框

    @FindBy(id = "xx")
    private WebElement Btn_countryQuery;    //国别弹框-查询按钮

    @FindBy(id = "xx")
    private WebElement RBtn_countryRadio;    //国别弹框-单选按钮

    @FindBy(id = "xx")
    private WebElement Btn_countryConfirm;    //国别弹框-确定按钮

    @FindBy(id = "xx")
    private WebElement Ipt_chandi;    //产地

    @FindBy(id = "xx")
    private WebElement Spn_chandiSpan;    //产地弹框-产地选项

    @FindBy(id = "xx")
    private WebElement Btn_chandiConfirm;    //产地弹框-确定按钮

    @FindBy(id = "xx")
    private WebElement Ipt_earlyStock;    //年初库存

    @FindBy(id = "xx")
    private WebElement Ipt_stockNature;    //库存性质

    @FindBy(id = "xx")
    private WebElement DdBox_snZhongyang;    //库存性质下拉框-中央储备

    @FindBy(id = "xx")
    private WebElement DdBox_snTezhong;    //库存性质下拉框-特种储备

    @FindBy(id = "xx")
    private WebElement Ipt_currentStock;    //当前库存

    @FindBy(id = "xx")
    private WebElement Ipt_return;    //返回按钮

    @FindBy(id = "xx")
    private WebElement Btn_confirm;    //确定按钮

    private String ChuqiKucunBianhao;

    //新增仓房初期库存，参数为：品种名称、国家名称、初期库存数量、当前库存数量
    public String addChuqikucun(String pinzhongName, String countryName, String earlyStock, String currentStock){
        //点击新增按钮进入初期库存数据页面
        Btn_add.click();
        delay(1000);

        //获取新增数据时自动生成的单据编号
        this.ChuqiKucunBianhao = null;
        this.ChuqiKucunBianhao = Ipt_danjuNum.getAttribute("value");
        Reporter.log("新增初期库存单据编号为：" + ChuqiKucunBianhao);
        System.out.println(this.ChuqiKucunBianhao);

        //点击品种选择品种类型【pinzhongName】
        safeClick(Ipt_pinzhong);
        safeSendkeys(Ipt_pzName, pinzhongName);
        Btn_pzQuery.click();
        delay(1000);
        RBtn_pzRadio.click();
        Btn_pzConfirm.click();  //选择品种点击确定
        delay(1000);

        //点击等级，选择品种等级
        Div_grade.click();
        DdBox_grade1.click();   //选择一等

        //选择仓位
        Ipt_warehouse.click();
        DdBox_warehouse1.click();   //选择第一个仓位

        //选择收获年份
        Div_harvestyear.click();
        DdBox_harvestyear1.click(); //选择收获年份（2020年）

        //选择国家【countryName】
        safeClick(Ipt_country);
        safeSendkeys(Ipt_countryName, countryName);
        Btn_countryQuery.click();
        RBtn_countryRadio.click();
        Btn_countryConfirm.click();
        delay(1000);

        //填写库存数据信息【earlyStock、currentStock】
        safeSendkeys(Ipt_earlyStock, earlyStock);    //年初库存
        safeSendkeys(Ipt_earlyStock, currentStock);    //当前库存

        //选择库存性质
        Ipt_stockNature.click();
        DdBox_snTezhong.click();    //选择特种储备
        DdBox_snZhongyang.click();  //选择中央储备

        //确定按钮，保存页面数据
        Btn_confirm.click();

        //函数返回初期库存编号
        return this.ChuqiKucunBianhao;
    }

    public void submitChuqiKucun(String danjubianhao){
        try {
            delay(1000);
            safeSendkeys(Ipt_Lt_danjuNum, danjubianhao);
            safeClick(Btn_query);   //输入并查询初期库存单据编号
            delay(1000);
            safeClick(CBox_danju);  //点击列表数据复选框
            safeClick(Btn_commit);  //点击提交按钮
        }catch (StaleElementReferenceException eo){
            Reporter.log("出现StaleElementReferenceException错误");
        }catch (NoSuchElementException e1){
            Reporter.log("出现NoSuchElementException错误");
        }
    }

}
