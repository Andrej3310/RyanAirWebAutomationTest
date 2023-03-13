package com.test.training.test;

import com.test.training.ryanAirScreens.MainRyanAirPage;
import com.test.training.visionScreens.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    ChromeDriver chromeDriver;
    MainPage mainPage;
    SportPage sportPage;
    SportVision sportVision;
    MainRyanAirPage mainRyanAirPage;

    @BeforeClass
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANDREJ\\Desktop\\chromedriver\\chromedriver1.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.ryanair.com/gb/en");
        chromeDriver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);


        mainPage = new MainPage(chromeDriver);
        sportPage = new SportPage(chromeDriver);
        sportVision = new SportVision(chromeDriver);
        mainRyanAirPage = new MainRyanAirPage(chromeDriver);
    }


    @AfterClass
    public void closedriver(){
        //chromeDriver.close();
    }




}
