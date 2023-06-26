package com.Tests;

import com.Pages.PageRegister;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestRegister {
    WebDriver driver;
    PageRegister pageRegister;

    @BeforeEach
    public void setUp (){
        pageRegister = new PageRegister(driver);
        driver = pageRegister.chromeDriverConnection();
        pageRegister.link("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    @Tag("Proceso de registro")
    public void test01 () throws InterruptedException {
        pageRegister.register();
    }
}
