package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageAccountResume extends BasePage  {
    By buttonAccountResume = By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a");
    By text = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tfoot/tr/td");
    public PageAccountResume(WebDriver driver) {
    }

    public void accountResume () throws InterruptedException {
        oprimir(buttonAccountResume);
        Thread.sleep(3000);
        comparar(text,"*Balance includes deposits that may be subject to holds" );
    };
}
