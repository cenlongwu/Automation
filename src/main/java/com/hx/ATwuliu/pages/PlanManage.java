package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import static com.hx.ATwuliu.util.InitPre.driver;

/**
 * Created by Administrator on 2019/4/1.
 */
public class PlanManage extends Actions {
    /************************************************************************************************************/
    //购销计划

    @FindBy(xpath = "//div[@class=\"TabLayout_main-3aecS\"]/div[1]/div[1]/div[1]/button")
    private WebElement Btn_closeOthers;     //关闭其他

    /*购销计划列表页*/
    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[1]")
    private WebElement Btn_1_add;     //新增

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[2]")
    private WebElement Btn_1_modify;     //修改

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[3]")
    private WebElement Btn_1_delete;     //删除

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[4]")
    private WebElement Btn_1_post;     //提交

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[5]")
    private WebElement Btn_1_complete;     //完成

    @FindBy(xpath = "//div[@class=\"query-form\"]//label[@title=\"计划文号\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_1_planNum;     //计划文号查询框

    @FindBy(xpath = "//div[@class=\"ant-row\"]/div[8]/div/div/div/span/button[1]")
    private WebElement Btn_1_check;   //查询按钮

    @FindBy(xpath = "//div[@class=\"ant-row\"]/div[8]/div/div/div/span/button[2]")
    private WebElement Btn_1_reset;   //重置按钮

    @FindBy(xpath = "//tr[@data-row-key=\"uk_2\"]//input[1]")
    private WebElement Chk_1_plan;    //列表数据复选框 第一行数据（第二行为：uk_3）

    @FindBy(xpath = "//li[@title=\"上一页\"]//a[@class=\"ant-pagination-item-link\"]")
    private WebElement Lnk_1_pre;    //上一页

    @FindBy(xpath = "//li[@title=\"上一页\"]//a[@class=\"ant-pagination-item-link\"]")
    private WebElement Lnk_1_next;    //下一页

    /*购销计划新增页*/
    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"计划文号\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_1_planNum2;        //计划文号文本框

    @FindBy(xpath = "//*[@id=\"type\"]/div/span/i")
    private WebElement Icn_1_businessType;    //业务类型下选按钮

//    @FindBy(xpath = '//div[@class="index_curtainWrap-JNFSe "]//label[@title="业务类型"]/parent::div/following::div[1]//i')
//    private WebElement Icn_1_businessType;      //业务类型下拉箭头

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"品种\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_1_pinZhong;    //品种文本框

    @FindBy(xpath = "//div[@class=\"ant-modal-body\"]//div[@class=\"query-form\"]//span/input")
    private WebElement Ipt_1_pzName;   //品种名称查询输入框

    @FindBy(xpath = "//div[@class=\"ant-modal-body\"]//div[@class=\"query-form\"]//button")
    private WebElement Ipt_1_pzCheck;   //品种名称查询按钮

    @FindBy(xpath = "//div[@class=\"ant-modal-footer\"]//button[1]")
    private WebElement Ipt_1_pzCancel;   //品种名称弹框取消按钮

    @FindBy(xpath = "//div[@class=\"ant-modal-footer\"]//button[2]")
    private WebElement Ipt_1_pzConfirm;   //品种名称弹框确定按钮

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"等级\"]/parent::div/following::div[1]//i")
    private WebElement Icn_1_grade;     //等级下拉箭头

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"库存性质：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_1_kucunXingzhi;    //库存性质文本框

    @FindBy(xpath = "//ul[@class=\"ant-cascader-menu\"]//li[@title=\"中央储备\"]")
    private WebElement Lst_1_first;   //库存性质下拉框：中央储备

    @FindBy(xpath = "//ul[@class=\"ant-cascader-menu\"]//li[@title=\"特种储备\"]")
    private WebElement Lst_1_firstTofirst;     //库存性质下拉框：中央储备-特种储备

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"开始日期\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_1_startTime;   //开始日期文本框

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"截止日期\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_1_endTime;     //截止日期文本框

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"收获年度\"]/parent::div/following::div[1]//i")
    private WebElement Icn_1_harvestYear;       //收获年度下拉箭头 （下拉框选项隐藏方式如何定位）

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_26\"]/td[2]//div[@class=\"ant-select-selection__rendered\"]//input")
    private WebElement Ipt_1_cangWei;     //第一行仓位

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_26\"]/td[3]//input")
    private WebElement Ipt_1_num;     //第一行数量

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//button[1]")
    private WebElement Btn_1_return;     //返回按钮

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//button[2]")
    private WebElement Btn_1_confirm;     //确定按钮


    /************************************************************************************************************/
    //轮换计划

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[1]")
    private WebElement Btn_2_add;     //新增

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[2]")
    private WebElement Btn_2_modify;     //修改

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[3]")
    private WebElement Btn_2_delete;     //删除

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[4]")
    private WebElement Btn_2_post;     //提交

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[5]")
    private WebElement Btn_2_complete;     //完成

    @FindBy(xpath = "//div[@class=\"query-form\"]//label[@title=\"计划文号\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_2_planNum;     //计划文号查询框

    @FindBy(xpath = "//div[@class=\"ant-row\"]/div[7]/div/div/div/span/button[1]")
    private WebElement Btn_2_check;   //查询按钮

    @FindBy(xpath = "//div[@class=\"ant-row\"]/div[7]/div/div/div/span/button[2]")
    private WebElement Btn_2_reset;   //重置按钮

    @FindBy(xpath = "//tr[@data-row-key=\"uk_2\"]//input[1]")
    private WebElement Ipt_2_plan;    //列表数据复选框 第一行数据（第二行为：uk_3）

    @FindBy(xpath = "//li[@title=\"上一页\"]//a[@class=\"ant-pagination-item-link\"]")
    private WebElement Lnk_2_pre;    //上一页

    @FindBy(xpath = "//li[@title=\"上一页\"]//a[@class=\"ant-pagination-item-link\"]")
    private WebElement Lnk_2_next;    //下一页

    /*轮换计划新增页*/
    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"计划文号\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_2_planNum2;        //计划文号文本框

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"品种\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_2_pinZhong;    //品种文本框

    @FindBy(xpath = "//div[@class=\"ant-modal-body\"]//div[@class=\"query-form\"]//span/input")
    private WebElement Ipt_2_pzName;   //品种名称查询输入框

    @FindBy(xpath = "//div[@class=\"ant-modal-body\"]//div[@class=\"query-form\"]//button")
    private WebElement Ipt_2_pzCheck;   //品种名称查询按钮

    @FindBy(xpath = "//div[@class=\"ant-modal-footer\"]//button[1]")
    private WebElement Ipt_2_pzCancel;   //品种名称弹框取消按钮

    @FindBy(xpath = "//div[@class=\"ant-modal-footer\"]//button[2]")
    private WebElement Ipt_2_pzConfirm;   //品种名称弹框确定按钮

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"等级\"]/parent::div/following::div[1]//i")
    private WebElement Lnk_2_grade;     //等级下拉箭头

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"库存性质：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_2_kucunXingzhi;    //库存性质文本框

    @FindBy(xpath = "//ul[@class=\"ant-cascader-menu\"]//li[@title=\"中央储备\"]")
    private WebElement Lst_2_first;   //库存性质下拉框：中央储备

    @FindBy(xpath = "//ul[@class=\"ant-cascader-menu\"]//li[@title=\"特种储备\"]")
    private WebElement Lst_2_firstTofirst;     //库存性质下拉框：中央储备-特种储备

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"开始日期\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_startTime;   //开始日期文本框

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"截止日期\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_endTime;     //截止日期文本框

    @FindBy(xpath = "//*[@id=\"type\"]/div/span/i")
    private WebElement Icn_2_businessType;    //业务类型下选按钮

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_17\"]//span[@class=\"ant-select-arrow\"]//i")
    private WebElement Lnk_2_businessType;      //第一行业务类型下拉箭头（第二行为：uk_18）

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_17\"]/td[7]//i[1]")
    private WebElement Lnk_2_addLine;         //第一行新增一行（第二行为：uk_18）

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_17\"]/td[7]//i[2]")
    private WebElement Lnk_2_deleteLine;         //第一行删除一行（第二行为：uk_18）

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_17\"]/td[3]//div[@class=\"ant-select-selection__rendered\"]//input")
    private WebElement Ipt_2_cangWei;     //第一行仓位文本框

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_17\"]/td[4]//input")
    private WebElement Ipt_2_num;     //第一行数量文本框

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//button[1]")
    private WebElement Btn_2_return;     //返回按钮

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//button[2]")
    private WebElement Btn_2_confirm;     //确定按钮


    /************************************************************************************************************/
    //调入调出计划

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[1]")
    private WebElement Btn_3_add;     //新增

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[2]")
    private WebElement Btn_3_modify;     //修改

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[3]")
    private WebElement Btn_3_delete;     //删除

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[4]")
    private WebElement Btn_3_post;     //提交

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[5]")
    private WebElement Btn_3_complete;     //完成

    @FindBy(xpath = "//div[@class=\"query-form\"]//label[@title=\"计划文号\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_3_planNum;     //计划文号查询框

    @FindBy(xpath = "//div[@class=\"ant-row\"]/div[8]/div/div/div/span/button[1]")
    private WebElement Btn_3_check;   //查询按钮

    @FindBy(xpath = "//div[@class=\"ant-row\"]/div[8]/div/div/div/span/button[2]")
    private WebElement Btn_3_reset;   //重置按钮

    @FindBy(xpath = "//tr[@data-row-key=\"uk_2\"]//input[1]")
    private WebElement Ipt_3_plan;    //列表数据复选框 第一行数据（第二行为：uk_3）

    @FindBy(xpath = "//li[@title=\"上一页\"]//a[@class=\"ant-pagination-item-link\"]")
    private WebElement Lnk_3_pre;    //上一页

    @FindBy(xpath = "//li[@title=\"上一页\"]//a[@class=\"ant-pagination-item-link\"]")
    private WebElement Lnk_3_next;    //下一页

    /*调入调出计划新增页*/
    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"计划文号\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_3_planNum2;        //计划文号文本框

    @FindBy(xpath = "//*[@id=\"type\"]/div/span/i")
    private WebElement Icn_3_businessType;    //业务类型下选按钮

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"粮食去向\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_3_foodDestination;      //粮食去向文本框

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"品种\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_3_pinZhong;    //品种文本框

    @FindBy(xpath = "//div[@class=\"ant-modal-body\"]//div[@class=\"query-form\"]//span/input")
    private WebElement Ipt_3_pzName;   //品种名称查询输入框

    @FindBy(xpath = "//div[@class=\"ant-modal-body\"]//div[@class=\"query-form\"]//button")
    private WebElement Ipt_3_pzCheck;   //品种名称查询按钮

    @FindBy(xpath = "//div[@class=\"ant-modal-footer\"]//button[1]")
    private WebElement Ipt_3_pzCancel;   //品种名称弹框取消按钮

    @FindBy(xpath = "//div[@class=\"ant-modal-footer\"]//button[2]")
    private WebElement Ipt_3_pzConfirm;   //品种名称弹框确定按钮

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"等级\"]/parent::div/following::div[1]//i")
    private WebElement Lnk_3_grade;     //等级下拉箭头

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"库存性质：\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_3_kucunXingzhi;    //库存性质文本框

    @FindBy(xpath = "//ul[@class=\"ant-cascader-menu\"]//li[@title=\"中央储备\"]")
    private WebElement Lst_3_first;   //库存性质下拉框：中央储备

    @FindBy(xpath = "//ul[@class=\"ant-cascader-menu\"]//li[@title=\"特种储备\"]")
    private WebElement Lst_3_firstTofirst;     //库存性质下拉框：中央储备-特种储备

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"开始日期\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_3_startTime;   //开始日期文本框

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"截止日期\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_3_endTime;     //截止日期文本框

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_31\"]/td[6]//i[1]")
    private WebElement Lnk_3_addLine;         //第一行新增一行（第二行为：uk_32）

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_31\"]/td[6]//i[2]")
    private WebElement Lnk_3_deleteLine;         //第一行删除一行（第二行为：uk_32）

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_31\"]/td[2]//input")
    private WebElement Ipt_3_cangWei;     //第一行仓位文本框 （第二行：uk_32）

    @FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]//tr[@data-row-key=\"uk_31\"]/td[3]//input")
    private WebElement Ipt_3_num;     //第一行数量文本框 （第二行：uk_32）

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//button[1]")
    private WebElement Btn_3_return;     //返回按钮

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//button[2]")
    private WebElement Btn_3_confirm;     //确定按钮

    /************************************************************************************************************/

    public PlanManage() {
    }

    private String PlanWenhao;

    public String addGouxiaojihua(String planWenhao, String yewuType, String pinzhong, String dengji, String kucunXingzhi_1,
                                   String kucunXingzhi_2, String getYear, String cangwei, String number){
        Btn_1_add.click();    //进入购销计划新增页面
        delay(1000);
        this.PlanWenhao = planWenhao;
        Reporter.log("新增购销计划/计划文号为："+PlanWenhao);
        System.out.println(this.PlanWenhao);
        Ipt_1_planNum2.click();
        Ipt_1_planNum2.sendKeys(planWenhao);       //输入计划文号
                                                     //选择业务类型
        safeClick(Ipt_1_pinZhong);                 //选择品种
        safeSendkeys(Ipt_1_pzName,pinzhong);       //搜索框输入品种
        Ipt_1_pzCheck.click();
        delay(1000);
        //RBtn_Pinzhong.click();                     //单选品种
        Ipt_1_pzConfirm.click();
                                                     //选择等级
                                                     //选择库存性质
        Ipt_1_startTime.click();                   //选择开始日期
        delay(2000);
        WebElement startTime = driver.findElement(By.xpath("//input[@class=\"ant-calendar-input \"]"));
        startTime.clear();
        startTime.sendKeys(Keys.ENTER);
        Ipt_1_endTime.click();                     //选择截止日期
        delay(2000);
        WebElement endTime = driver.findElement(By.xpath("//input[@class=\"ant-calendar-input \"]"));
        endTime.clear();
        endTime.sendKeys(Keys.ENTER);
                                                     //选择收获年度
                                                     //选择仓位
        safeClick(Btn_1_confirm);                  //点击确认
        return this.PlanWenhao;
    }

    public void submitGouxiaojihua(){
        try{
            delay(1000);
            safeSendkeys(Ipt_1_planNum,this.PlanWenhao); //输入并查找计划文号
            safeClick(Btn_1_check);
            delay(1000);
            //RBtn_ChooseTongzhishu.click();  //选中搜到的计划文号
            safeClick(Btn_1_post);
        }catch(StaleElementReferenceException eo){
            Reporter.log("出现StaleElementReferenceException错误");
        }catch (NoSuchElementException e1){
            Reporter.log("出现NoSuchElementException错误");
        }
    }

    public void test(){
        Btn_1_add.click();    //进入购销计划新增页面
        delay(1000);
        Ipt_1_startTime.click();                   //选择开始日期
        delay(2000);
        WebElement startTime = driver.findElement(By.xpath("//input[@class=\"ant-calendar-input \"]"));
        startTime.clear();
        startTime.sendKeys(Keys.ENTER);
        Ipt_1_endTime.click();                     //选择截止日期
        delay(2000);
        WebElement endTime = driver.findElement(By.xpath("//input[@class=\"ant-calendar-input \"]"));
        endTime.clear();
        endTime.sendKeys(Keys.ENTER);
    }
}
