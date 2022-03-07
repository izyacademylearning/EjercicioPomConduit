package co.com.conduit.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class LoginPage extends PageObject {

    @FindBy(xpath = "/html/body/app-root/app-layout-header/nav/div/ul/li[2]/a")
    WebElement LINK_SIGNIN;

    @FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[2]/input")
    WebElement TXT_EMAIL;

    @FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[3]/input")
    WebElement TXT_PASSWORD;

    @FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/button")
    WebElement BTN_SIGNIN;

    public void Login(Map<String,String>mapDatos) {
        LINK_SIGNIN.click();
        TXT_EMAIL.sendKeys(mapDatos.get("email"));
        TXT_PASSWORD.sendKeys(mapDatos.get("password"));
        BTN_SIGNIN.click();
    }

}
