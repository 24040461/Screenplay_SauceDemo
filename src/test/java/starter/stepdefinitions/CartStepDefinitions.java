package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.Actions.checkoutInfoActions.CheckoutProcess;
import starter.helpers.NavigateTo;
import starter.Actions.cartActions.AddItemToCart;
import starter.helpers.pageFactory.cartPage;
import starter.helpers.pageFactory.checkoutPage;
import starter.helpers.pageFactory.homePage;

public class CartStepDefinitions {
    @Given("{actor}is on home page")
    public void ramaIsOnHomePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theHomePage());
    }
    @When("{actor} adds an item to the cart")
    public void heAddsAnItemToTheCart(Actor actor) {
        actor.attemptsTo(AddItemToCart.bikeLight());
    }
    @Then("{actor} is shown {string} in the cart")
    public void heIsShownInTheCart(Actor actor,String cartValue) {
        actor.attemptsTo(Ensure.that(homePage.CART_VALUE).hasText(cartValue));
    }
}
