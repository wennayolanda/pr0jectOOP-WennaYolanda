package component;

import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Product extends PageObject {
    public Product(WebDriver driver) {
        super(driver);
    }
    public void addToCart(String productName) {
        WebElement addToCart = webDriver.findElement(By.xpath("//div[contains(text(),'" + productName + "')]//ancestor::div[@class = 'inventory_item_label']/following-sibling::div//button"));
        addToCart.click();
    }

    public void listCartContains(String productName) {
        try {
            WebElement productNameInCart = webDriver.findElement(By.xpath("//div[@class='cart_item']//div[@class='inventory_item_name' and contains(text(),'" + productName + "')]"));
            String getText = productNameInCart.getText();
            assertTrue(getText.contains(productName));
        } catch (NoSuchElementException e) {
            fail("Test failed due to: " + e.getMessage());
        }
    }

    public void listCheckoutContains(String productCoName) {
        try {
            WebElement productNameInCart = webDriver.findElement(By.xpath("//div[@class='cart_item']//div[@class='inventory_item_name' and contains(text(),'" + productCoName + "')]"));
            String getText = productNameInCart.getText();
            assertTrue(getText.contains(productCoName));
        } catch (NoSuchElementException e) {
            fail("Test failed due to: " + e.getMessage());
        }
    }

}
