Feature: Add Book In Cart

  Scenario: Validate registered user is able add book in the cart

    When Navigate to category when I click on Mystery category
    Then I click on the book
    Then Check the price and I add the book in the cart
    Then I check the cart and compare the price


  Scenario: Add more books and compare the name of the books and prices and Then Delete books from cart
      Then should navigate to All category section when I click on Book cart text on header
      Then I click on a book
      Then I get the text and price of the book
      Then I navigate to Cart and compare the name and price
      Then I check the total price
      Then I delete one book from cart
      Then I check the total price after delete