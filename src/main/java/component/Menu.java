package component;
import Object.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Menu extends PageObject {

    public Menu(WebDriver driver) {
        super(driver);
    }

    public boolean menuIsDisplayed(String menuItem) throws Exception {
        try {
            WebElement findElement = webDriver.findElement(By.xpath("//div[@class='module_item']/a[contains(text(),'"+menuItem+"')]"));
            return findElement.isDisplayed();
        } catch (NoSuchElementException e) {
            throw new Exception("The " + menuItem + " item is not displayed");
        }
    }

    public void assertMenuItems(List<String> expectedMenuItems) {
        List<WebElement> menuItems = webDriver.findElements(By.xpath("//div[@class='inventory_item_label']/a[1]"));
        List<String> actualMenuItems = new ArrayList<>();
        for(WebElement menuItem : menuItems) {
            String itemName = menuItem.getText();
            if(expectedMenuItems.contains(itemName)) { // Menambahkan item name ke dalam list actualProducts jika itemName terdapat pada expectedMenuItems
                actualMenuItems.add(itemName);
            }
        }

        assertEquals(expectedMenuItems, actualMenuItems);
    }

}
