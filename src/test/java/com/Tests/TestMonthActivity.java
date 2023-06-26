package com.Tests;

import com.Pages.PageAccountResume;
import com.Pages.PageLogin;
import com.Pages.PageMonthActivity;
import com.Pages.PageTransferFounds;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestMonthActivity {
    WebDriver driver;
    PageLogin pageLogin;
    PageAccountResume pageAccountResume;
    PageMonthActivity pageMonthActivity;

    @BeforeEach
    public void setUp () throws InterruptedException {
        pageMonthActivity = new PageMonthActivity(driver);
        driver = pageMonthActivity.chromeDriverConnection();
        pageLogin = new PageLogin(null);
        pageAccountResume= new PageAccountResume(null) ;
        pageLogin.link("https://parabank.parasoft.com/parabank/index.htm");
        pageLogin.logIn();
        pageAccountResume.accountResume();
    }

    @Test
    @Tag("actividad de la cuenta")
    public void testMonthActivity () throws InterruptedException {
        pageMonthActivity.accountResumeMonth();
    };
}
