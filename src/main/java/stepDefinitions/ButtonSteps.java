package stepDefinitions;

import component.Button;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ButtonSteps {

    @When("user click {string} button")
    public void userClickButton(String buttonName) {
        Button button = new Button(Hooks.driver);
        button.submitButton(buttonName);
    }


    @Given("the user click {string} button")
    public void theUserClickButton(String label) {
        Button button = new Button(Hooks.driver);
        button.clickBtn(label);
    }
}
