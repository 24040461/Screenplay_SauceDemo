package starter.Actions.checkoutInfoActions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.helpers.pageFactory.checkoutPage;

public class CheckoutProcess {
    public static Performable withFirstNameForm(String firstN) {
        return Task.where("Adding first name to the form",
                Enter.theValue(firstN).into(checkoutPage.first_name)
        );
    }
    public static Performable withSecondNameForm(String secondN) {
        return Task.where("Adding first name to the form",
                Enter.theValue(secondN).into(checkoutPage.second_name)
        );
    }
    public static Performable withPostcodeForm(String postCode) {
        return Task.where("Adding first name to the form",
                Enter.theValue(postCode).into(checkoutPage.post_code)
        );
    }
    public static Performable withClickingContinueButton() {
        return Task.where("Clicking the login button",
                Click.on(checkoutPage.continue_btn)
        );
    }
    public static Performable withClickingFinishButton() {
        return Task.where("Clicking the login button",
                Click.on(checkoutPage.finish_btn)
        );
    }
}
