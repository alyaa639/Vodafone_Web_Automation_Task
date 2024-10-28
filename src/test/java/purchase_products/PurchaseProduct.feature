Feature: Login and purchase a product in unicorn website
  Scenario Outline: Login with valid user and purchase a product
    Given unicorn website opened successfully
    When  click on profile icon in landing screen
    And   click on login option in profile icon drop down menu in landing screen
    And   enter email "<email>" in email field in login page
    And   enter password in password "<password>" field in login page
    And   click on login button in login page
    Then  home page appeared successfully
    When  click on keyboard checkbox in Categories section in home page
    And   click on apply button in home page
    Then  All items appear should be keyboard items only in products page
    When  click on product "<keyboardProduct>" in products page
    Then  product name "<keyboardProduct>" and product price "<price>" should appear in keyboard page
    And   cart should be empty in the header
    When  click on add to cart button in keyboard page
    Then  success message "<successMessage>" should appear successfully keyboard page
    And   cart should contain one element in the header
    When  click on products button in the header
    And   Click on laptop checkbox in categories section in home page
    And   click on apply button in home page
    And   click on laptop product "<laptopProduct>" in laptops page
    And   click on add to cart button in laptops page
    And   click on cart button in the header
    And   click in view cart button in the header
    Then  title and price for products appear successfully in cart page
    And   total price should be equal to the sum of the products in cart page
    When  click on proceed to checkout button in cart page
    And   select country "<country>" and region "<region>" in shipping details section in cart page
    And   enter address "<address>" in address field and postal code "<code>" in code field  and phone number "<phone>" in phone field in shipping details section in cart page
    And   click on cash on delivery check box in shipping details section in cart page
    And   click on confirm button in shipping details section in cart page
    And   click on the order number in order summary page
    Then  shipping address should be "<shippingAddress>" in order summary page
    And   total price should be equal to the sum of the products in cart page
    Examples:
      | email           | password     | keyboardProduct | price | successMessage | laptopProduct | country | region | address | code | phone | shippingAddress |
      | alyaa@gmail.com | Password@123 |
