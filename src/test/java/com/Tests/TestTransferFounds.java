package com.Tests;

import com.Pages.PageAccountResume;
import com.Pages.PageLogin;
import com.Pages.PageTransferFounds;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestTransferFounds {
    WebDriver driver;
    PageLogin pageLogin;
    PageTransferFounds pageTransferFounds;
    PageAccountResume pageAccountResume;
    @BeforeEach
    public void setUp () throws InterruptedException {
        pageTransferFounds = new PageTransferFounds(driver);
        driver = pageTransferFounds.chromeDriverConnection();
        pageLogin = new PageLogin(null);
        pageAccountResume= new PageAccountResume(null) ;
        pageLogin.link("https://parabank.parasoft.com/parabank/index.htm");
        pageLogin.logIn();
        pageAccountResume.accountResume();
    }

    @Test
    @Tag("transferencia de fondos")
    public void testTransferFounds() throws InterruptedException {
      pageTransferFounds.transferFounds();
    };
}
