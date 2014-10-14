package Tests;
import Methods.Career;
import Methods.HowWeWork;
import Methods.ThinkMobiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Vitaliy&Yana on 13.08.2014.
 */
public class ThinMobilesTest2 extends BaseTest {

    @Test(groups = "good")
    public void Ben() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        Career ben = thinkMobiles.GoToCareer();
        ben.OpenBenefit();
        wait(3000);
        assertEquals("", getDriver().findElement(By.cssSelector("h1.vacancies-title")).getText());

    }
    @Test(groups = "good")
    public void NotConv() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        Career ben = thinkMobiles.GoToCareer();
        ben.OpenBenefit();
        ben.NotConvincedPage();
        wait(3000);
        assertEquals("Area of study", getDriver().findElement(By.cssSelector("div.not-viz > div.row > div.col-sm-6 > div.thumbnail > h2 > font > font")).getText());
    }

        @Test(groups = "good")
    public void MIOSDeveloper() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        Career MiddleIosDev = thinkMobiles.GoToCareer();
        MiddleIosDev.MiddleIOSDeveloperPage();
        wait(3000);
        assertEquals("Middle iOS developer", getDriver().findElement(By.cssSelector("h1.vacancy-title")).getText());


    }

    @Test(groups = "good")
    public void JunIOSDeveloper() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        Career JuniorIOS = thinkMobiles.GoToCareer();
        JuniorIOS.JuniorIOSDeveloperPage();
        wait(3000);
        assertEquals("Junior iOS developer", getDriver().findElement(By.cssSelector("h1.vacancy-title")).getText());

    }

    @Test(groups = "good")
    public void JunAndroidDeveloper() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        Career JuniorAndroid = thinkMobiles.GoToCareer();
        JuniorAndroid.JuniorAndroidDeveloperPage();
        wait(3000);
        assertEquals("Android-developer", getDriver().findElement(By.cssSelector("h1.vacancy-title")).getText());

    }
    @Test(groups = "good")
    public void Design() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        Career Designn = thinkMobiles.GoToCareer();
        Designn.DesignerPage();
        wait(3000);
        assertEquals("Designer", getDriver().findElement(By.cssSelector("h1.vacancy-title")).getText());
    }
    @Test(groups = "good")
    public void Analystt() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        Career Analysttt = thinkMobiles.GoToCareer();
        Analysttt.AnalystPage();
        wait(3000);
        assertEquals("Analyst (Technical writer)", getDriver().findElement(By.cssSelector("h1.vacancy-title")).getText());
    }
    @Test(groups = "good")
    public void BDMM() throws InterruptedException {
        goHome();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        Career BDMMM = thinkMobiles.GoToCareer();
        BDMMM.BDMPage();
        wait(3000);
        assertEquals("Business Development Manager", getDriver().findElement(By.cssSelector("h1.vacancy-title")).getText());

    }

    }