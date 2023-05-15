package stepDefinitions;

import component.Label;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LabelSteps {

    @Then("the {string} label validation error is displayed")
    public void theLabelValidationErrorIsDisplayed(String labelError) throws Exception {
        Label label = new Label(Hooks.driver);
        label.labelIsDisplayed(labelError);
    }

    @And("verify that total product {string} is display in icon cart")
    public void verifyThatTotalProductIsDisplayInIconCart(String count) {
        Label label = new Label(Hooks.driver);
        label.assertCart(count);
    }

    @And("verify that the total tax displayed is accurate")
    public void verifyThatTheTotalTaxDisplayedIsAccurate() {
        Label label = new Label(Hooks.driver);
        label.assertTotalPriceWithTax(71.26);
    }
}
