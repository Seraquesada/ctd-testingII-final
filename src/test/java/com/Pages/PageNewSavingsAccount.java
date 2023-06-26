package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageNewSavingsAccount extends BasePage {
    //boton para redirigir a /openaccount.htm
    By buttonOpenNewAccount = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[1]/a");
    By buttonAccountTypes = By.xpath("//*[@id=\"type\"]");
    By buttonSavings = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]/option[2]");

    //boton para abrir nueva cuenta
    By buttonNewAccount = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input");
    By textConfirmation = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/p[1]");
    public PageNewSavingsAccount(WebDriver driver) {

    }
    public void openNewAccount () throws InterruptedException {
        oprimir(buttonOpenNewAccount);
        Thread.sleep(1000);
        oprimir(buttonAccountTypes);
        Thread.sleep(1000);
        oprimir(buttonSavings);
        Thread.sleep(1000);
        oprimir(buttonNewAccount);
        Thread.sleep(2000);
        comparar(textConfirmation,"Congratulations, your account is now open.");
    }
}
