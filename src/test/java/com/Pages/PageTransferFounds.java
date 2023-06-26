package com.Pages;
import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageTransferFounds extends BasePage {
    By buttonTransferFounds = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a");
    By inputAmount = By.name("input");
    By buttonFrom = By.xpath("//*[@id=\"fromAccountId\"]");
    By buttonTo = By.xpath("//*[@id=\"toAccountId\"]");
    By buttonAcount01 = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]/option[1]");
    By buttonAcount02 = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]/option[2]");
    By buttonTransfer = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[2]/input");
    By textConfirm = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/p[1]");
    public PageTransferFounds(WebDriver driver) {
    }
    public void transferFounds () throws InterruptedException {
        oprimir(buttonTransferFounds);
        teclear("50",inputAmount);
        oprimir(buttonFrom);
        oprimir(buttonAcount02);
        oprimir(buttonTo);
        oprimir(buttonAcount01);
        Thread.sleep(1000);
        oprimir(buttonTransfer);
        Thread.sleep(3000);
        comparar(textConfirm,"$50.00 has been transferred from account #14676 to account #14454. " );
    }
}
