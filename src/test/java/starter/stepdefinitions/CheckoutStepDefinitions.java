package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.Actions.cartActions.AddItemToCart;
import starter.Actions.checkoutInfoActions.CheckoutProcess;
import starter.helpers.pageFactory.cartPage;
import starter.helpers.pageFactory.checkoutPage;

public class CheckoutStepDefinitions {
    @And("{actor} clicks the cart button in the top right")
    public void heClicksTheCartButtonInTheTopRight(Actor actor) {
        actor.attemptsTo(AddItemToCart.iClickOnCart());
    }

    @And("{actor} sees the item {string}")
    public void heSeesTheItem(Actor actor,String cartItem) {
        actor.attemptsTo(Ensure.that(cartPage.bike_light_in_cart).hasText(cartItem));
    }

    @And("{actor} clicks Checkout")
    public void heClicksCheckout(Actor actor) {
        actor.attemptsTo(AddItemToCart.iClickOnCheckoutButton());
    }

    @And("{actor} fills out all the fields {string} {string} {string}")
    public void heFillsOutAllTheFields(Actor actor,String firstN, String secondN, String postCode) {
        actor.attemptsTo(CheckoutProcess.withFirstNameForm(firstN));
        actor.attemptsTo(CheckoutProcess.withSecondNameForm(secondN));
        actor.attemptsTo(CheckoutProcess.withPostcodeForm(postCode));
        actor.attemptsTo(CheckoutProcess.withClickingContinueButton());
    }

    @And("{actor} sees the total price is {string}")
    public void heSeesTheTotalPriceIs(Actor actor,String price) {
        actor.attemptsTo(Ensure.that(checkoutPage.product_price).hasText(price));
    }

    @And("{actor} clicks Finish")
    public void heClicksFinish(Actor actor) {
        actor.attemptsTo(CheckoutProcess.withClickingFinishButton());
    }

    @Then("{actor} sees {string}")
    public void heSees(Actor actor,String completeOrderTxt) {
        actor.attemptsTo(Ensure.that(checkoutPage.completed_order_txt).hasText(completeOrderTxt));

    }
}
