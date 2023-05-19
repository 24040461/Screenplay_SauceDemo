Feature: Test cart functionality

  Scenario: Check cart updates when item added to it
    Given Rama is on home page
    When he adds an item to the cart
    Then he is shown "1" in the cart





