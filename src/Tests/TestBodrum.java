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
 * Created by Vitaliy&Yana on 18.08.2014.
 */
public class TestBodrum extends BaseTest {

    @Test(groups = "good")
    public void BodrumLife() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        String xpath = thinkMobiles.getProperty("bodrum.xpath");
        thinkMobiles.GoToBodrum(xpath);
        assertThat(getDriver().getCurrentUrl(), containsString("https://itunes.apple.com/ua/app/bodrumlife/id604701583?mt=8"));
//close tab and get back

    }
    @Test(groups = "good")
    public void NewDeskIOS() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        String xpath = thinkMobiles.getProperty("newdeskios.xpath");
        thinkMobiles.GoToBodrum(xpath);
            assertEquals("Newsdesk on the App Store on iTunes", getDriver().getTitle());
         }
    @Test(groups = "good")
    public void NewDeskAndroid() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        String xpath = thinkMobiles.getProperty("newdeskandroid.xpath");
        thinkMobiles.GoToBodrum(xpath);
        assertEquals("Newsdesk - Приложения на Google Play", getDriver().getTitle());

    }



    }
