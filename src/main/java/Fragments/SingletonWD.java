package Fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SingletonWD {
    private static WebDriver driver;
    public static WebDriver  getInstance (String browser) {
        if (driver == null) {
            if (browser.equals("firefox")) {
                new FirefoxDriver();
            } else if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\kristina.iniushyna\\Desktop\\WebTestingMakeup\\src\\main\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
            } else{
                throw new UnsupportedOperationException("Unknown browser" + browser);
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }
}
