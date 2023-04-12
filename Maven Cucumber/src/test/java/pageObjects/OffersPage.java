package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
    public WebDriver driver;
    public OffersPage(WebDriver driver) {
        this.driver = driver;
    }
    By search = By.xpath("//input[@type='search']");
    By productName = By.cssSelector("tr td:nth-child(1)");
    By topDealButton = By.linkText("Top Deals");


    public void searchItems(String name){
        driver.findElement(search).sendKeys(name);
    }
    public void getSearchItems(String name){
        driver.findElement(search).getText();
    }

    public void clickTopDealButton(){
        driver.findElement(topDealButton).click();
    }
    public String getProductName(){
        return driver.findElement(productName).getText();
    }
}
