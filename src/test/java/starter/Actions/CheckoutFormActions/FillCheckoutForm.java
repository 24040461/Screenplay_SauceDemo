package starter.Actions.CheckoutFormActions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import starter.helpers.pageFactory.checkoutPage;

public class FillCheckoutForm {
    public static Performable withFirstName(String firstN) {
        return Task.where("Adding first name to the form",
                Enter.theValue(firstN).into(checkoutPage.first_name)
        );
    }
    public static Performable withSecondName(String secondN) {
        return Task.where("Adding first name to the form",
                Enter.theValue(secondN).into(checkoutPage.second_name)
        );
    }
    public static Performable withPostcode(String postCode) {
        return Task.where("Adding first name to the form",
                Enter.theValue(postCode).into(checkoutPage.post_code)
        );
    }
}
