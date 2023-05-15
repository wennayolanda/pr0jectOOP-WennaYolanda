package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageSourceSteps {
    public String Title, url;
    public int titleLength, pageSourceLength;

    @When("Get page title and title length")
    public void getPageTitleAndTitleLength() {
        Title = Hooks.driver.getTitle(); //Untuk mendapatkan informasi judul (title)

        titleLength = Hooks.driver.getTitle().length(); // untuk mendapatkan panjang title
    }


    @Then("Print page title and title length in Console Text Editor")
    public void printPageTitleAndTitleLengthInConsoleTextEditor() {
        System.out.println("Title of the page is: " + Title);
        System.out.println();
        System.out.println("Length of the title is: " + titleLength);
    }

    @When("Get the page URL")
    public void getThePageURL() {
        url = Hooks.driver.getCurrentUrl(); // storing url in String var
    }


    @Then("Verification to ensure that the opened page is correct")
    public void verificationToEnsureThatTheOpenedPageIsCorrect() {
        if (url.equals("https://www.saucedemo.com/")) // verifikasi utk melihat apakah url yang dibuka sudah sesuai
        {
            System.out.println();
            System.out.println("Verification Successful - The correct Url is opened."); // if jika url yang dibuka sudah sesuai
        } else {
            System.out.println();
            System.out.println("Verification Failed - An incorrect Url is opened."); // if jika url yang dibuka tidak sesuai
        }
    }


    @When("Get HTML Source code and Page Source length")
    public void getHTMLSourceCodeAndPageSourceLength() {
        String pageSource = Hooks.driver.getPageSource(); // Storing Page Source in String variable

        pageSourceLength = pageSource.length(); // Storing page source length in int variable
    }

    @Then("Print in Console Text Editor")
    public void printInConsoleTextEditor() {
        System.out.println();
        System.out.println("Total length of the Page Source is: " + pageSourceLength);
    }


    @And("Close browser")
    public void closeBrowser() {
        Hooks.driver.close();
    }
}
