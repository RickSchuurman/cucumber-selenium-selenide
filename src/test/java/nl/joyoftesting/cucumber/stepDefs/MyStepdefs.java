package nl.joyoftesting.cucumber.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nl.joyoftesting.cucumber.pageObjects.ResultPage;
import nl.joyoftesting.cucumber.pageObjects.SearchPage;
import static com.codeborne.selenide.Condition.text;

public class MyStepdefs {

    SearchPage searchPage = new SearchPage();
    ResultPage resultPage = new ResultPage();

    @Given("^A user navigates to google$")
    public void aUserNavigatesToGoogle() {
        searchPage.userNavigatesToGoogle();
    }

    @When("^a user searches for \"([^\"]*)\"$")
    public void aUserSearchesFor(String searchString) {
        searchPage.userSearchFor(searchString);
    }

    @Then("^\"([^\"]*)\" is the first in the results$")
    public void isTheFirstInTheResults(String expectResult) {
        resultPage.getFirstResult(0).shouldHave(text(expectResult));
    }
}
