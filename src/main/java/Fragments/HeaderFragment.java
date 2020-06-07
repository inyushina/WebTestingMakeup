package Fragments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HeaderFragment {


    private final WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div[1]/header/div[1]/div/div[2]/ul/li[5]")
    private WebElement aboutButton;

    public HeaderFragment(WebDriver driver) {
       this.driver = driver;
    }

    //  public HeaderFragment (WebDriver driver){ this.driver = driver;}


    public void selectAboutOption(){
    aboutButton.click();
    }


        }

