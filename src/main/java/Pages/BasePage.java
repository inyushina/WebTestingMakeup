package Pages;

import Fragments.FooterFragment;
import Fragments.HeaderFragment;
import Fragments.SearchFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private HeaderFragment headerFragment;
    private SearchFragment searchFragment;
    private FooterFragment footerFragment;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        headerFragment = new HeaderFragment(driver);
        searchFragment = new SearchFragment(driver);
        footerFragment = new FooterFragment(driver);
    }

    public HeaderFragment getHeaderFragment() {
        return headerFragment;
    }

    public SearchFragment getSearchFragment() {
        return searchFragment;
    }

    public FooterFragment getFooterFragment() {
        return footerFragment;
    }
}
