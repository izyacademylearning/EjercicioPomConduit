package co.com.conduit.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

@DefaultUrl("https://angular.realworld.io/")
public class SignUpPage extends PageObject {


    //fORM REGISTER
    @FindBy(xpath = "/html/body/app-root/app-layout-header/nav/div/ul/li[3]/a")
    WebElement LINK_SIGNUP;

    @FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[1]/input")
    WebElement TXT_USERNAME;

    @FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[2]/input")
    WebElement TXT_EMAIL;

    @FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[3]/input")
    WebElement TXT_PASSWORD;

    @FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/button")
    WebElement BTN_SIGNUP;

    public void signUp(Map<String,String>mapDatos) {
        LINK_SIGNUP.click();
        TXT_USERNAME.sendKeys(mapDatos.get("username"));
        TXT_EMAIL.sendKeys(mapDatos.get("email"));
        TXT_PASSWORD.sendKeys(mapDatos.get("password"));
        BTN_SIGNUP.click();
    }

    //Validation username
    @FindBy(xpath = "/html/body/app-root/app-layout-header/nav/div/ul/li[4]/a")
    WebElement PROFILE;

    public String validationSignUp() {
        return PROFILE.getText();
    }

}
