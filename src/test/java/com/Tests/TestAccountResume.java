package com.Tests;

import com.Pages.PageAccountResume;
import com.Pages.PageLogin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;

public class TestAccountResume {

    WebDriver driver;
    PageLogin pageLogin;
    PageAccountResume pageAccountResume;

    @BeforeEach
    public void setUp () throws InterruptedException {
        pageAccountResume = new PageAccountResume(driver);
        driver = pageAccountResume.chromeDriverConnection();
        pageLogin = new PageLogin(null);
        pageLogin.link("https://parabank.parasoft.com/parabank/index.htm");
        pageLogin.logIn();
    }
    @Test
    @Tag("visión general de la cuenta")
    public void testAccountResume() throws InterruptedException {
        pageAccountResume.accountResume();
    }
}
