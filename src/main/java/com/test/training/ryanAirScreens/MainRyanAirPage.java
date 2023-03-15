package com.test.training.ryanAirScreens;

import com.test.training.test.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.List;


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
    String languageXpath = "/html/body/hp-app-root/hp-home-container/hp-home/hp-header/header/ry-header/div/div[3]/div/ry-language-selector/language-selector-button/button";
    String departureFieldXpath = "//*[@id=\"input-button__departure\"]";
    String searchButtonXpath = "/html/body/hp-app-root/hp-home-container/hp-home/hp-search-widget-container/hp-search-widget/div/hp-flight-search-widget-container/fsw-flight-search-widget-container/fsw-flight-search-widget/div/div/div/button";
    String oneWayXpath = "/html/body/hp-app-root/hp-home-container/hp-home/hp-search-widget-container/hp-search-widget/div/hp-flight-search-widget-container/fsw-flight-search-widget-container/fsw-flight-search-widget/fsw-trip-type-container/fsw-trip-type/fsw-trip-type-button[2]/button/label";
    String listOfAirportsXpath = "//*[@id=\"ry-tooltip-1\"]/div[2]/hp-app-controls-tooltips/fsw-controls-tooltips-container/fsw-controls-tooltips/fsw-origin-container/fsw-airports/div/fsw-airports-list/div[2]/div/fsw-airport-item";


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
    WebElement getLanguageElement(){
        return chromeDriver.findElement(By.xpath(languageXpath));
    }
    WebElement getDepartureElement(){
        return chromeDriver.findElement(By.xpath(departureFieldXpath));
    }
    WebElement getSearchButtonElement(){
        return chromeDriver.findElement(By.xpath(searchButtonXpath));
    }
    WebElement getOneWayElement(){
        return chromeDriver.findElement(By.xpath(oneWayXpath));
    }
    List<WebElement> getListAirports(){
        return (List<WebElement>) chromeDriver.findElements(By.xpath(listOfAirportsXpath));
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
    public void selectNewLanguage(String newLanguage) throws IOException {
        getLanguageElement().click();
        for (int i=1;i<40;i++){
            String languageXpath = "//*[@id=\"ry-tooltip-0\"]/div[2]/div/ry-markets-section/a[" + i + "]";
            WebElement pom = chromeDriver.findElement(By.xpath(languageXpath));
            String[] pom2 = pom.getText().split("\n");
            String[] pom3 = newLanguage.split(" ");

            if (pom3[0].equals("Belgium")){
                if (pom3[1].equals("Dutch")){
                    chromeDriver.findElement(By.xpath("//*[@id=\"ry-tooltip-0\"]/div[2]/div/ry-markets-section/a[2]")).click();
                    break;
                }
                else if (pom3[1].equals("French")){
                    chromeDriver.findElement(By.xpath("//*[@id=\"ry-tooltip-0\"]/div[2]/div/ry-markets-section/a[3]")).click();
                    break;
                }
                else{
                    System.out.println("The entered type of Belgium language does not exist.");
                    break;
                }
            }
            else if (pom3[0].equals("Spain")){
                if (pom3[1].equals("Catalan")){
                    chromeDriver.findElement(By.xpath("//*[@id=\"ry-tooltip-0\"]/div[2]/div/ry-markets-section/a[34]")).click();
                    break;
                }
                else if (pom3[1].equals("Spanish")){
                    chromeDriver.findElement(By.xpath("//*[@id=\"ry-tooltip-0\"]/div[2]/div/ry-markets-section/a[35]")).click();
                    break;
                }
                else{
                    System.out.println("The entered type of Spain language does not exist.");
                    break;
                }
            }
            else if(newLanguage.equals(pom2[0])){
                pom.click();
                break;
            }
        }
    }
    public void selectDepartureCountryAndCity(String country, String city) throws InterruptedException {
        getDepartureElement().click();
        for (int i=2;i<6;i++){
            for (int y=1;y<10;y++){
                String pateka = "//*[@id=\"ry-tooltip-1\"]/div[2]/hp-app-controls-tooltips/fsw-controls-tooltips-container/fsw-controls-tooltips/fsw-origin-container/fsw-airports/fsw-countries/div["+i+"]/div["+y+"]";
                WebElement drzava = chromeDriver.findElement(By.xpath(pateka));
                if(drzava.getText().equals(country)){
                    drzava.click();
                    break;
                }
            }
        }
        for (int i=0;i<=getListAirports().size();i++){
            System.out.println(getListAirports().get(i).getText());
            if (getListAirports().get(i).getText().equals(city)){
                getListAirports().get(i).click();
                break;
            }
        }
    }
    public void selectDestinationCountryAndCity(String drzava, String grad) throws InterruptedException {
        for (int i=2;i<6;i++){
            for (int y=1;y<10;y++){
                WebElement destinacijaDrzava = chromeDriver.findElement(By.xpath("//*[@id=\"ry-tooltip-3\"]/div[2]/hp-app-controls-tooltips/fsw-controls-tooltips-container/fsw-controls-tooltips/fsw-destination-container/fsw-airports/fsw-countries/div["+i+"]/div["+y+"]"));
                System.out.println(destinacijaDrzava.getText());
                if(destinacijaDrzava.getText().equals(drzava)){
                    destinacijaDrzava.click();
                    break;
                }
            }
        }
        if (getListAirports().size()==0){
            System.out.println("There are no flights from the selected departure country to " + drzava);
        }
        for (int i=1;i<getListAirports().size()+1;i++){
            if (getListAirports().get(i).getText().equals(grad)){
                getListAirports().get(i).click();
                break;
            }
        }
    }
    public void clickOnSearchButton(){
        getSearchButtonElement().click();
    }
    public void clickOnOneWayButton(){
        getOneWayElement().click();
    }






}