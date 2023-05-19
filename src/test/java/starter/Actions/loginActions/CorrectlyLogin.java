package starter.Actions.loginActions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.helpers.pageFactory.loginPage;

public class CorrectlyLogin {
    public static Performable withUsername(String username){
        return Task.where("Entering username info into field",
                Enter.theValue(username).into(loginPage.txt_username)
        );
    }
    public static Performable withPassword(String password) {
        return Task.where("Entering password info into field",
                Enter.theValue(password).into(loginPage.txt_password)
        );
    }
    public static Performable withClickingLoginButton() {
        return Task.where("Clicking the login button",
                Click.on(loginPage.btn_login)
        );
    }

}