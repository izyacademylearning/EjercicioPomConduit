package co.com.conduit.stpes;

import co.com.conduit.pages.SignUpPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Map;

public class SignUpStep {

    SignUpPage signUpPage;

    @Step
    public void openWebSite() {
        signUpPage.open();
    }

    @Step
    public void callSignUp(Map<String,String> mapDatos) {
        signUpPage.signUp(mapDatos);
    }

    @Step
    public void validationUsername(String username) {
        Assert.assertEquals(signUpPage.validationSignUp(), username);
    }

}
