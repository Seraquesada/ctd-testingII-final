package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRegister extends BasePage {

    String customer = "customer.";

    By firstName = By.name(customer+"firstName");
    By lastName = By.name(customer+"lastName");
    By street = By.name(customer+"address.street");
    By city = By.name(customer+"address.city");
    By state = By.name(customer+"address.state");
    By zipCode = By.name(customer+"address.zipCode");
    By phoneNumber = By.name(customer+"phoneNumber");
    By ssn = By.name(customer+"ssn");
    By userName = By.name(customer+"username");
    By password = By.name(customer+"password");
    By repeatedPassword = By.name("repeatedPassword");
    By buttonRegister = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input");
    By buttonGoToRegister = By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a");
    By textConfirmation = By.xpath("/html/body/div[1]/div[3]/div[2]/p");
    public PageRegister(WebDriver driver) {

    }

    public void register() throws InterruptedException {
        Thread.sleep(1000);
        oprimir(buttonGoToRegister);
        Thread.sleep(1000);
        teclear("sera",firstName);
        teclear("quesada",lastName);
        teclear("street",street);
        teclear("Buenos Aires",city);
        teclear("CABA",state);
        teclear("1425",zipCode);
        teclear("2222222",phoneNumber);
        teclear("1234",ssn);
        teclear("sera02",userName);
        teclear("123456",password);
        teclear("123456",repeatedPassword);
        Thread.sleep(3000);
        oprimir(buttonRegister);
        Thread.sleep(2000);
        comparar(textConfirmation,"Your account was created successfully. You are now logged in.");
    }

}
