package Fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchFragment {
    private final WebDriver driver;
    private WebElement searchInput;
    private WebElement searchSubmit;

    public SearchFragment(WebDriver driver) {
        this.driver = driver;
        searchInput = driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
        // searchSubmit = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
    }

    public void fillSearchInput() {
        searchInput.click();
        searchInput.sendKeys("Chanel");
        searchInput.sendKeys(Keys.ENTER);
    }

    public void emptySearchResult() {
        searchInput.click();
        searchInput.sendKeys(Keys.ENTER);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
