package co.com.conduit.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class CriticalFlowArticlePage extends PageObject {

    //Sign in
    LoginPage loginPage;


    //Article
    ArticlePage articlePage;

    //Profile
   /* @FindBy(xpath = "/html/body/app-root/app-layout-header/nav/div/ul/li[4]/a")
    WebElement BTN_PROFILE;*/


    public void flowArticle(Map<String,String>mapDatos) {
        loginPage.Login(mapDatos);
        articlePage.newArticle(mapDatos);
        articlePage.editArticle(mapDatos);
        articlePage.deleteArticle();
    }

    //Validation message
    @FindBy(xpath = "/html/body/app-root/app-home-page/div/div/div/div[1]/app-article-list/div[2]")
    WebElement MESSAGE;

    public String validationMessage() {
        return MESSAGE.getText();
    }



}
