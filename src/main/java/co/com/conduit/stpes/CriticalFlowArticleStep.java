package co.com.conduit.stpes;

import co.com.conduit.pages.CriticalFlowArticlePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Map;


public class CriticalFlowArticleStep {

    CriticalFlowArticlePage criticalFlowArticlePage;

    @Step
    public void callFlowArticle(Map<String,String>mapDatos) {
        criticalFlowArticlePage.flowArticle(mapDatos);
    }

    @Step
    public void comparationMessage(String message) {
        Assert.assertEquals(criticalFlowArticlePage.validationMessage(), message);
    }

}
