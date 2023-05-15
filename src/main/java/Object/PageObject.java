package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class PageObject {
    protected static WebDriver webDriver;

    public PageObject(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }
}