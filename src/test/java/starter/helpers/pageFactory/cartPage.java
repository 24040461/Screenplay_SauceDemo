package starter.helpers.pageFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class cartPage extends PageObject {
    public static Target bike_light_in_cart = Target.the("Title of item in cart").locatedBy(".inventory_item_name");
    public static Target checkout_btn = Target.the("Checkout Button").locatedBy("#checkout");

}
