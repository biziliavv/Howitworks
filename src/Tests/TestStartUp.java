package Tests;

import Methods.ThinkMobiles;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;


import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitaliy&Yana on 01.09.2014.
 */
public class TestStartUp extends BaseTest {

    @Test(groups = "good")
    public void StartupHelp() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
    String xpath = thinkMobiles.getProperty("startuphelp.xpath");
        thinkMobiles.GoToStartup(xpath);
        assertEquals("ThinkMobiles provides expert consulting, support and development to help mobile startups succeed with MVP", getDriver().findElement(By.cssSelector("div.startUpCont > p")).getText());

    }
}
