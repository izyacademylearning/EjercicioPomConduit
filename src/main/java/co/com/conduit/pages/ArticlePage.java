package co.com.conduit.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class ArticlePage extends PageObject {

    @FindBy(xpath = "//a[@class='nav-link' and @routerlink='/editor']")
    WebElement LINK_NEW_ARTICLE;

    @FindBy(xpath = "/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[1]/input")
    WebElement TXT_TITLE_ARTICLE;

    @FindBy(xpath = "/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[2]/input")
    WebElement TXT_ARTICLE_TOPIC;

    @FindBy(xpath = "/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[3]/textarea")
    WebElement TXT_DESCRIPTION;

    @FindBy(xpath = "/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[4]/input")
    WebElement TXT_TAGS;

    @FindBy(xpath = "/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/button")
    WebElement BTN_PUBLISH_ARTICLE;


    //New Article
    public void newArticle(Map<String,String>mapDatos) {
        LINK_NEW_ARTICLE.click();
        TXT_TITLE_ARTICLE.sendKeys(mapDatos.get("titleArticle"));
        TXT_ARTICLE_TOPIC.sendKeys(mapDatos.get("articleTopic"));
        TXT_DESCRIPTION.sendKeys(mapDatos.get("description"));
        TXT_TAGS.sendKeys(mapDatos.get("tags") + Keys.ENTER);
        BTN_PUBLISH_ARTICLE.click();
    }


    //Edit Article
    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline-secondary']")
    WebElement LINK_EDIT_ARTICLE;

    public void editArticle(Map<String,String>mapDatos) {
        LINK_EDIT_ARTICLE.click();
        TXT_TITLE_ARTICLE.sendKeys(Keys.CONTROL+"A");
        TXT_TITLE_ARTICLE.sendKeys(mapDatos.get("newtitleArticle"));
        TXT_ARTICLE_TOPIC.sendKeys(Keys.CONTROL+"A");
        TXT_ARTICLE_TOPIC.sendKeys(mapDatos.get("newarticleTopic"));
        TXT_DESCRIPTION.sendKeys(Keys.CONTROL+"A");
        TXT_DESCRIPTION.sendKeys(mapDatos.get("newdescription"));
        BTN_PUBLISH_ARTICLE.click();
    }

    //Delete Article

    @FindBy(xpath = "/html/body/app-root/app-article-page/div/div[1]/div/app-article-meta/div/span[1]/button")
    WebElement BTN_DELETE_ARTICLE;

    public void deleteArticle() {
        BTN_DELETE_ARTICLE.click();
    }

}
