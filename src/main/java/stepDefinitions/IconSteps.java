package stepDefinitions;
import component.Icon;
import component.Product;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class IconSteps {

    @And("user click icon cart")
    public void clickCart() throws InterruptedException {
        Icon cart = new Icon(Hooks.driver);
        cart.clickIconCart();
    }

}
