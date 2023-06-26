package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin extends BasePage {
    By username = By.name("username");
    By password = By.name("password");
    By buttonLogin = By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input");
    public PageLogin(WebDriver driver) {}
    public void logIn() throws InterruptedException {
        teclear("sera02",username);
        teclear("123456",password);
        Thread.sleep(2000);
        oprimir(buttonLogin);

    }
}
