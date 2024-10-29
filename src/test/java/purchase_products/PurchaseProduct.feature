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
    When  click on keyboard product in products page
    Then  product name "<keyboardProduct>" and product price "<price>" should appear in keyboard page
    And   cart should be empty in the header
    When  click on add to cart button in keyboard page
    Then  success message "<successMessage>" should appear successfully keyboard page
    And   cart should contain one element in the header
    When  click on products button in the header
    And   Click on laptop checkbox in categories section in home page
    And   click on apply button in home page
    And   click on laptop product in laptops page
    And   click on add to cart button in laptops page
    And   click on cart button in the header
    And   click in view cart button in the header
    Then  title and price for products appear successfully in cart page
    And   total price should be equal to the sum of the products in cart page
    When  click on proceed to checkout button in cart page
    And   select country Egypt and region cairo in shipping details page
    And   enter address "<address>" in address field and postal code "<code>" in code field  and phone number "<phone>" in phone field in shipping details page
    And   click on cash on delivery check box in shipping details page
    And   click on confirm button in shipping details page
    And   click on the order number in order summary page
    Then  shipping address should be "<shippingAddress>" in order summary page
    And   total price should be equal "<totalPrice>" in order summary page


    Examples:
      | email           | password     | keyboardProduct                                            | price | successMessage | laptopProduct                                                | address    | code | phone       | shippingAddress        | totalPrice   |
      | alyaa@gmail.com | Password@123 | Logitech Wireless Keyboard and Mouse Combo - Black (MK270) | $33   | Added To Cart  | Dell Chromebook 11 3120 (11.6", Intel Celeron N2840, 4GB RAM | Alex,Egypt | 020  | 01001010110 | Address 1 : Alex,Egypt | Total : $733 |

