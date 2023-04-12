package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@BeforeTesting")
    public void beforeValidation() {

    }
    @After("@AfterTesting")
    public void afterValidation() {
        System.out.println("After Tesing Hooks");
    }

}
