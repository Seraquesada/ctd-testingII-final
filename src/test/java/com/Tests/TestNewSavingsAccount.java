package com.Tests;

import com.Pages.PageLogin;
import com.Pages.PageNewSavingsAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestNewSavingsAccount {

    WebDriver driver;
    PageLogin pageLogin;
    PageNewSavingsAccount pageNewSavingsAccount;


    @BeforeEach
    public void setUp () throws InterruptedException {
        pageNewSavingsAccount = new PageNewSavingsAccount(driver);
        driver = pageNewSavingsAccount.chromeDriverConnection();
        pageLogin = new PageLogin(null);
        pageLogin.link("https://parabank.parasoft.com/parabank/index.htm");
        pageLogin.logIn();
    }
    @Test
    @Tag("apertura de una nueva cuenta")
    public void testOpenNewAccount() throws InterruptedException {
        pageNewSavingsAccount.openNewAccount();
    }

}
