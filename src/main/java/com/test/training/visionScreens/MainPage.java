package com.test.training.visionScreens;

import com.test.training.test.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage extends BaseClass {
    ChromeDriver chromeDriver;

    String sportXpath = "/html/body/div[3]/nav/div[1]/div[3]/div[2]/div/span[13]/a";



    public MainPage(ChromeDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    WebElement getSportElement(){
        return chromeDriver.findElement(By.xpath(sportXpath));
    }



    public void clickOnSport(){
        getSportElement().click();
    }





}
