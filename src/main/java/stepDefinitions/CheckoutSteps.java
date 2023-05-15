package stepDefinitions;
import component.TextBox;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CheckoutSteps {

    @When("user input first name {string} with last name {string} and zip {string}")
    public void inputCheckoutData(String firstname, String lastname, String zipcode) {
        TextBox textBox = new TextBox(Hooks.driver);
        textBox.enterTextToTextbox("First Name", firstname);
        textBox.enterTextToTextbox("Last Name", lastname);
        textBox.enterTextToTextbox("Zip/Postal Code", zipcode);
    }


}
