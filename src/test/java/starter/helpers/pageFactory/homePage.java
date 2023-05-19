package starter.helpers.pageFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class homePage extends PageObject {
    public static Target products_title  = Target.the("products title").locatedBy("/html/body/div/div/div/div[1]/div[2]/span");
    public static Target BIKE_LIGHT_ADD_TO_CART  = Target.the("Add to cart").locatedBy("#add-to-cart-sauce-labs-bike-light");
    public static Target CART_VALUE  = Target.the("Cart Value").locatedBy(".shopping_cart_badge");
    public static Target filter_button  = Target.the("filterbutton").locatedBy("/html/body/div/div/div/div[1]/div[2]/div/span/select");
}