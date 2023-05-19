package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import starter.helpers.pageFactory.loginPage;

public class NavigateTo {
    public static Performable theLoginPage() {
        return Task.where("{0} opens the Todo list page",
                Open.browserOn().the(loginPage.class));
    }
  public static Performable theHomePage() {
        return Task.where("{0} has already logged into the webpage",
                Open.browserOn().the(loginPage.class),
                Enter.theValue("standard_user").into(loginPage.txt_username),
                Enter.theValue("secret_sauce").into(loginPage.txt_password),
                Click.on(loginPage.btn_login)
        );
    }



}