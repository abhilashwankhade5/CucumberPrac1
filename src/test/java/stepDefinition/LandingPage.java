package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class LandingPage {

    Boolean IsLoginButtonVisible;
    public static WebDriver driver;

    @Given("Enter url and navigates to landing page")
    public void enter_url_and_navigates_to_landing_page() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://bookcart.azurewebsites.net/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @When("Check Login button")
    public void check_login_button() throws InterruptedException {
        IsLoginButtonVisible = driver.findElement(By.xpath("//button[@mattooltip=\"Login\"]")).isDisplayed();
        Thread.sleep(2000);
    }

    @Then("Navigate to register screen")
    public void navigate_to_register_screen() throws InterruptedException {
        if(IsLoginButtonVisible){
            WebElement Loginbutton = driver.findElement(By.xpath("//button[@mattooltip=\"Login\"]"));
            Loginbutton.click();
            Thread.sleep(3000);
        }
    }
}
