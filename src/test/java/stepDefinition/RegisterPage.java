package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static stepDefinition.LandingPage.driver;

public class RegisterPage {

    public static WebElement RegisterButton;
    public static WebElement FirstName;
    public static WebElement LastName;
    public static WebElement UserName;
    public static WebElement Password;
    public static WebElement ConfirmPassword;
    public static WebElement Gender;
    public static WebElement SaveRegisterButton;
    public static String ExpectedCurrentUrl;
    public static String ActualCurrentUrl;


    @When("I click on register button to see the register form")
    public void i_click_on_register_button_to_see_the_register_form() throws InterruptedException {
        Thread.sleep(3000);
        RegisterButton = driver.findElement(By.xpath("//span[text()=\"Register\"]"));
        RegisterButton.click();
        Thread.sleep(3000);
    }

    @Then("I enter first name")
    public void i_enter_first_name() throws InterruptedException {
        FirstName = driver.findElement(By.xpath("//input[@formcontrolname=\"firstname\"]"));
        FirstName.click();
        Thread.sleep(1000);
        FirstName.sendKeys("Test4");
        Thread.sleep(3000);
    }

    @Then("I enter last name")
    public void i_enter_last_name() throws InterruptedException {
        LastName = driver.findElement(By.xpath("//input[@formcontrolname=\"lastname\"]"));
        LastName.click();
        Thread.sleep(1000);
        LastName.sendKeys("Auto4");
        Thread.sleep(3000);
    }

    @Then("I enter user name")
    public void i_enter_user_name() throws InterruptedException {
        UserName = driver.findElement(By.xpath("//input[@formcontrolname=\"username\"]"));
        UserName.click();
        Thread.sleep(1000);
        UserName.sendKeys("testauto_4@gmail.com");
    }

    @Then("I enter password")
    public void i_enter_password() throws InterruptedException {
        Thread.sleep(3000);
        Password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"][@formcontrolname=\"password\"][@type=\"password\"]"));
        Thread.sleep(1000);
        Password.click();
        Thread.sleep(1000);
        Password.sendKeys("Testauto_4@123");
        Thread.sleep(3000);
    }

    @Then("I enter confirm password")
    public void i_enter_confirm_password() throws InterruptedException {
        ConfirmPassword = driver.findElement(By.xpath("//input[@placeholder=\"Confirm Password\"][@formcontrolname=\"confirmPassword\"][@type=\"password\"]"));
        ConfirmPassword.click();
        Thread.sleep(1000);
        ConfirmPassword.sendKeys("Testauto_4@123");
        Thread.sleep(3000);
    }

    @Then("I select gender")
    public void i_select_gender() throws InterruptedException {
        Gender = driver.findElement(By.xpath("//input[@value=\"Female\"]"));
        Gender.click();
        Thread.sleep(3000);
    }

    @When("I click on Register button to save details")
    public void i_click_on_register_button_to_save_details_2nd() throws InterruptedException {
        SaveRegisterButton = driver.findElement(By.xpath("//span[text()=\"Register\"]"));
        SaveRegisterButton.click();
        Thread.sleep(3000);
    }

    @Then("I should navigate to login page")
    public void i_should_navigate_login_page() throws InterruptedException {
        ExpectedCurrentUrl = driver.getCurrentUrl();
        ActualCurrentUrl = "https://bookcart.azurewebsites.net/login";
        Assert.assertEquals(ActualCurrentUrl,ExpectedCurrentUrl);
        Thread.sleep(3000);
    }
}

