package com.tutorialsninja.tests;

import com.basetest.BaseTest;
import com.pages.TutorialsNinjaLoginPage;
import org.testng.annotations.Test;

public class LoginTestUdemy extends BaseTest {

    @Test
    public void verifyLoginWithValidCredentials(){

        wdriver.get("https://tutorialsninja.com/demo/");
        TutorialsNinjaLoginPage tutorialsNinjaLoginPage = new TutorialsNinjaLoginPage(wdriver);
        tutorialsNinjaLoginPage.clickMyAccountLink();
        tutorialsNinjaLoginPage.clickLoginLink();
        tutorialsNinjaLoginPage.submitEmailAddress(txtEmailAddress);
        tutorialsNinjaLoginPage.submitPassWord(txtPassWord);
        tutorialsNinjaLoginPage.submitLogin();

    }
}
