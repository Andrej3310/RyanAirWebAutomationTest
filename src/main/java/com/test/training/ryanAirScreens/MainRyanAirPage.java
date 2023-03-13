package com.test.training.ryanAirScreens;

import com.test.training.test.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainRyanAirPage extends BaseClass {

    ChromeDriver chromeDriver;
    String logInXpath = "/html/body/hp-app-root/hp-home-container/hp-home/hp-header/header/ry-header/div/div[2]/hp-header-content-container/hp-header-content/hp-header-sections-group[2]/hp-header-menu-item[4]/button";
    String logInEmailXpath = "//*[@id=\"ry-modal-portal\"]/div/ry-auth-popup-container/div/ry-auth-popup/div/ry-login/form/ry-auth-email/ry-input-d/div/input";
    String signUpEmailXpath = "//*[@id=\"ry-modal-portal\"]/div/ry-auth-popup-container/div/ry-auth-popup/div/ry-signup/form/ry-auth-email/ry-input-d/div/input";
    String privacyXpath = "//*[@id=\"cookie-popup-with-overlay\"]/div/div[3]/button[2]";
    String loginPasswordXpath = "//*[@id=\"ry-modal-portal\"]/div/ry-auth-popup-container/div/ry-auth-popup/div/ry-login/form/ry-auth-password/ry-input-d/div/input";
    String signUpPasswordXpath = "//*[@id=\"ry-modal-portal\"]/div/ry-auth-popup-container/div/ry-auth-popup/div/ry-signup/form/ry-auth-password/ry-input-d/div/input";
    String signUpButtonXpath = "//*[@id=\"ry-modal-portal\"]/div/ry-auth-popup-container/div/ry-auth-popup/div/ry-signup/form/ry-auth-submit/button";
    String loginButtonXpath = "//*[@id=\"ry-modal-portal\"]/div/ry-auth-popup-container/div/ry-auth-popup/div/ry-login/form/ry-auth-submit/button";
    String signUpXpath = "/html/body/hp-app-root/hp-home-container/hp-home/hp-header/header/ry-header/div/div[2]/hp-header-content-container/hp-header-content/hp-header-sections-group[2]/hp-header-menu-item[3]/button/span";


    public MainRyanAirPage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    WebElement getSignInElement(){
        return chromeDriver.findElement(By.xpath(logInXpath));
    }
    WebElement getLoginEmailElement(){
        return chromeDriver.findElement(By.xpath(logInEmailXpath));
    }
    WebElement getSignUpEmailElement(){
        return chromeDriver.findElement(By.xpath(signUpEmailXpath));
    }
    WebElement getPrivacyElement(){return chromeDriver.findElement(By.xpath(privacyXpath));}
    WebElement getLoginPasswordElement(){
        return chromeDriver.findElement(By.xpath(loginPasswordXpath));
    }
    WebElement getSignUpPasswordElement(){
        return chromeDriver.findElement(By.xpath(signUpPasswordXpath));
    }
    WebElement getSignUpElement(){
        return chromeDriver.findElement(By.xpath(signUpXpath));
    }
    WebElement getSignUpButtonElement(){
        return chromeDriver.findElement(By.xpath(signUpButtonXpath));
    }
    WebElement getLoginButtonElement(){
        return chromeDriver.findElement(By.xpath(loginButtonXpath));
    }


    public void clickOnLogIn(){
        getSignInElement().click();
    }
    public void enterLoginEmail(String email){
        getLoginEmailElement().sendKeys(email);
    }
    public void clickOnAgreePrivacy(){
        getPrivacyElement().click();
    }
    public void enterLoginPassword(String password){
        getLoginPasswordElement().sendKeys(password);
    }
    public void clickOnSignUp(){
        getSignUpElement().click();
    }
    public void enterSignUpEmail(String email){
        getSignUpEmailElement().sendKeys(email);
    }
    public void enterSignUpPassword(String password){
        getSignUpPasswordElement().sendKeys(password);
    }
    public void clickOnSignUpButton(){
        getSignUpButtonElement().click();
    }
    public void clickOnLoginButton(){
        getLoginButtonElement().click();
    }
    /*public void getCodeFromMail(){
        chromeDriver.navigate().to(“http://www.yahoo.com”);
    }*/






}