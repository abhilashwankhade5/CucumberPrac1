package stepDefinition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import static stepDefinition.LandingPage.driver;

public class LoginPage {

    public static WebElement UserNameField;
    public static WebElement PasswordField;
    public static WebElement LoginButton;
    String ExpectedGetUserName;
    String ActualGetUserName;




    @When("I enter userName and Password and click on Login button")
    public void i_enter_user_name_and_password_and_click_on_login_button() throws InterruptedException {
        UserNameField = driver.findElement(By.xpath("//form//mat-form-field//input[@formcontrolname=\"username\"]"));
        UserNameField.sendKeys("testauto_4@gmail.com");
        Thread.sleep(1000);

        PasswordField = driver.findElement(By.xpath("//form//mat-form-field//input[@formcontrolname=\"password\"]"));
        PasswordField.sendKeys("Testauto_4@123");
        Thread.sleep(1000);

        LoginButton = driver.findElement(By.xpath("//form//button//span[text()=\"Login\"]"));
        LoginButton.click();
        Thread.sleep(3000);
    }

    @Then("I should able to login successfully")
    public void i_should_able_to_login_successfully() throws InterruptedException {
        ActualGetUserName = driver.findElement(By.xpath("//mat-toolbar-row//a[@aria-haspopup=\"menu\"]//span[2][@class=\"mdc-button__label\"]//span[1]")).getText();
        ExpectedGetUserName = "testauto_4@gmail.com";
        Thread.sleep(1000);
        System.out.println("Actual User Name : "+ActualGetUserName);
        System.out.println("Expected User name : "+ExpectedGetUserName);
        Assert.assertEquals(ActualGetUserName,ExpectedGetUserName);
        System.out.println("Login Successfully");
        Thread.sleep(3000);
    }

}

