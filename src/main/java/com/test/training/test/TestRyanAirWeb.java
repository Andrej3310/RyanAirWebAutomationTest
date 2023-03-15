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
        mainRyanAirPage.selectDepartureCountryAndCity("Greece", "Corfu");
        mainRyanAirPage.selectDestinationCountryAndCity("United Kingdom", "Thessaloniki");
        //mainRyanAirPage.clickOnSearchButton();
    }

}
