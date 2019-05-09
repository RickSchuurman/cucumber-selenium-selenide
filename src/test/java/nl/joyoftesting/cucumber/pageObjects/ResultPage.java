package nl.joyoftesting.cucumber.pageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;

public class ResultPage {

    private ElementsCollection results = $$("#ires h3");

    public SelenideElement getFirstResult(int index) {
        return results.get(index);
    }
}
