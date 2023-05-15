package component;

import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Icon extends PageObject {
    public Icon(WebDriver driver) {
        super(driver);
    }
    public void clickIconCart() {
        WebElement clickCart = webDriver.findElement(By.className("shopping_cart_link"));
        clickCart.click();
    }
}
