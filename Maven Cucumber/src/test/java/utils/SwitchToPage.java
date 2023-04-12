package utils;

import java.util.Iterator;
import java.util.Set;

public class SwitchToPage {
    TestContextSetup testContextSetup;

    public SwitchToPage(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }
    public void switchToOfferPages() {
        Set<String> s1 = testContextSetup.driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        testContextSetup.driver.switchTo().window(childWindow);
    }
}
