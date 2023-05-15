package stepDefinitions;

import io.cucumber.java.en.Given;
import component.Product;
import io.cucumber.java.en.Then;

public class ProductSteps {

    @Given("user add product to cart")
    public void addProduct() throws InterruptedException {
        Product product = new Product(Hooks.driver);
        product.addToCart("Sauce Labs Bolt T-Shirt");
        product.addToCart("Sauce Labs Fleece Jacket");
    }

    @Then("verify that product is display in cart")
    public void verifyThatProductIsDisplayInCart() {
        Product product = new Product(Hooks.driver);
        product.listCartContains("Sauce Labs Bolt T-Shirt");
        product.listCartContains("Sauce Labs Fleece Jacket");
    }

    @Then("verify that product is display in checkout page")
    public void verifyThatProductIsDisplayInCheckoutPage() {
        Product product = new Product(Hooks.driver);
        product.listCheckoutContains("Sauce Labs Bolt T-Shirt");
        product.listCheckoutContains("Sauce Labs Fleece Jacket");
    }
}
