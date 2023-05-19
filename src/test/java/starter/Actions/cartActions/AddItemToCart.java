package starter.Actions.cartActions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.helpers.pageFactory.cartPage;
import starter.helpers.pageFactory.homePage;

public class AddItemToCart {

    public static Performable bikeLight(){
        return Task.where("Adding bike light to cart",
                Click.on(homePage.BIKE_LIGHT_ADD_TO_CART)
        );
    }
    public static Performable iClickOnCart(){
        return Task.where("Entering username info into field",
                Click.on(homePage.CART_VALUE)
        );
    }
    public static Performable iClickOnCheckoutButton(){
        return Task.where("Clicking Checkout btn",
                Click.on(cartPage.checkout_btn)
        );
    }
}
