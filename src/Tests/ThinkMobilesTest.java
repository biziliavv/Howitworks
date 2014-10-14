package Tests;
import Methods.HowWeWork;
import Methods.ThinkMobiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class ThinkMobilesTest extends BaseTest {

    @Test(groups = "good")
    public void HowWeWork() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        wait(3000);
        assertEquals("Perfect software is measured in creativity, effort and commitment", getDriver().findElement(By.cssSelector("div.breakout > h3")).getText());
        assertEquals("Steps", getDriver().findElement(By.linkText("Steps")).getText());

    }

    @Test(groups = "good")
    public void OpenWholeProcess() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        wait(3000);
        OpenMethodologies.OpenWholeProcess();
        assertEquals("Simple Soluthion To Our Process", getDriver().findElement(By.cssSelector("div.howw.firstpage > h3")).getText());
        wait(2000);
    }

        @Test(groups = "good")
    public void WaterfallTm() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        OpenMethodologies.WaterfallTM();
        wait(3000);
        assertEquals("Request & NDA", getDriver().findElement(By.cssSelector("section.nda > h3")).getText());

    }

    @Test(groups = "good")
    public void OpenSolution() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        OpenMethodologies.SolutionTM();
        wait(3000);
        assertEquals("Mobile Strategy & Consultancy", getDriver().findElement(By.cssSelector("h2")).getText());


    }

    @Test(groups = "good")
    public void OpenDevelopment() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        OpenMethodologies.DevelopmentTM();
        wait(3000);
        assertEquals("Enterprise Mobile Application Development and Solutions| Intellectsoft US", getDriver().getTitle());

    }


    @Test(groups = "good")
    public void OpenBusinessRelations() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        OpenMethodologies.WaterfallTM();
        OpenMethodologies.OpenBusinessRelations();
        wait(3000);
        assertEquals("Complex problems need elegant solutions", getDriver().findElement(By.cssSelector("h1")).getText());

    }

    @Test(groups = "good")
    public void OpenAnalyze() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        OpenMethodologies.WaterfallTM();
        OpenMethodologies.OpenAnalyze();
        wait(3000);
        assertEquals("Services for SMB, Consumers and Startups | Intellectsoft US", getDriver().getTitle());
    }

    @Test(groups = "good")
    public void OpenStrategy() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        OpenMethodologies.WaterfallTM();
        OpenMethodologies.OpenStrategy();
        wait(3000);
        assertEquals("Enterprise Mobile Application Development and Solutions| Intellectsoft US", getDriver().getTitle());

    }

    @Test(groups = "good")
    public void OpenAppDev() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        OpenMethodologies.WaterfallTM();
        OpenMethodologies.OpenAppDev();
        wait(3000);
        assertEquals("Enterprise Mobile Application Development and Solutions| Intellectsoft US", getDriver().getTitle());
    }

    @Test(groups = "good")
    public void OpenCustomizedSupport() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        OpenMethodologies.WaterfallTM();
        OpenMethodologies.OpenCustomizedSupport();
        wait(3000);
        assertEquals("Support and Maintenance", getDriver().findElement(By.xpath("//article[5]/div[2]/div/h2")).getText());

    }
    @Test(groups = "good")
    public void OpenAgile() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        HowWeWork OpenMethodologies = thinkMobiles.GoToHowWeWork();
        OpenMethodologies.OpenMethodologies();
        OpenMethodologies.WaterfallTM();
        wait(3000);
        OpenMethodologies.OpenAgile();
        assertEquals("AGILE PRINCIPLES", getDriver().findElement(By.cssSelector("section > h3")).getText());
        wait(3000);
    }

    }








