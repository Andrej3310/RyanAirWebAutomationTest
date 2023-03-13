package com.test.training.ryanAirScreens;

import com.test.training.test.BaseClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyBookingsScreen extends BaseClass {
    ChromeDriver chromeDriver;

    public MyBookingsScreen(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
}
