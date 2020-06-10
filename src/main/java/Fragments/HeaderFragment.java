package Fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HeaderFragment {

    private final WebDriver driver;
    private WebElement aboutButton;
    private WebElement registerButton;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement submitButton;

    public HeaderFragment(WebDriver driver) {
        this.driver = driver;
        aboutButton = driver.findElement(By.xpath("//*[@href=\"/about/\" and @class=\"header-top-list__link\"]"));
        registerButton = driver.findElement(By.xpath("//*[@data-popup-handler='auth']"));
        emailField = driver.findElement(By.xpath("//*[@name=\"user_login\"]"));
        passwordField = driver.findElement(By.xpath("//*[@name=\"user_pw\"]"));
        submitButton = driver.findElement(By.xpath("//*[@id=\"form-auth\"]/div/div[2]/div[3]/button"));
    }

    public void selectAboutOption() {
        aboutButton.click();
    }

    public void registrationLoginSubmit() throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            registerButton.click();
            emailField.sendKeys("ewewewe@gmail.com");
            passwordField.sendKeys("11111");
            submitButton.click();
            Thread.sleep(2000);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}

