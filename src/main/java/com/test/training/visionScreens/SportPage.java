package com.test.training.visionScreens;

import com.test.training.test.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SportPage extends BaseClass {
    ChromeDriver chromeDriver;
    String nameOfPageXpath = "//*[@id=\"gestureZone\"]/div[3]/div[2]/div[1]/div[1]/section/h2/a";


    public SportPage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver; //cons
    }

    WebElement getPageNameElement(){
        return chromeDriver.findElement(By.xpath(nameOfPageXpath));
    }

    public String  checkNamePage(){
        return getPageNameElement().getText();
    }



}
