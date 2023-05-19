package starter.helpers.pageFactory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class loginPage extends PageObject {

    public static Target txt_username  = Target.the("username field").locatedBy("#user-name");
    public static Target txt_password = Target.the(" password field").locatedBy("#password");
    public static Target btn_login = Target.the(" login button").locatedBy("#login-button");
    public static Target txt_login_error = Target.the(" wrong username/password text box").locatedBy("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]");

}