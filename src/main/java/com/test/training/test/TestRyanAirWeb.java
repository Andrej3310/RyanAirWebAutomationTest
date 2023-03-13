package com.test.training.test;

//import com.test.training.screens.MainPage;

import org.testng.annotations.Test;

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

}
