package ua.makeUp;

import Fragments.SingletonWD;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FirstTest {
    WebDriver driver;


    @BeforeClass
    public void setUp() {
        driver = SingletonWD.getInstance("chrome");
        driver.get("https://makeup.com.ua/");
        System.out.println("test started");

    }

    @AfterClass
    public void closeUp() {
        driver = SingletonWD.getInstance("chrome");
        driver.close();
        driver.quit();
        System.out.println("test finished");
    }


    @Test
    public void AboutMenu() {
        BasePage basePage = new BasePage(driver);
        basePage.getHeaderFragment().selectAboutOption();
        String title = basePage.getHeaderFragment().getDriver().getTitle();
        Assert.assertTrue(title.equals("О магазине - MAKEUP"));

    }

    @Test
    public void SearchFunctional() {
        BasePage basePage = new BasePage(driver);
        basePage.getSearchFragment().fillSearchInput();
        String title = basePage.getHeaderFragment().getDriver().getTitle();
        Assert.assertTrue(title.equals("Chanel — купить духи Шанель с бесплатной доставкой по Украине"));

    }

    @Test
    public void EmptySearch() {
        BasePage basePage = new BasePage(driver);
        basePage.getSearchFragment().emptySearchResult();
        driver.getClass().equals("serch-results");

    }

    @Test
    public void wrongLoginInput() throws InterruptedException {
        BasePage basePage = new BasePage(driver);
        basePage.getHeaderFragment().registrationLoginSubmit();
        driver.getClass().equals("popup-content");

    }

    @Test
    public void selectUkrIntarfaceLanguage() {
        BasePage basePage = new BasePage(driver);
        basePage.getFooterFragment().selectUkrLanguage();
        String title = basePage.getFooterFragment().getDriver().getTitle();
        Assert.assertTrue(title.equals("MAKEUP - косметика і парфумерія в інтернет-магазині №1"));
    }

    @Test
    public void selectRusIntarfaceLanguage() {
        BasePage basePage = new BasePage(driver);
        basePage.getFooterFragment().selectRusLanguage();
        String title = basePage.getFooterFragment().getDriver().getTitle();
        Assert.assertTrue(title.equals("MAKEUP - косметика и парфюмерия в интернет-магазине №1"));
    }


}
