package component;

import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button extends PageObject {

    public Button(WebDriver driver) {
        super(driver);
    }
    public static void submitButton(String value) {
        WebElement button = webDriver.findElement(By.xpath("//input[@type = 'submit'][@value = '" + value + "']"));
        button.click();
    }

    public void clickBtn(String label) {
        WebElement button = webDriver.findElement(By.xpath("//button[contains(text(), '"+label+"')]"));
        button.click();
    }
}
