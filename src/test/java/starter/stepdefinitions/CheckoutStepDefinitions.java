package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.*;
import starter.Actions.CheckoutFormActions.FillCheckoutForm;
import starter.Actions.cartActions.AddItemToCart;
import starter.Actions.checkoutInfoActions.ContinueCheckoutProcess;
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
        actor.attemptsTo(FillCheckoutForm.withFirstName(firstN));
        actor.attemptsTo(FillCheckoutForm.withSecondName(secondN));
        actor.attemptsTo(FillCheckoutForm.withPostcode(postCode));
        actor.attemptsTo(ContinueCheckoutProcess.byClickingContinueButton());
    }

    @And("{actor} sees the total price is {string}")
    public void heSeesTheTotalPriceIs(Actor actor,String price) {
        actor.attemptsTo(Ensure.that(checkoutPage.product_price).hasText(price));
    }

    @And("{actor} clicks Finish")
    public void heClicksFinish(Actor actor) {
//      actor.attemptsTo(ContinueCheckoutProcess.byClickingFinishButton());
        actor.attemptsTo(Click.on(Button.withText("Finish")));
    }

    @Then("{actor} sees {string}")
    public void heSees(Actor actor,String completeOrderTxt) {
        actor.attemptsTo(Ensure.that(checkoutPage.completed_order_txt).hasText(completeOrderTxt));

    }


}
