package com.test.training.visionScreens;

import com.test.training.test.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SportVision extends BaseClass {
    ChromeDriver chromeDriver;
    String registracijaLinkText = "Регистрация";
    String ImeName = "reg_firstname";
    String prezimeName = "reg_lastname";
    String emailName = "reg_email";
    String telId = "reg_phone";
    String adressId = "reg_address";
    String postalCodeId = "reg_postcode";
    String nomerId = "reg_street_no";
    String passwordId = "reg_password";
    String rePasswordId = "reg_password_repeat";
    String robotId = "recaptcha-anchor";
    String rulesXpath = "//*[@id=\"registration_modal\"]/div[2]/div[2]/div[2]/div[20]/div/div";


    public SportVision(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    WebElement getRegistracijaElement(){
        return chromeDriver.findElement(By.linkText(registracijaLinkText));
    }
    WebElement getNameElement(){
        return chromeDriver.findElement(By.name(ImeName));
    }
    WebElement getSurnameElement(){
        return chromeDriver.findElement(By.name(prezimeName));
    }
    WebElement getEmailElement(){
        return chromeDriver.findElement(By.name(emailName));
    }
    WebElement getTelElement(){
        return chromeDriver.findElement(By.id(telId));
    }
    WebElement getAdressElement(){
        return chromeDriver.findElement(By.id(adressId));
    }
    WebElement getPostalCodeElement(){
        return chromeDriver.findElement(By.id(postalCodeId));
    }
    WebElement getNomerElement(){
        return chromeDriver.findElement(By.id(nomerId));
    }
    WebElement getPasswordElement(){
        return chromeDriver.findElement(By.id(passwordId));
    }
    WebElement getRePasswordElement(){
        return chromeDriver.findElement(By.id(rePasswordId));
    }
    WebElement getRobotElement(){
        return chromeDriver.findElement(By.id(robotId));
    }
    WebElement getRulesElement(){
        return chromeDriver.findElement(By.xpath(rulesXpath));
    }


    public void ClickOnregistracija() throws InterruptedException {
        getRegistracijaElement().click();
    }
    public void EnterName(String ime){
        getNameElement().sendKeys(ime);
    }
    public void EnterSurname(String prezime){
        getSurnameElement().sendKeys(prezime);
    }
    public void EnterEmail(String email){
        getEmailElement().sendKeys(email);
    }
    public void EnterTel(String numbers){
        getTelElement().sendKeys(numbers);
    }
    public void EnterAdress(String adress){
        getAdressElement().sendKeys(adress);
    }
    public void EnterPostalCode(String postalCode){
        getPostalCodeElement().sendKeys(postalCode);
    }
    public void EnterNomer(String nomer){
        getNomerElement().sendKeys(nomer);
    }
    public void EnterPassword(String password){
        getPasswordElement().sendKeys(password);
    }
    public void ReEnterPassword(String rePassword){
        getRePasswordElement().sendKeys(rePassword);
    }
    public void ClickOnRobotButton(){
        getRobotElement().click();
    }
    public void SelectRules(){
        getRulesElement().click();
    }




}
