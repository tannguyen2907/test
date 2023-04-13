package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.OffersPage;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;


public class OfferPageStepdefinition {

    TestContextSetup testContextSetup;
    public OfferPageStepdefinition(
            TestContextSetup testContextSetup
    )
    {
        this.testContextSetup = testContextSetup;
    }

    @Then("User search for the same shortname {string} in offers page to check if the product exist")
    public void user_search_for_the_same_shortname_in_offers_page_to_check_if_the_product_exist(String shortName) throws Throwable{
        OffersPage offersPage =  new OffersPage(testContextSetup.driver);
        offersPage.clickTopDealButton();
        switchToOfferPages();
        offersPage.searchItems(shortName);
        testContextSetup.offerPageProductName = offersPage.getProductName();
        }

    public void switchToOfferPages() {
        if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")) {
            System.out.println("You are in landing Page");
        }else{
            Set<String> s1 = testContextSetup.driver.getWindowHandles();
            Iterator<String> i1 = s1.iterator();
            String parentWindow = i1.next();
            String childWindow = i1.next();
            testContextSetup.driver.switchTo().window(childWindow);
        }
    }


    @And("Validate the search name is matches with Landing Page")
    public void validateTheSearchNameIsMatchesWithLandingPage() throws Throwable {
        Thread.sleep(2000);
        Assert.assertEquals(testContextSetup.landingPageProductName, testContextSetup.offerPageProductName);
        testContextSetup.driver.quit();
    }
}
