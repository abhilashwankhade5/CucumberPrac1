package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
import java.util.Objects;

import static stepDefinition.LandingPage.driver;

public class AddBookInCart {
    public static WebElement BookCategory;
    public static WebElement Book1;
    public static WebElement Book2;
    public static WebElement AddToCartButton;
    public static WebElement CartButton;
    public static WebElement SearchField;
    public static WebElement DeleteButton;
    public static WebElement Suggestion;
    public static String PriceOfBook1InCart;
    public static String NameOfBook1InCart;
    public static String NameOfBook1InDetails;
    public static String PriceOfBook1InDetails;
    public static String NameOfBook2InDetails;
    public static String PriceOfBook2InDetails;
    public static String NameOfBook2InCart;
    public static String PriceOfBook2InCart;
    public static String TotalPrice;
    public static String TotalPriceAfterDelete;


    @When("Navigate to category when I click on Mystery category")
    public void navigate_to_category_when_i_click_on_mystery_category() throws InterruptedException {
        Thread.sleep(3000);
        BookCategory = driver.findElement(By.xpath("//app-book-filter//mat-nav-list//mat-list-item[4]"));
        BookCategory.click();
        Thread.sleep(2000);
    }

    @Then("I click on the book")
    public void i_click_on_the_book() throws InterruptedException {
        Book1 = driver.findElement(By.xpath("//app-book-card//mat-card-content//a//strong[text()=\"Harry Potter and the Chamber of Secrets\"]"));
        Book1.click();
        Thread.sleep(2000);
    }

    @Then("Check the price and I add the book in the cart")
    public void i_add_the_book_in_the_cart() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("------------Book 1--------------");
        NameOfBook1InDetails = driver.findElement(By.xpath("//tbody//tr[1]//td[2]")).getText();
        System.out.println("Name of the book in details section : "+NameOfBook1InDetails);
        Thread.sleep(3000);
        PriceOfBook1InDetails = driver.findElement(By.xpath("//tbody//tr[4]//td[2]")).getText();
        System.out.println("Price of the book in details section : "+PriceOfBook1InDetails);
        Thread.sleep(2000);
    }

    @Then("I check the cart and compare the price")
    public void i_check_the_cart_and_compare_the_price() throws InterruptedException {
        AddToCartButton = driver.findElement(By.xpath("//app-addtocart[@ng-reflect-book-id=\"2\"]"));
        AddToCartButton.click();
        Thread.sleep(3000);
        System.out.println("Book1 has been added in to cart successfully");
        CartButton = driver.findElement(By.xpath("//mat-toolbar-row//div[3]//button[2]"));
        CartButton.click();
        Thread.sleep(3000);
        NameOfBook1InCart = driver.findElement(By.xpath("//tbody//tr//td[2]")).getText();
        System.out.println("Name of the book1 in cart section : "+NameOfBook1InCart);
        Thread.sleep(3000);
        PriceOfBook1InCart = driver.findElement(By.xpath("//tbody//tr//td[5]")).getText();
        System.out.println("Price of the book1 in cart section : "+PriceOfBook1InCart);

        if(Objects.equals(NameOfBook1InDetails, NameOfBook1InCart)){
            System.out.println("Book Name is same in cart");
        }
        else
        {
            System.out.println("Book Name is different in cart");
        }

        if(Objects.equals(PriceOfBook1InDetails, PriceOfBook1InCart)){
            System.out.println("Book Price is same in cart");
        }
        else
        {
            System.out.println("Book Price is different in cart");
        }
        Thread.sleep(3000);
    }

    @Then("should navigate to All category section when I click on Book cart text on header")
    public void i_should_navigate_to_all_category_section() throws InterruptedException {
        SearchField = driver.findElement(By.xpath("//input[@placeholder=\"Search books or authors\"][@type=\"search\"]"));
        SearchField.sendKeys("The Hookup");
        Suggestion = driver.findElement(By.xpath("//div[@id=\"mat-autocomplete-0\"]"));
        Suggestion.click();
        Thread.sleep(3000);

    }

    @Then("I click on a book")
    public void i_click_on_a_book() throws InterruptedException {
        Book2 = driver.findElement(By.xpath("//app-book-card//mat-card-content//a//strong[text()=\"The Hookup\"]"));
        Book2.click();
        Thread.sleep(3000);

    }

    @Then("I get the text and price of the book")
    public void i_get_the_text_and_price_of_the_book() throws InterruptedException {
        System.out.println("------------Book 2--------------");
        NameOfBook2InDetails = driver.findElement(By.xpath("//tbody//tr[1]//td[2]")).getText();
        System.out.println("Name of the book2 in details section : "+NameOfBook2InDetails);
        PriceOfBook2InDetails = driver.findElement(By.xpath("//tbody//tr[4]//td[2]")).getText();
        System.out.println("Price of the book2 in details section : "+PriceOfBook2InDetails);
        Thread.sleep(3000);

    }

    @Then("I navigate to Cart and compare the name and price")
    public void i_navigate_to_cart_and_compare_name_price() throws InterruptedException {
        AddToCartButton = driver.findElement(By.xpath("//app-addtocart[@ng-reflect-book-id=\"36\"]"));
        AddToCartButton.click();
        Thread.sleep(3000);
        System.out.println("Book2 has been added in to cart successfully");
        CartButton = driver.findElement(By.xpath("//mat-toolbar-row//div[3]//button[2]"));
        CartButton.click();
        Thread.sleep(3000);
        NameOfBook2InCart = driver.findElement(By.xpath("//tbody//tr[2]//td[2]")).getText();
        System.out.println("Name of the book2 in cart section : "+NameOfBook2InCart);
        PriceOfBook2InCart = driver.findElement(By.xpath("//tbody//tr[2]//td[5]")).getText();
        System.out.println("Price of the book2 in cart section : "+PriceOfBook2InCart);

        if(Objects.equals(NameOfBook2InDetails, NameOfBook2InCart)){
            System.out.println("Book2 Name is same in cart");
        }
        else
        {
            System.out.println("Book2 Name is different in cart");
        }

        if(Objects.equals(PriceOfBook2InDetails, PriceOfBook2InCart)){
            System.out.println("Book Price is same in cart");
        }
        else
        {
            System.out.println("Book Price is different in cart");
        }
        Thread.sleep(3000);
    }

    @Then("I check the total price")
    public void i_check_the_total_price() throws InterruptedException {
        TotalPrice = driver.findElement(By.xpath("//mat-card-content[@class=\"mat-mdc-card-content ng-star-inserted\"]//td[5]")).getText();
        System.out.println("Total price of books : "+TotalPrice);
        if(Objects.equals(TotalPrice, "₹669.00"))
        {
            System.out.println("Total price of two books in cart  is accurate");
        }
        else{
            System.out.println("Total price of two books in cart  is not accurate");
        }
        Thread.sleep(3000);
    }

    @Then("I delete one book from cart")
    public void i_delete_one_book_from_cart() throws InterruptedException {
        DeleteButton = driver.findElement(By.xpath("//tbody//tr//td[6]//button"));
        System.out.println("Book1 has been deleted from cart");
        DeleteButton.click();
        Thread.sleep(3000);

    }

    @Then("I check the total price after delete")
    public void i_check_the_total_price_after_delete() throws InterruptedException {
        TotalPriceAfterDelete = driver.findElement(By.xpath("//mat-card-content[@class=\"mat-mdc-card-content ng-star-inserted\"]//td[5]")).getText();
        System.out.println("Total price of books after deletion : "+TotalPriceAfterDelete);
        if(Objects.equals(TotalPriceAfterDelete, "₹434.00"))
        {
            System.out.println("Total price of books in cart  is accurate");
        }
        else{
            System.out.println("Total price of books in cart  is not accurate");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
