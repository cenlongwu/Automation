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
    private WebElement Btn_1_add; //新增按钮

    @FindBy(id = "xx")
    private WebElement Btn_1_commit;  //提交按钮

    @FindBy(id = "xx")
    private WebElement Ipt_Lt1_danjuNum;    //单据编号文本框

    @FindBy(id = "XX")
    private WebElement Ipt_Lt1_Cangfang;    //仓房输入框

    @FindBy(id = "xx")
    private WebElement Btn_1_query;  //查询按钮

    @FindBy(id = "xx")
    private WebElement Btn_1_chongzhi;    //重置按钮

    @FindBy(id = "xx")
    private WebElement CBox_1_danju;  //列表数据多选框

    //新增页面
    @FindBy(id = "xx")
    private WebElement Ipt_1_danjuNum;    //新增页面单据编号

    @FindBy(id = "xx")
    private WebElement Ipt_1_pinzhong;    //品种文本框

    @FindBy(id = "xx")
    private WebElement Ipt_1_pzName;    //品种弹框-品种名称查询框

    @FindBy(id = "xx")
    private WebElement Btn_1_pzQuery;    //品种弹框-查询按钮

    @FindBy(id = "xx")
    private WebElement RBtn_1_pzRadio;    //品种弹框-单选按钮

    @FindBy(id = "xx")
    private WebElement Btn_1_pzConfirm;    //品种弹框-确定按钮

    @FindBy(id = "xx")
    private WebElement Div_1_grade;    //等级下拉框

    @FindBy(xpath = "//body/div[5]//li[text()=\"一等\"]")
    private WebElement DdBox_1_grade1;    //等级下拉框-一等

    @FindBy(xpath = "//body/div[5]//li[text()=\"二等\"]")
    private WebElement DdBox_1_grade2;    //等级下拉框-二等

    @FindBy(xpath = "//body/div[5]//li[text()=\"三等\"]")
    private WebElement DdBox_1_grade3;    //等级下拉框-三等

    @FindBy(xpath = "//body/div[5]//li[text()=\"四等\"]")
    private WebElement DdBox_1_grade4;    //等级下拉框-四等

    @FindBy(xpath = "//body/div[5]//li[text()=\"五等\"]")
    private WebElement DdBox_1_grade5;    //等级下拉框-五等

    @FindBy(xpath = "//body/div[5]//li[text()=\"等外\"]")
    private WebElement DdBox_1_grade0;    //等级下拉框-等外

    @FindBy(id = "xx")
    private WebElement Ipt_1_warehouse;    //仓房货位文本框

    @FindBy(xpath = "//body/div[3]//li[text()=\"W01-中心库\"]")
    private WebElement DdBox_1_warehouse1;    //仓房货位下拉框，选择中心库W01仓房

    @FindBy(id = "xx")
    private WebElement Div_1_harvestyear;    //收获年度

    @FindBy(xpath = "//body/div[4]//li[text()=\"2020\"]")
    private WebElement DdBox_1_harvestyear2020;    //收获年度下拉框-年份2020

    @FindBy(xpath = "//body/div[4]//li[text()=\"2019\"]")
    private WebElement DdBox_1_harvestyear2019;    //收获年度下拉框-年份2019

    @FindBy(id = "xx")
    private WebElement Ipt_1_country;    //国别

    @FindBy(id = "xx")
    private WebElement Ipt_1_countryName;    //国别弹框-国家名称文本框

    @FindBy(id = "xx")
    private WebElement Btn_1_countryQuery;    //国别弹框-查询按钮

    @FindBy(id = "xx")
    private WebElement RBtn_1_countryRadio;    //国别弹框-单选按钮

    @FindBy(id = "xx")
    private WebElement Btn_1_countryConfirm;    //国别弹框-确定按钮

    @FindBy(id = "xx")
    private WebElement Ipt_1_chandi;    //产地

    @FindBy(id = "xx")
    private WebElement Spn_1_chandiSpan;    //产地弹框-产地选项

    @FindBy(id = "xx")
    private WebElement Btn_1_chandiConfirm;    //产地弹框-确定按钮

    @FindBy(id = "xx")
    private WebElement Ipt_1_stockNature;    //库存性质

    @FindBy(xpath = "//body/div[6]//li[text()=\"中央储备\"]")
    private WebElement DdBox_1_snZhongyang;    //库存性质下拉框-中央储备

    @FindBy(xpath = "//body/div[6]//li[text()=\"特种储备\"]")
    private WebElement DdBox_1_snTezhong;    //中央数倍下拉框-特种储备

    @FindBy(id = "xx")
    private WebElement Ipt_1_earlyStock;    //年初库存

    @FindBy(id = "xx")
    private WebElement Ipt_1_currentStock;    //当前库存

    @FindBy(id = "xx")
    private WebElement Ipt_1_return;    //返回按钮

    @FindBy(id = "xx")
    private WebElement Btn_1_confirm;    //确定按钮

    private String ChuqiKucunBianhao;

    //新增仓房初期库存，参数为：品种名称、国家名称、初期库存数量、当前库存数量
    public String addChuqikucun(String pinzhongName, String countryName, String earlyStock, String currentStock){
        //点击新增按钮进入初期库存数据页面
        Btn_add.click();
        delay(1000);

        //获取新增数据时自动生成的单据编号
        this.ChuqiKucunBianhao = null;
        this.ChuqiKucunBianhao = Ipt_1_danjuNum.getAttribute("value");
        Reporter.log("新增初期库存单据编号为：" + ChuqiKucunBianhao);
        System.out.println(this.ChuqiKucunBianhao);

        //点击品种选择品种类型【pinzhongName】
        safeClick(Ipt_1_pinzhong);
        safeSendkeys(Ipt_1_pzName, pinzhongName);
        Btn_1_pzQuery.click();
        delay(1000);
        RBtn_1_pzRadio.click();
        Btn_1_pzConfirm.click();  //选择品种点击确定
        delay(1000);

        //点击等级，选择品种等级
        Div_1_grade.click();
        DdBox_1_grade1.click();   //选择一等

        //选择仓位
        Ipt_1_warehouse.click();
        DdBox_1_warehouse1.click();   //选择第一个仓位

        //选择收获年份
        Div_1_harvestyear.click();
        DdBox_1_harvestyear2020.click(); //选择收获年份（2020年）

        //选择国家【countryName】
        safeClick(Ipt_1_country);
        safeSendkeys(Ipt_1_countryName, countryName);
        Btn_1_countryQuery.click();
        RBtn_1_countryRadio.click();
        Btn_1_countryConfirm.click();
        delay(1000);

        //填写库存数据信息【earlyStock、currentStock】
        safeSendkeys(Ipt_1_earlyStock, earlyStock);    //年初库存
        safeSendkeys(Ipt_1_earlyStock, currentStock);    //当前库存

        //选择库存性质
        Ipt_1_stockNature.click();
        DdBox_1_snTezhong.click();    //选择特种储备
        DdBox_1_snZhongyang.click();  //选择中央储备

        //确定按钮，保存页面数据
        Btn_1_confirm.click();

        //函数返回初期库存编号
        return this.ChuqiKucunBianhao;
    }

    public void submitChuqiKucun(String danjubianhao){
        try {
            delay(1000);
            safeSendkeys(Ipt_Lt1_danjuNum, danjubianhao);
            safeClick(Btn_1_query);   //输入并查询初期库存单据编号
            delay(1000);
            safeClick(CBox_1_danju);  //点击列表数据复选框
            safeClick(Btn_1_commit);  //点击提交按钮
        }catch (StaleElementReferenceException eo){
            Reporter.log("出现StaleElementReferenceException错误");
        }catch (NoSuchElementException e1){
            Reporter.log("出现NoSuchElementException错误");
        }
    }

    /************************************************************************************************************/
    //库存属性调整页面
    @FindBy(id = "xx")
    private WebElement Ipt_Lt2_warehouse;    //列表查询仓房文本框

    @FindBy(id = "xx")
    private WebElement Ipt_Lt2_pinzhong;    //列表查询品种文本框

    @FindBy(id = "xx")
    private WebElement Btn_2_add;    //新增按钮

    @FindBy(id = "xx")
    private WebElement Btn_2_commit;    //提交按钮

    @FindBy(id = "xx")
    private WebElement Btn_2_query;    //查询按钮

    @FindBy(id = "xx")
    private WebElement Btn_2_reset;    //重置按钮

    @FindBy(id = "xx")
    private WebElement CBox_2_shuju;    //列表数据多选框

    /*库存属性调整新增页面*/
    @FindBy(id = "xx")
    private WebElement Ipt_2_danjubianhao;    //单据编号文本框

    @FindBy(id = "xx")
    private WebElement Ipt_2_yewushijian;    //业务时间文本框

    @FindBy(id = "xx")
    private WebElement Ipt_2_warehouse;    //仓房货位文本框

    @FindBy(xpath = "//body/div[3]//li[text()=\"W01-中心库\"]")
    private WebElement DdBox_2_warehouse;    //仓房货位下拉框，选择中心库的W01仓房

    @FindBy(id = "xx")
    private WebElement Ipt_2_pinzhong;    //品种文本框

    @FindBy(id = "xx")
    private WebElement Ipt_2_pzName;    //品种弹框-品种名称文本框

    @FindBy(id = "xx")
    private WebElement Btn_2_pzQuery;    //品种弹框-查询按钮

    @FindBy(id = "xx")
    private WebElement RBtn_2_pzRadio;    //品种弹框-单选按钮(第一个单选按钮)

    @FindBy(id = "xx")
    private WebElement Btn_2_pzConfirm;    //品种弹框-确定按钮

    @FindBy(id = "xx")
    private WebElement Ipt_2_grade;    //等级文本框

    @FindBy(xpath = "//body/div[4]//li[text()=\"一等\"]")
    private WebElement DdBox_2_grade1;    //等级下拉框-一等

    @FindBy(xpath = "//body/div[4]//li[text()=\"二等\"]")
    private WebElement DdBox_2_grade2;    //等级下拉框-二等

    @FindBy(xpath = "//body/div[4]//li[text()=\"三等\"]")
    private WebElement DdBox_2_grade3;    //等级下拉框-三等

    @FindBy(xpath = "//body/div[4]//li[text()=\"四等\"]")
    private WebElement DdBox_2_grade4;    //等级下拉框-四等

    @FindBy(xpath = "//body/div[4]//li[text()=\"五等\"]")
    private WebElement DdBox_2_grade5;    //等级下拉框-五等

    @FindBy(xpath = "//body/div[4]//li[text()=\"等外\"]")
    private WebElement DdBox_2_grade0;    //等级下拉框-等外

    @FindBy(id = "")
    private WebElement Ipt_2_country;    //国别

    @FindBy(id = "")
    private WebElement Ipt_2_countryName;    //国别弹框-国家名称文本框

    @FindBy(id = "")
    private WebElement Btn_2_countryQuery;    //国别弹框-查询按钮

    @FindBy(id = "")
    private WebElement RBtn_2_countryRadio;    //国别弹框-单选按钮

    @FindBy(id = "")
    private WebElement Btn_2_countryConfirm;    //国别弹框-确定按钮

    @FindBy(id = "")
    private WebElement Ipt_2_chandi;    //产地文本框

    @FindBy(id = "")
    private WebElement Spn_2_chandi;    //产地弹框-产地选项

    @FindBy(id = "")
    private WebElement Btn_2_chandiConfirm;    //产地弹框-确定按钮

    @FindBy(id = "")
    private WebElement Ipt_2_harvestyear;    //收获年度文本框

    @FindBy(xpath = "//body/div[6]//li[text()=\"2020\"]")
    private WebElement Ipt_2_harvestyear2020;    //收获年度下拉框-年份选项2020年

    @FindBy(xpath = "//body/div[6]//li[text()=\"2019\"]")
    private WebElement Ipt_2_harvestyear2019;    //收获年度下拉框-年份选项2019年

    @FindBy(id = "")
    private WebElement Ipt_2_stockNature;    //库存性质文本框

    @FindBy(xpath = "//body/div[7]//li[text()=\"中央储备\"]")
    private WebElement DdBox_2_snZhongyang;    //库存性质下拉框-中央储备

    @FindBy(xpath = "//body/div[7]//li[text()=\"特种储备\"]")
    private WebElement DdBox_2_snTezhong;    //中央储备下拉框-特种储备

    @FindBy(id = "")
    private WebElement Btn_2_return;    //返回按钮

    @FindBy(id = "")
    private WebElement Ipt_2_confirm;    //确定按钮
}
