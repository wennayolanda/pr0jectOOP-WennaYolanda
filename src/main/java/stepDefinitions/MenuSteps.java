package stepDefinitions;

import component.Menu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class MenuSteps {
    @Then("I see {string} menu item")
    public void iSeeMenuItem(String labelMenu) throws Exception {
        Menu menu = new Menu(Hooks.driver);
        menu.menuIsDisplayed(labelMenu);
    }

    @And("user see the products page contains:")
    public void userSeeTheProductsPageContains(List<String> labelMenu) {
        Menu menu = new Menu(Hooks.driver);
        menu.assertMenuItems(labelMenu);
    }
}
