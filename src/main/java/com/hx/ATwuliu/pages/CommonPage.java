package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.*;
import com.hx.ATwuliu.util.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import sun.font.Script;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static com.hx.ATwuliu.util.InitPre.driver;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by Administrator on 2019/3/30.
 */
public class CommonPage extends Actions{
    /*************************************************************************************/
    //页面控件

    /*登入页面*/
    @FindBy(id="username")
    private WebElement Ipt_usename;    //用户名输入框

    @FindBy(id="password")
    private WebElement Ipt_password;  //密码输入框

    @FindBy(tagName = "button")
    private WebElement Btn_login;     //登录按钮

    @FindBy(xpath = "//div[@id=\"app\"]/p[@class=\"loading-tip\"]/span[@id=\"percent\" and text()=\"100%\"]")
    private WebElement Txt_Percent100;  //加载100%


    /*主页面*/
    @FindBy(className = "Header_logo-2nvl7")
    private WebElement Div_logo;      //系统名标识

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li/a")
    private WebElement Href_L1_dashboard;  //首页链接

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/div")
    private WebElement Div_L1_JichuDangan;  //基础档案

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[1]/div")
    private WebElement Div_L2_JianyanShezhi;  //检验设置

    @FindBy(xpath = "//div[@class='ant-layout-sider-children']/ul/li[2]/ul/li[1]/ul/li[1]")
    private WebElement Li_L3_JianyanWeihuBiaozhun;  //检验维护标准

    @FindBy(xpath = "//div[@class='ant-layout-sider-children']/ul/li[2]/ul/li[1]/ul/li[2]")
    private WebElement Li_L3_KouliangKoujiaGongshi;  //扣量扣价公式

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[2]/div")
    private WebElement Div_L2_ShebeiGuanli;  //设备管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[2]/ul/li[1]")
    private WebElement Li_L3_YingjianShebeiXinxi;  //硬件设备信息

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[2]/ul/li[2]")
    private WebElement Li_L3_YingjianShebeiWeihu;  //硬件设备维护

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[2]/ul/li[3]")
    private WebElement Li_L3_DibangWeihu;  //地磅维护

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[3]/div")
    private WebElement Div_L2_ICkaGuanli;  //IC卡管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[3]/ul/li[1]")
    private WebElement Li_L3_ICkaChushihua;  //IC卡初始化

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[3]/ul/li[2]")
    private WebElement Li_L3_ICkaGenghuan;  //IC卡更换

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[4]/div")
    private WebElement Div_L2_KehuGuanli;  //客户管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[4]/ul/li[1]")
    private WebElement Li_L3_KehuWeihu;  //客户维护

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[4]/ul/li[2]")
    private WebElement Li_L3_SijiXinxi;  //司机信息

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[5]/div")
    private WebElement Div_L2_QitaWeihu;  //其他维护

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[2]/ul/li[5]/ul/li[1]")
    private WebElement Li_L3_LishiPizhong;  //历史皮重

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/div")
    private WebElement Div_L1_YewuGuanli;  //业务管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[1]/div")
    private WebElement Div_L2_ChurukudanPingzheng;  //出入库单凭证

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[1]/ul/li[1]")
    private WebElement Li_L3_RukuTongzhishu;  //入库通知书

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[1]/ul/li[2]")
    private WebElement Li_L3_ChukuTongzhishu;  //出库通知书

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[1]/ul/li[3]")
    private WebElement Li_L3_DanjuWanchengBaogaodan;  //单据完成报告单

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[1]/ul/li[4]")
    private WebElement Li_L3_ChukuTihuodan;  //出库提货单

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[2]/div")
    private WebElement Div_L2_JihuaGuanli;  //计划管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[2]/ul/li[1]")
    private WebElement Li_L3_GouxiaoJihua;  //购销计划

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[2]/ul/li[2]")
    private WebElement Li_L3_LunhuanJihua;  //轮换计划

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[2]/ul/li[3]")
    private WebElement Li_L3_DiaoruDiaochuJihua;  //调入调出计划

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[3]/div")
    private WebElement Div_L2_HetongGuanli;  //合同管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[3]/ul/li[1]")
    private WebElement Li_L3_HetongGuanli;  //合同管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[4]/div")
    private WebElement Div_L2_DaibanShixiang;  //待办事项

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[4]/ul/li[1]")
    private WebElement Li_L3_ShenpiChuli;  //审批处理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[3]/ul/li[4]/ul/li[2]")
    private WebElement Li_L3_ShenpiChaxun;  //审批查询

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/div")
    private WebElement Div_L1_ZhinengChuruku;  //智能出入库

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[1]/a")
    private WebElement Href_L2_DengjiGuanli;  //登记管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[2]/a")
    private WebElement Href_L2_DiaoduGuanli;  //调度管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[3]/a")
    private WebElement Href_L2_QianyangGuanli;  //扦样管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[4]/a")
    private WebElement Href_L2_JianyanGuanli;  //检验管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[5]/a")
    private WebElement Href_L2_JianjinGuanli;  //检斤管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[6]/a")
    private WebElement Href_L2_ZhicangChaxun;  //值仓查询

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[7]/a")
    private WebElement Href_L2_KuneiJiesuan;  //库内结算

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[8]/div")
    private WebElement Div_L2_ShishiJiankong;  //实时监控

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[8]/ul/li[1]")
    private WebElement Li_L3_LiuchengJiankong;  //流程监控

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[8]/ul/li[2]")
    private WebElement Li_L3_ChurukuZuoyeZhongzhi;  //出入库作业中止

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[8]/ul/li[3]")
    private WebElement Li_L3_ZuoyeTuxiangChaxun;  //作业图像查询

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[9]/div")
    private WebElement Div_L2_ShougongLuru;  //手工录入

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[9]/ul/li[1]")
    private WebElement Li_L3_RukudanLuru;  //入库单录入

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[9]/ul/li[2]")
    private WebElement Li_L3_ChukudanLuru;  //出库单录入

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[10]/div")
    private WebElement Div_L2_ChurukudanGuanli;  //出入库单管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[10]/ul/li[1]")
    private WebElement Li_L3_RukudanGuanli;  //入库单管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[4]/ul/li[10]/ul/li[2]")
    private WebElement Li_L3_ChukudanGuanli;  //出库单管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[5]/div")
    private WebElement Div_L1_ZhijianGuanli;  //质检管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[5]/ul/li[1]/div")
    private WebElement Div_L2_ZhijianGuanli;  //质检管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[5]/ul/li[1]/ul/li[1]")
    private WebElement Li_L3_ZhijianBaogaodan;  //质检报告单

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[5]/ul/li[1]/ul/li[2]")
    private WebElement Li_L3_BuyiCunliangGuanli;  //不宜存粮管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[5]/ul/li[2]/div")
    private WebElement Div_L2_ZhiliangTaizhang;  //质量台账

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[5]/ul/li[2]/ul/li[1]")
    private WebElement Li_L3_ZhiliangTaizhang;  //质量台账

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[6]/div")
    private WebElement Div_L1_KuncunGuanli;  //库存管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[6]/ul/li[1]/div")
    private WebElement Div_L2_KuncunGuanli;  //库存管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[6]/ul/li[1]/ul/li[1]")
    private WebElement Li_L3_ChuqiKucun;  //初期库存

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[6]/ul/li[1]/ul/li[2]")
    private WebElement Li_L3_KucunShuxingTiaozheng;  //库存属性调整

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[6]/ul/li[1]/ul/li[3]")
    private WebElement Li_L3_SunyiGuanli;  //损溢管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[6]/ul/li[1]/ul/li[4]")
    private WebElement Li_L3_DaocangZuoye;  //倒仓作业

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[6]/ul/li[2]/div")
    private WebElement Div_L2_KucunChaxun;  //库存查询

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[6]/ul/li[2]/ul/li[1]")
    private WebElement Li_L3_Cangfang;  //库存查询-仓房

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[6]/ul/li[2]/ul/li[2]")
    private WebElement Li_L3_Pinzhong;  //库存查询-品种

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/div")
    private WebElement Div_L1_BaobiaoChaxun;  //报表查询

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[1]/div")
    private WebElement Div_L2_MeiriTongji;  //每日统计

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[1]/ul/li")
    private WebElement Li_L3_MeiriChuruku;  //每日出入库

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[2]/div")
    private WebElement Div_L2_JihuaChaxun;  //计划查询

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[2]/ul/li[1]")
    private WebElement Li_L3_GouxiaoJihua_01;  //购销计划

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[2]/ul/li[2]")
    private WebElement Li_L3_LunhuanJihua_01;  //轮换计划

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[2]/ul/li[3]")
    private WebElement Li_L3_DiaoruDiaochuJihua_01;  //调入调出计划

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[3]/div")
    private WebElement Div_L2_HetongChaxun;  //合同查询

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[3]/ul/li")
    private WebElement Li_L3_GouxiaoHetongTaizhang;  //购销合同台账

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[4]/div")
    private WebElement Div_L2_LiangyouBaoguanzhang;  //粮油保管账

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[4]/ul/li[1]")
    private WebElement Li_L3_JizhangPingzheng;  //记账凭证

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[4]/ul/li[2]")
    private WebElement Li_L3_Mingxizhang;  //明细账

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[4]/ul/li[3]")
    private WebElement Li_L3_Zongzhang;  //总账

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[5]/div")
    private WebElement Div_L2_ShiwuTaizhang;  //实物台账

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[5]/ul/li")
    private WebElement Li_L3_DifangChubeiLiangyouKuncun;  //地方储备粮油库存

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[6]/div")
    private WebElement Div_L2_LiangyouZhijianJianyanJieguo;  //粮油质检检验结果

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[6]/ul/li[1]")
    private WebElement Li_L3_ShiyongZhiwuyou;  //食用植物油

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[6]/ul/li[2]")
    private WebElement Li_L3_Xiaomai;  //小麦

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[6]/ul/li[3]")
    private WebElement Li_L3_Daogu;  //稻谷

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[7]/div")
    private WebElement Div_L2_ZhiliangTaizhang_01;  //质量台账

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[7]/ul/li")
    private WebElement Li_L3_ZhiliangTaizhang_01;  //质量台账

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[8]/div")
    private WebElement Div_L2_KucunBaobiao;  //库存报表

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[8]/ul/li")
    private WebElement Li_L3_KucunBaobiao;  //库存报表

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[9]/div")
    private WebElement Div_L2_ChurukuZhixingQingkuang;  //出入库执行情况

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[9]/ul/li[1]")
    private WebElement Li_L3_RukuTongzhishu_01;  //入库通知书

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[7]/ul/li[9]/ul/li[2]")
    private WebElement Li_L3_ChukuTongzhishu_01;  //出库通知书

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/div")
    private WebElement Div_L1_XitongShezhi;  //系统设置

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[1]/div")
    private WebElement Div_L2_GongyongShezhi;  //公用设置

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[1]/ul/li[1]")
    private WebElement Li_L3_CanshuShezhi;  //参数设置

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[1]/ul/li[2]")
    private WebElement Li_L3_ShujuzidianWeihu;  //数据字典维护

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[1]/ul/li[3]")
    private WebElement Li_L3_JiekouquanxianWeihu;  //接口权限维护

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[1]/ul/li[4]")
    private WebElement Li_L3_DanjuDanhaoZidingyi;  //单据单号自定义

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[1]/ul/li[5]")
    private WebElement Li_L3_ChurukuLiuchengShezhi;  //出入库流程设置

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[1]/ul/li[6]")
    private WebElement Li_L3_XitongFenggeShezhi;  //系统风格设置

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[1]/ul/li[7]")
    private WebElement Li_L3_DayinShezhi;  //打印设置

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[1]/ul/li[8]")
    private WebElement Li_L3_CaidanShezhi;  //菜单设置

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[2]/div")
    private WebElement Div_L2_ZuzhiJigou;  //组织机构

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[2]/ul/li[1]")
    private WebElement Li_L3_ZuzhiJigouGuanli;  //组织机构管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[2]/ul/li[2]")
    private WebElement Li_L3_JueseGuanli;  //角色管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[2]/ul/li[3]")
    private WebElement Li_L3_ZhanghuGuanli;  //账户管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[2]/ul/li[4]")
    private WebElement Li_L3_ShenpiliuGuanli;  //审批流管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[3]/div")
    private WebElement Div_L2_JichuShuju;  //基础数据

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[3]/ul/li[1]")
    private WebElement Li_L3_CangfangShezhi;  //仓房设置

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[3]/ul/li[2]")
    private WebElement Li_L3_JianyanXiangmuWeihu;  //检验项目维护

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[4]/div")
    private WebElement Div_L2_RizhiHeBeifen;  //日志和备份

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[4]/ul/li[1]")
    private WebElement Li_L3_RizhiGuanli;  //日志管理

    @FindBy(xpath = "//div[@class=\"ant-layout-sider-children\"]/ul/li[8]/ul/li[4]/ul/li[2]")
    private WebElement Li_L3_ShujuBeifen;  //数据备份

    @FindBy(className = "ant-layout-sider-trigger")
    private WebElement Div_SidePullFrame;  //侧拉框按键

    @FindBy(xpath = "//div[@class=\"ant-tabs-nav ant-tabs-nav-animated\"]/div/div[@aria-selected=\"true\"]/div/i")
    private WebElement I_close;  //当前页面关闭按键


    /*************************************************************************************/


    /*************************************************************************************/
    //封装完可执行的方法
    String tabname;
    private static ScriptEngine javaScriptEngine;
    public void fetchTabName()throws ScriptException {
        JavascriptExecutor je = (JavascriptExecutor) driver;
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine scriptEngine = manager.getEngineByName("js");
            javaScriptEngine = scriptEngine;
        //tabname=(String)scriptEngine.eval("document.getElementsByClassName(\"Header_logo-2nvl7\").innerHTML");
        javaScriptEngine.eval("var XX=XXX");
        tabname=(String) javaScriptEngine.getContext().getAttribute("XX");
        //ScriptContext context = scriptEngine.getContext();
        //tabname=context.toString();

        //tabname=(String)je.executeScript("$(\"[aria-selected=true]\").children(\"div\").text()");
        //tabname=(String)je.executeScript("$(\".ant-tabs-nav-wrap .ant-tabs-tab-active\").text()");
        System.out.println(tabname);
        //Reporter.log(tabname);
        //return tabname;
    }

    public void login(String expectedTitle,String username,String password){
        //waitForPageLoad();
        try {
            delay(6000);
            while (Txt_Percent100.isDisplayed()) {
                int n = 0;
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("location.reload()");
                delay(2000);
                n = n++;
                Reporter.log("页面打开失败" + n + "次");
                if(Ipt_usename.isDisplayed()){
                    break;
                }
            }
        }catch(Exception e1){
            Reporter.log("页面一次打开即成功");
        }
        safeSendkeys(Ipt_usename,username);
        Ipt_password.sendKeys(password);
        assertTitle(expectedTitle);
        Btn_login.click();
    }

    public void closeCurrentTab(){    //关闭当前标签页
        safeClick(I_close);
    }

    public void accessL3Rukutongzhishu(){   //进入入库通知书页面
        accessL3Page( Div_L1_YewuGuanli,  Div_L2_ChurukudanPingzheng,  Li_L3_RukuTongzhishu);
    }

    public void accessL3Chukutongzhishu(){   //进入出库通知书页面
        accessL3Page( Div_L1_YewuGuanli,  Div_L2_ChurukudanPingzheng,  Li_L3_ChukuTongzhishu);
    }

    public void accessL3Chukutihuodan(){   //进入出库提货单页面
        accessL3Page( Div_L1_YewuGuanli,  Div_L2_ChurukudanPingzheng,  Li_L3_ChukuTihuodan);
    }

    public void accessL3Gouxiaojihua(){   //进入购销计划页面
        accessL3Page( Div_L1_YewuGuanli,  Div_L2_JihuaGuanli,  Li_L3_GouxiaoJihua);
    }

    public void accessL3Lunhuanjihua(){   //进入轮换计划页面
        accessL3Page( Div_L1_YewuGuanli,  Div_L2_JihuaGuanli,  Li_L3_LunhuanJihua);
    }

    public void accessL3Diaorudiaochujihua(){   //进入调入调出计划页面
        accessL3Page( Div_L1_YewuGuanli,  Div_L2_JihuaGuanli,  Li_L3_DiaoruDiaochuJihua);
    }

    public void accessL3Hetongguanli(){   //进入合同管理页面
        accessL3Page( Div_L1_YewuGuanli,  Div_L2_HetongGuanli,  Li_L3_HetongGuanli);
    }

    public void accessL3Shenpichul(){   //进入审批处理页面
        accessL3Page( Div_L1_YewuGuanli,  Div_L2_DaibanShixiang,  Li_L3_ShenpiChuli);
    }

    //进入智能出入库各级菜单页面
    public void accessL2DengjiManage(){   //进入登记管理页面
        accessL3Page( Div_L1_ZhinengChuruku,  Href_L2_DengjiGuanli,null);
    }

    public void accessL2DiaoduManage(){   //进入调度管理页面
        accessL3Page( Div_L1_ZhinengChuruku,  Href_L2_DiaoduGuanli,null);
    }

    public void accessL2QianyangManage(){   //进入扦样管理页面
        accessL3Page( Div_L1_ZhinengChuruku,  Href_L2_QianyangGuanli,null);
    }

    public void accessL2JianyanManage(){   //进入检验管理页面
        accessL3Page( Div_L1_ZhinengChuruku,  Href_L2_JianyanGuanli,null);
    }

    public void accessL2JianjinManage(){   //进入检斤管理页面
        accessL3Page( Div_L1_ZhinengChuruku,  Href_L2_JianjinGuanli,null);
    }

    public void accessL2ZhicangChaxun(){   //进入值仓查询页面
        accessL3Page( Div_L1_ZhinengChuruku,  Href_L2_ZhicangChaxun,null);
    }

    public void accessL2KuneiJiesuan(){   //进入库内结算页面
        accessL3Page( Div_L1_ZhinengChuruku,  Href_L2_KuneiJiesuan,null);
    }

    public void accessL3LiuchengJiankong(){   //进入实时监控-流程监控页面
        accessL3Page( Div_L1_ZhinengChuruku,  Div_L2_ShishiJiankong, Li_L3_LiuchengJiankong);
    }

    public void accessL3ChurukuZuoyeEnd(){   //进入实时监控-出入库作业中止页面
        accessL3Page( Div_L1_ZhinengChuruku,  Div_L2_ShishiJiankong, Li_L3_ChurukuZuoyeZhongzhi);
    }

    public void accessL3ZuoyeTuxiangChaxun(){   //进入实时监控-作业图像查询页面
        accessL3Page( Div_L1_ZhinengChuruku,  Div_L2_ShishiJiankong, Li_L3_ZuoyeTuxiangChaxun);
    }

    public void accessL3RukudanLuru(){   //进入手工录入-入库单录入页面
        accessL3Page( Div_L1_ZhinengChuruku,  Div_L2_ShougongLuru, Li_L3_RukudanLuru);
    }

    public void accessL3ChukudanLuru(){   //进入手工录入-出库单录入页面
        accessL3Page( Div_L1_ZhinengChuruku,  Div_L2_ShougongLuru, Li_L3_ChukudanLuru);
    }

    public void accessL3RukudanManage(){   //进入出入库单管理-入库单管理页面
        accessL3Page( Div_L1_ZhinengChuruku,  Div_L2_ChurukudanGuanli, Li_L3_RukudanGuanli);
    }

    public void accessL3ChukudanManage(){   //进入出入库单管理-出库单录入页面
        accessL3Page( Div_L1_ZhinengChuruku,  Div_L2_ChurukudanGuanli, Li_L3_ChukudanGuanli);
    }


    /***********仅供测试************/
    /******************************/
    public void test(){
       // accessL3Page(Div_L1_YewuGuanli, Div_L2_ChurukudanPingzheng, Li_L3_RukuTongzhishu);
      //  accessL3Page(Div_L1_YewuGuanli, Div_L2_ChurukudanPingzheng, Li_L3_ChukuTongzhishu);
        accessL3Page(Div_L1_YewuGuanli, Div_L2_JihuaGuanli, Li_L3_GouxiaoJihua);
      //  closeCurrentedPage(I_close);
       // accessL3Page(Div_L1_ZhinengChuruku, Href_L2_DengjiGuanli, null);
       // accessL3Page(Div_L1_ZhinengChuruku, Href_L2_DiaoduGuanli, null);
       // accessL3Page(Div_L1_ZhinengChuruku, Href_L2_QianyangGuanli, null);
        // 字符串断言
        assertThat("test").isNotBlank() // 是否为" "字符串
                .as("字符串断言描述").isSubstringOf("test1") // 是否为test1的一部分
                .isSameAs("test") // 对象内元素是否相等
                .isNotEmpty() // 是否为空字符串
                .isEqualTo("test");// 是否相等

String ExpectedResult="";

        Assert.assertEquals("test",ExpectedResult);
        Assert.assertNotNull("test");

    }

}
