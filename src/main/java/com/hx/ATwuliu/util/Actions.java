package com.hx.ATwuliu.util;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Function;
import static com.hx.ATwuliu.util.InitPre.driver;


/**
 * Created by Administrator on 2018/5/4.11
 */
public class Actions {


    //生成wait，供page页使用
    public WebDriverWait wait = new WebDriverWait(driver, 8);



    public static String timestamp;   //时间戳

//----------------------封装方法----------------------
    /**
     * 方法：页面跳转，等待直到JS:document.readyState=complete
     * 说明：有页面跳转的时候直接用waitForPageLoad()
//     * 编写人：吴岑龙
//     */
    public Function<WebDriver, Boolean> isPageLoaded() {
        return new Function<WebDriver, Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                JavascriptExecutor je = (JavascriptExecutor) driver;
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
    }

    public void waitForPageLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(isPageLoaded());
    }

    /**
     * 方法：判断想要选择的数据对应的WebElement对象，返回数据类型为WebElement
     * 说明：第一个参数为select对象，第二个参数是要选择的值,第三个参数为要选择的值的对象
     * 编写人：
     */
    /*
    public WebElement judgeWebElement(String value){

    }
    */


    /**
     * 方法：在下拉框中选择一个值
     * 说明：第一个参数为select对象，第二个参数是要选择的值,第三个参数为要选择的值的对象
     * 编写人：吴岑龙
     */
    public void select_DropdownBox(WebElement Sel_element, String selectValue, WebElement Sel_Value){
        wait.until(ExpectedConditions.elementToBeClickable(Sel_element));
        Sel_element.click();
        String currentSelectedText = Sel_element.getText();
        if (selectValue.equals(currentSelectedText) ){
            Reporter.log("当前Select已选中待选值 "+selectValue+"，不必作选择操作");}
        else {
            //选择selectValue对应的Sel_value对象控件
            Sel_Value.click();
            Reporter.log("已选中"+selectValue);

        }
        //
        /*
        Select select = new Select(Sel_element);
        String currentSelectedText;
        currentSelectedText=select.getFirstSelectedOption().getText();
        if (selectValue.equals(currentSelectedText) ){
            Reporter.log("当前Select已选中待选值 "+selectValue+"，不必作选择操作");}
        else {
            select.selectByVisibleText(selectValue);
            Reporter.log("已选中"+selectValue);

        }
        */
    }

    /**
     * 方法：比较下拉框中当前值与预期值
     * 说明：如果一致则返回true 否则false
     * 编写人：吴岑龙
     */
    public boolean comapre_SelectValue(WebElement Sel_element, String CFValue){
        Select select = new Select(Sel_element);
        String currentSelectedText;
        currentSelectedText=select.getFirstSelectedOption().getText();
        if (CFValue.equals(currentSelectedText) ){
            Reporter.log("当前下拉框的值为："+currentSelectedText);
            return true;
        }else{
            Reporter.log("当前下拉框的值为："+currentSelectedText);
            return false;
        }

    }


    /**
     * 方法：将浏览器滚动条滚动至页面元素，使之显示
     * 说明：参数中填写element
     * 编写人：吴岑龙
     */
     public void scroll_BarTo_element(WebElement element) {
         JavascriptExecutor je = (JavascriptExecutor) driver;
         je.executeScript("arguments[0].scrollIntoView(true);", element);
     }

     public static void setAttrByJS(WebElement webElement,String attr,String value){
         JavascriptExecutor je = (JavascriptExecutor) driver;
         je.executeScript("webElement.attr =value");
     }

//------------------断言和验证方法--------------------------
    /**
     * 方法：通过断言验证Title
     * 说明：1.参数为预期title，不通过无法执行后续测试
     *       2.直接在测试类使用
     * 编写人：吴岑龙
     */
    public static void assertTitle(String titleValue) {
        String currentTitle = driver.getTitle();
        try {
            Assert.assertEquals(currentTitle, titleValue);
            Reporter.log("验证Title:" + titleValue + " 验证通过");
        } catch (Exception e) {
            Reporter.log("Title验证失败");

        }
    }
        /**
         * 方法：延迟等待几秒
         * 说明：参数里面加入等待时间（毫秒）
         * 编写人：吴岑龙
         */
    public static void delay(int millis) {
        try {
              Thread.sleep(millis);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * 方法：生成实时时间
     * 说明：生成时间戳;格式为MMDDHHmm
     * 编写人：吴岑龙
     */

    public static String timestamp() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("MMddHHmm");
        timestamp=ft.format(date);
        return timestamp;
    }

    /**
     * 方法：更改URL地址，指向新的页面
     * 说明：参数为新的URL
     * 编写人：吴岑龙
     */
    public void switchToNewPage(String newURL){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.get(newURL);
    }

    /**
     * 方法：通过aria-expanded属性的值判断三级功能目录的打开与否，true为打开，false为关闭
     * 说明：参数为页面目录
     * 编写人：钱舒颖
     */
    public void accessL3Page(WebElement Common_L1, WebElement Common_L2, WebElement Common_L3){
        wait.until(ExpectedConditions.elementToBeClickable(Common_L1));
        String isExpanded_L01, isExpanded_L02;
        isExpanded_L01 = Common_L1.getAttribute("aria-expanded");
        System.out.println(isExpanded_L01);
        if(isExpanded_L01.equals("false")){
            //点击L01
            Common_L1.click();
            //点击L02
            Common_L2.click();
            //点击L03
            Common_L3.click();
        }
        else {
            isExpanded_L02 = Common_L2.getAttribute("aria-expanded");
            System.out.println(isExpanded_L02);
            if (isExpanded_L02.equals("false")){
                //点击L02
                Common_L2.click();
                delay(1000);
                //点击L03
                Common_L3.click();
            }
            else {
                //点击L03
                Common_L3.click();
            }
        }
    }


    /**
     * 方法：通过aria-selected属性判断是否为当前页面，true是，false否，关闭当前页面
     * 说明：参数为“X”按钮
     * 编写人：钱舒颖
     */
    public void closeCurrentedPage(WebElement webElement){
        webElement.click();
    }


    /*
     * 方法：安全点击按钮，异常处理，循环重试
     * 说明：参数为弹出框页面按钮
     * 编写人：钱舒颖、黄蕾
     */
    public void safeClick(WebElement webElement){
        int error = 0;

        for(int i=0;i<2;i++){
            try{
                error = 0;
                wait.until(ExpectedConditions.visibilityOf(webElement));
                wait.until(ExpectedConditions.elementToBeClickable(webElement));
                webElement.click();
            }
            catch (StaleElementReferenceException e1){
                error = 1;
                Reporter.log("按钮点击失败");
            }
            catch (NoSuchElementException e2){
                error = 1;
                Reporter.log("按钮点击失败");
            }finally {
                if (error == 0) break;
            }
        }
    }

    /**
     * 方法：进行输入框安全输入数据，异常处理，循环重试
     * 说明：参数为页面输入框
     * 编写人：钱舒颖、黄蕾
     */
    public void safeSendkeys(WebElement webElement, String value){
        int error = 0;

        for(int i=0;i<2;i++){
            try{
                delay(1000);
                wait.until(ExpectedConditions.visibilityOf(webElement));
                wait.until(ExpectedConditions.elementToBeClickable(webElement));
                System.out.println("-------------------");
                error = 0;
                webElement.click();
                webElement.sendKeys(value);
                System.out.println("try-error = " + error);
            }
            catch (StaleElementReferenceException e1){
                error = 1;
                Reporter.log("输入框输入数据失败");
                System.out.println("StaleElementReferenceException error");
            }
            catch (NoSuchElementException e2){
                error = 1;
                Reporter.log("输入框输入数据失败");
                System.out.println("Exception error");
            }finally {
                //System.out.println("finally-error = " + error);
                if (error == 0) break;
            }
        }
    }


}
