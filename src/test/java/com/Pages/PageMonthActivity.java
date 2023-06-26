package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageMonthActivity extends BasePage {
    By buttonAccount = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[1]/a");
    By buttonActivity = By.xpath("//*[@id=\"month\"]");
    By buttonType = By.xpath("//*[@id=\"transactionType\"]");
    By buttonActivityAll = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/form/table/tbody/tr[1]/td[2]/select/option[1]");
    By buttonTypeAll = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/form/table/tbody/tr[2]/td[2]/select/option[1]");
    By buttonGo = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/form/table/tbody/tr[3]/td[2]/input");
    By textDetails = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/h1");
    By text = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tfoot/tr/td");
    public PageMonthActivity(WebDriver driver) {
    }
    public void accountResumeMonth () throws InterruptedException {
        oprimir(buttonAccount);
        Thread.sleep(2000);
        comparar(textDetails,"Account Details");
        oprimir(buttonActivity);
        Thread.sleep(2000);
        oprimir(buttonActivityAll);
        Thread.sleep(2000);
        oprimir(buttonType);
        Thread.sleep(2000);
        oprimir(buttonTypeAll);
        Thread.sleep(2000);
        oprimir(buttonGo);

    }
}
