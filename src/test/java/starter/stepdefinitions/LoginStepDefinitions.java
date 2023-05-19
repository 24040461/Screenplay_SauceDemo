package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.*;
import starter.Actions.loginActions.CorrectlyLogin;
import starter.Actions.loginActions.IncorrectlyLogin;
import starter.helpers.pageFactory.homePage;
import starter.helpers.pageFactory.loginPage;


public class LoginStepDefinitions {
    @Given("{actor} is on login page")
    public void ramaIsOnLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theLoginPage());
    }

    @When("{actor} enters email {string}")
    public void heEntersEmail(Actor actor, String username) {
        actor.attemptsTo(CorrectlyLogin.withUsername(username));
    }

    @And("{actor} enters password {string}")
    public void heEntersPassword(Actor actor,String password) {
        actor.attemptsTo(CorrectlyLogin.withPassword(password));
    }

    @And("{actor} clicks on the login button")
    public void heClicksOnTheLoginButton(Actor actor) {
        actor.attemptsTo(CorrectlyLogin.withClickingLoginButton());
    }

    @Then("{actor} see {string} as a title in the home page")
    public void heSeeAsATitleInTheHomePage(Actor actor,String expectedTitle) {
        actor.attemptsTo(Ensure.that(homePage.products_title).hasText(expectedTitle));
    }

    @And("{actor} enters incorrect password {string}")
    public void heEntersIncorrectPassword(Actor actor,String incPassword) {
        actor.attemptsTo(IncorrectlyLogin.IncorrectPassword(incPassword));
    }

    @Then("{actor} is shown incorrect message")
    public void heIsShownIncorrectMessage(Actor actor) {
        actor.attemptsTo(Ensure.that(loginPage.txt_login_error).isDisplayed());
    }

}