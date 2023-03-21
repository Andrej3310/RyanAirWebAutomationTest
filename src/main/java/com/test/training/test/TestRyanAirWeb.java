package com.test.training.test;

//import com.test.training.screens.MainPage;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestRyanAirWeb extends BaseClass {
    @Test
    public void SignUp(){
        mainRyanAirPage.clickOnAgreePrivacy();
        mainRyanAirPage.clickOnSignUp();
        mainRyanAirPage.enterSignUpEmail("andrej.zahariev@yahoo.com");
        mainRyanAirPage.enterSignUpPassword("Ryanair2023");
        mainRyanAirPage.clickOnSignUpButton();
    }
    @Test
    public void LogIn(){
        mainRyanAirPage.clickOnAgreePrivacy();
        mainRyanAirPage.clickOnLogIn();
        mainRyanAirPage.enterLoginEmail("andrej.zahariev@yahoo.com");
        mainRyanAirPage.enterLoginPassword("Ryanair2023");
        mainRyanAirPage.clickOnLoginButton();
    }

    @Test
    public void ChangeLanguage() throws IOException {
        mainRyanAirPage.clickOnAgreePrivacy();
        mainRyanAirPage.selectNewLanguage("Belgium French");
    }

    @Test
    public void SearchFlights() throws InterruptedException {
        mainRyanAirPage.clickOnAgreePrivacy();
        mainRyanAirPage.clickOnOneWayButton();
        mainRyanAirPage.selectDepartureCountryAndCity("Bulgaria", "Varna");
        Thread.sleep(2000);
        mainRyanAirPage.selectDestinationCountryAndCity("Greece", "Thessaloniki");
        //mainRyanAirPage.clickOnSearchButton();
    }

    @Test
    public void CheckDepartureCountryExist(){
        mainRyanAirPage.clickOnAgreePrivacy();
        mainRyanAirPage.checkCountry("Turkey");
    }

    @Test
    public void ListOfAirportsFrom() throws InterruptedException {
        mainRyanAirPage.clickOnAgreePrivacy();
        mainRyanAirPage.selectCountryAndCity("Germany", "Dortmund");
    }

}
