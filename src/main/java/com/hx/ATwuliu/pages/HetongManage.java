package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Administrator on 2019/4/1.
 */
public class HetongManage extends Actions {
    /************************************************************************************************************/
    //合同管理

    @FindBy(id="contractNum")
    private WebElement Ipt_hetonghao;    //合同号输入框

    @FindBy(xpath = "//tbody[@class='ant-table-tbody']//tr[1]/td[3]//span")
    private WebElement span_hetonghao;    //合同号标签

    @FindBy(xpath = "//tbody[@class='ant-table-tbody']//tr[1]/td[1]//input")
    private WebElement Ipt_fuxuankuang;    //合同复选框


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

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[6]")
    private WebElement Btn_1_tijiao;     //提交

    @FindBy(xpath = "//div[@class=\"ant-btn-group\"]/button[7]")
    private WebElement Btn_1_fujianweihu;     //附件维护

    @FindBy(xpath = "//div[@class=\"ant-row\"]/div[4]/div/div/div/span/button[1]")
    private WebElement Btn_1_check;   //查询按钮

    @FindBy(xpath = "//div[@class=\"ant-row\"]/div[4]/div/div/div/span/button[2]")
    private WebElement Btn_1_reset;   //重置按钮

    @FindBy(xpath = "//li[@title=\"上一页\"]//a[@class=\"ant-pagination-item-link\"]")
    private WebElement Lnk_1_pre;    //上一页

    @FindBy(xpath = "//li[@title=\"下一页\"]//a[@class=\"ant-pagination-item-link\"]")
    private WebElement Lnk_1_next;    //下一页

    /*合同管理新增页*/
    @FindBy(xpath = "//div[@class='index_curtainWrap-JNFSe ']//label[@title='合同号']/parent::div/following::div[1]//input")
    private WebElement ipt_hetonghao;    //新增合同输入框

    @FindBy(id="stockValue")
    private WebElement check_kucunxingzhi;    //库存性质选择框

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"合同类型\"]/parent::div/following::div[1]//i")
    private WebElement Icn_1_hetongleixing;     //合同类型下拉箭头


    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]//label[@title=\"客户\"]/parent::div/following::div[1]//input")
    private WebElement Ipt_1_kehu;    //客户文本框

    @FindBy(xpath = "//div[@class=\"ant-modal-body\"]//div[@class=\"query-form\"]//span/input")
    private WebElement Ipt_1_kehuName;   //客户查询输入框

    @FindBy(xpath = "//div[@class=\"ant-modal-body\"]//div[@class=\"query-form\"]//button")
    private WebElement Ipt_1_kehuCheck;   //客户查询按钮

    @FindBy(xpath = "//div[@class=\"ant-modal-footer\"]//button[1]")
    private WebElement Ipt_1_kehuCancel;   //客户弹框取消按钮

    @FindBy(xpath = "//div[@class=\"ant-modal-footer\"]//button[2]")
    private WebElement Ipt_1_kehuConfirm;   //客户弹框确定按钮

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]/div/div[3]//button[1]")
    private WebElement Btn_1_return;     //返回按钮

    @FindBy(xpath = "//div[@class=\"index_curtainWrap-JNFSe \"]/div/div[3]//button[2]")
    private WebElement Btn_1_confirm;     //确定按钮

    /************************************************************************************************************/

    public HetongManage() {
    }
}
