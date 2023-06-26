package com.Tests;

import com.Pages.PageLogin;
import com.Pages.PageRegister;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestLogin {
    WebDriver driver;
    PageLogin pageLogin;

    @BeforeEach
    public void setUp (){
        pageLogin = new PageLogin(driver);
        driver = pageLogin.chromeDriverConnection();
        pageLogin.link("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void test01 () throws InterruptedException {
        pageLogin.logIn();
    }
}
