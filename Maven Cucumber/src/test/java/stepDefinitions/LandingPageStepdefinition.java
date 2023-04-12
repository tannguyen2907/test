package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LandingPage;
import utils.TestContextSetup;


public class LandingPageStepdefinition {
    TestContextSetup testContextSetup;

    public LandingPageStepdefinition(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }
    @Given("User is on the GreenCart landing page")
    public void user_is_on_the_green_cart_landing_page() throws Throwable{
//        System.setProperty("webdriver.chrome.driver","src/test/java/chromeDriver");
        testContextSetup.driver = new ChromeDriver();
        testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
    }
    @When("User search with ShortName {string} and extracted actual name of product")
    public void user_search_with_short_name_and_extracted_actual_name_of_product(String shortName) throws  Throwable{
        LandingPage landingPage = new LandingPage(testContextSetup.driver);
        landingPage.searchItems(shortName);
        Thread.sleep(1000);
        testContextSetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
       assert testContextSetup.landingPageProductName.equals(shortName);
    }
}
