package Pages;

import Fragments.HeaderFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private HeaderFragment headerFragment;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        headerFragment = new HeaderFragment(driver);
    }

    public HeaderFragment getHeaderFragment() {
        return headerFragment;
    }
}
