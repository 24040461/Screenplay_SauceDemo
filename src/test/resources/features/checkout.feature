Feature: Checkout process

  Scenario: Checkout process end to end
    Given Rama is on home page
    When he adds an item to the cart
    And he clicks the cart button in the top right
    And he sees the item "Sauce Labs Bike Light"
    And he clicks Checkout
    And he fills out all the fields "Callum" "Gill" "BB13 7FG"
    And he sees the total price is "Total: $10.79"
    And he clicks Finish
    Then he sees "Thank you for your order!"