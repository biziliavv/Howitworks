package Tests;


import Methods.ThinkMobiles;
import Methods.VisitIt;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Vitaliy&Yana on 15.08.2014.
 */
public class TestVisitIt extends BaseTest {

    @Test(groups = "good")
    public void DetailsB() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        String xpath = thinkMobiles.getProperty("visititschool.xpath");
        VisitIt details = thinkMobiles.GoToVisitIt(xpath);
        details.DetailsButtonChoosed();
        assertEquals("", getDriver().findElement(By.cssSelector("img.img.bk")).getText());


    }



   @Test(groups = "good")
    public void Details1() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
       String xpath = thinkMobiles.getProperty("visititschool.xpath");
        VisitIt details1button = thinkMobiles.GoToVisitIt(xpath);
        details1button.Details1ButtonChoosed();
        details1button.Registration1Choosed();
        assertEquals("ОФОРМІТЬ РЕЗЮМЕ", getDriver().findElement(By.cssSelector("#text > h2")).getText());

    }

    @Test(groups = "good")
    public void Registration3() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        String xpath = thinkMobiles.getProperty("visititschool.xpath");
        VisitIt details2button = thinkMobiles.GoToVisitIt(xpath);
        details2button.Details1ButtonChoosed();
        wait(1000);
        details2button.RegisterAndroid();
        assertEquals("ОФОРМІТЬ РЕЗЮМЕ", getDriver().findElement(By.cssSelector("h2..firepath-matching-node")).getText());



    }

    @Test(groups = "good")
    public void EmptyPage() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        String xpath = thinkMobiles.getProperty("visititschool.xpath");
        VisitIt details1button = thinkMobiles.GoToVisitIt(xpath);
        details1button.EmptyPageSending();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if ("Warning: Name and Phone field should not be empty".equals(getDriver().findElement(By.id("errorNamePhone")).getText())) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
                }

        @Test(groups = "good")
        public void BacktoMainpage ()throws InterruptedException {
            goHome();
            ThinkMobiles thinkMobiles = new ThinkMobiles();
            wait(3000);
            String xpath = thinkMobiles.getProperty("visititschool.xpath");
            VisitIt backtothink = thinkMobiles.GoToVisitIt(xpath);
            backtothink.MainThinkMobiles();
            assertEquals("We build mobile applications", getDriver().findElement(By.xpath("html/body/section[2]/div/div[1]")).getText());

        }


    }
