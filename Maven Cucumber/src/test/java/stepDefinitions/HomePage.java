package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Objects;

public class HomePage {
    @Given("^valid the browser$")
    public void valid_the_browser() throws Throwable{
        System.out.println("Navigate to URL");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable{
        System.out.println("Navigate to Login Page");
    }

    @Then("^Check if browser is displayed$")
    public void check_if_browser_is_displayed() throws Throwable {
        System.out.println("Login Page is up");
    }

    @Given("^User is on the landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("Im on landing page");
    }

    @When("User logins into application with username {string} and password {string}")
    public void user_login_into_application_with_username_and_password(String name, String pass) throws Throwable {
        System.out.println(name);
    }
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Home Page");
    }
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed(String check) throws Throwable {
        System.out.println(check);
    }

    @Given("^User is on the even landing page$")
    public void user_Is_On_The_Even_Landing_Page()  throws Throwable {
        System.out.println("Landing Page");
    }

    @When("^User sign up with information$")
    public void userSignUpWithInformation() {

    }

    @When("^User sign up with following details$")
    public void user_Sign_Up_With_Following_Details(DataTable data) throws  Throwable {
        List<List<String>> table = data.asLists();
        System.out.println("Username: " + table.get(0).get(0));
        System.out.println("Password: " + table.get(0).get(1));
        System.out.println("Gmail: " + table.get(0).get(2));
        System.out.println("Country: " + table.get(0).get(3));
        System.out.println("Phone: " + table.get(0).get(4));
    }


    @When("User sign up with {string} and {string}")
    public void user_Sign_Up_With_And(String name, String pass) throws  Throwable{
        System.out.println("Username: "+name);
        System.out.println("Password: " + pass);
    }

    @Then("User should see the homepage")
    public void user_Should_See_The_Hompage() throws Throwable{

    }

    @And("Value is {string}")
    public void value_Is(String value) {
        if(Objects.equals(value, "true")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    @Given("validate the browser")
    public void validateTheBrowser() throws  Throwable{
        System.out.println("Browser is validate");
    }
}

