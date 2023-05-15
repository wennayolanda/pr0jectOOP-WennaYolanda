package stepDefinitions;

import component.Button;
import component.TextBox;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.Utils;

public class LoginSteps {

    @Given("user open the webpage")
    public void userOpenTheWebpage() throws InterruptedException {
        Hooks.driver.manage().window().maximize();
        Hooks.driver.get(Utils.BASE_URL);
        Thread.sleep(3000);
    }

    @Given("user login as {string} with password {string}")
    public void userInputCredential(String username, String password) {
        TextBox textBox = new TextBox(Hooks.driver);
        textBox.enterTextToTextbox("Username", username);
        textBox.enterTextToTextbox("Password", password);
    }

    @Given("user input password {string}")
    public void userInputPassword(String password) {
        TextBox textBox = new TextBox(Hooks.driver);
        textBox.enterTextToTextbox("Password", password);
    }

    @Given("user input username {string}")
    public void userInputUsername(String username) {
        TextBox textBox = new TextBox(Hooks.driver);
        textBox.enterTextToTextbox("Username", username);
    }
}
