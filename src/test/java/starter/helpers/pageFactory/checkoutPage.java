package starter.helpers.pageFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class checkoutPage extends PageObject {
    public static Target first_name = Target.the("first name form").locatedBy("#first-name");
    public static Target second_name = Target.the("first name form").locatedBy("#last-name");
    public static Target post_code = Target.the("first name form").locatedBy("#postal-code");
    public static Target continue_btn = Target.the("first name form").locatedBy("#continue");
    public static Target product_price = Target.the("first name form").locatedBy("/html/body/div/div/div/div[2]/div/div[2]/div[8]");
    public static Target finish_btn = Target.the("first name form").locatedBy("#finish");
    public static Target completed_order_txt = Target.the("first name form").locatedBy(".complete-header");


}