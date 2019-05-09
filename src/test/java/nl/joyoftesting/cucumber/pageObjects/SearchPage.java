package nl.joyoftesting.cucumber.pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {

    private SelenideElement searchInput =  $(By.name("q"));

    public void userNavigatesToGoogle() {
        open("https://google.nl");
    }

    public void userSearchFor(final String searchString) {
        searchInput.val(searchString).pressEnter();
    }
}
