package com.hx.ATwuliu.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.ui.Quotes;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;


/**
 * Created by Lenovo on 2019/4/17.
 */
public class Selector implements WrapsElement{
    private final WebElement element;
    //element:div下拉框
    public Selector(WebElement element) {
        String tagName = element.getTagName();
        if(null != tagName && "div".equals(tagName.toLowerCase())) {
            this.element = element;
        } else {
            throw new UnexpectedTagNameException("div", tagName);
        }
    }

    public WebElement getWrappedElement() {
        return this.element;
    }

    public void selectByVisibleText(String text) {
        WebElement lis = this.element.findElement(By.xpath("//ul[@role=\"listbox\"]/li[text() = " + Quotes.escape(text) + "]"));
        lis.click();
    }

}
