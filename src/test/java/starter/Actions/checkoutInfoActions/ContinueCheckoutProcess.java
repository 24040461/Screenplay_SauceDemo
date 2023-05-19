package starter.Actions.checkoutInfoActions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.helpers.pageFactory.checkoutPage;

public class ContinueCheckoutProcess {

    public static Performable byClickingContinueButton() {
        return Task.where("Clicking the login button",
                Click.on(checkoutPage.continue_btn)
        );
    }
    public static Performable byClickingFinishButton() {
        return Task.where("Clicking the login button",
                Click.on(checkoutPage.finish_btn)
        );
    }
}
