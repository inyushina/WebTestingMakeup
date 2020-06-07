package ua.makeUp;

import Fragments.HeaderFragment;


import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import Fragments.SingletonWD;
import org.testng.annotations.Test;



public class FirstTest {
WebDriver driver;



    @BeforeTest
    public void setUp(){
        WebDriver webDriver = SingletonWD.getInstance("chrome");
 webDriver.get("https://makeup.com.ua/");
        System.out.println("test started");

    }



@Test
    public void AboutMenu(){
    BasePage basePage = new BasePage(driver);
    basePage.getHeaderFragment().selectAboutOption(); //this bitch doent click on about button....



}


}
