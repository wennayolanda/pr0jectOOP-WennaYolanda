package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Object.PageObject;
import org.openqa.selenium.WebElement;

public class TextBox extends PageObject {
    public TextBox(WebDriver driver) {
        super(driver);
    }

    public static void enterTextToTextbox(String placeholder, String text) {
        WebElement textBox = webDriver.findElement(By.xpath("//input[@placeholder='"+placeholder+"']"));
        textBox.sendKeys(text);
    }

}
