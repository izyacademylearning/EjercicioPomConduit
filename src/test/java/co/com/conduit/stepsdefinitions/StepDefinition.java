package co.com.conduit.stepsdefinitions;

import co.com.conduit.pages.SignUpPage;
import co.com.conduit.stpes.CriticalFlowArticleStep;
import co.com.conduit.stpes.SignUpStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class StepDefinition {

    //Sign Up

    @Steps
    SignUpStep signUpStep;

    @Given("Dalmi Go to website")
    public void DalmiGoToWebsite() {
        signUpStep.openWebSite();
    }

    @When("enter the sign up credentials")
    public void enterTheSignUpCredentials(Map<String,String>mapDatos) {
        signUpStep.callSignUp(mapDatos);
    }

    @Then("validate that the new username is {string}")
    public void validateThatTheNewUsernameIs(String username) {
        signUpStep.validationUsername(username);
    }


    //Critical flow article

    @Steps
    CriticalFlowArticleStep criticalFlowArticleStep;

    @When("create a article, update a article, view a article and delete a article")
    public void createAArticleUpdateAArticleViewAArticleAndDeleteAArticle(Map<String,String>mapDatos) {
        criticalFlowArticleStep.callFlowArticle(mapDatos);
    }


    @Then("validation the message {string}")
    public void validationTheMessage(String message) {
        criticalFlowArticleStep.comparationMessage(message);
    }


}
