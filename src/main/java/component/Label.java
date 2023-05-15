package component;
import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Label extends PageObject {
    public Label(WebDriver driver) {
        super(driver);
    }
    public boolean labelIsDisplayed(String label) throws Exception {
        try {
            WebElement findElement = webDriver.findElement(By.xpath("//h3[contains(text(), '"+label+"')]"));
            return findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("The label " + label + " not displayed");
        }
    }

    public void assertCart(String count) {
        try {
            WebElement cartIcon = webDriver.findElement(By.className("shopping_cart_link"));
            assertTrue(cartIcon.getText().contains(count));
        } catch (AssertionError e) {
            fail("Cart icon tidak berisi " + count);
        }
    }

    public void assertTotalPriceWithTax(Double expectedTotal) {
        try {
            WebElement getElementTotal = webDriver.findElement(By.className("summary_total_label"));
            String getTotal = getElementTotal.getText().replace("Total: $", "");
            Double actualTotal = Double.parseDouble(getTotal);
            assertTrue(expectedTotal.equals(actualTotal));
        } catch (NoSuchElementException e) {
            fail("Test failed due to: " + e.getMessage());
        }
    }


}
