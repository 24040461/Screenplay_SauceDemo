package starter.Actions.loginActions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import starter.helpers.pageFactory.loginPage;

public class IncorrectlyLogin {
    public static Performable IncorrectUsername(String username){
        return Task.where("Entering username info into field",
                Enter.theValue(username).into(loginPage.txt_username)
        );
    }
    public static Performable IncorrectPassword(String incPassword){
        return Task.where("Entering username info into field",
                Enter.theValue(incPassword).into(loginPage.txt_password)
        );
    }
}
