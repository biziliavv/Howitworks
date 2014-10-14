package Tests;

import Methods.ContactUs;
import Methods.ThinkMobiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Vitaliy&Yana on 14.08.2014.
 */
public class TestContact extends BaseTest {

    @Test(groups = "good")
    public void ContactUs() throws InterruptedException {
        goHome();
        getDriver().manage().window().maximize();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        ContactUs sendd = thinkMobiles.GoToContactUs();
        sendd.SendPage();
        assertEquals("Warning:  Email address is incorrect", getDriver().findElement(By.cssSelector("li")).getText());

    }

    @Test(groups = "good")
    public void OneItemSelected() throws InterruptedException {
        goHome();
        getDriver().manage().window().maximize();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        ContactUs oneitem = thinkMobiles.GoToContactUs();
        oneitem.FirstMenuSelected();
        oneitem.EntrepreneurChoosed();
        oneitem.SendPage();
        assertEquals("Warning:  Email address is incorrect", getDriver().findElement(By.cssSelector("li")).getText());
    }

    @Test(groups = "good")
    public void IncorrectEmail() throws InterruptedException {
        goHome();
        getDriver().manage().window().maximize();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        ContactUs incorrectemail = thinkMobiles.GoToContactUs();
        incorrectemail.EmailChoosed();
        incorrectemail.SendPage();
        assertEquals("Warning:  Email address is incorrect", getDriver().findElement(By.cssSelector("li")).getText());


    }

    @Test(groups = "good")
    public void EmptyTextSending() throws InterruptedException {
        goHome();
        getDriver().manage().window().maximize();
        ThinkMobiles thinkMobiles = new ThinkMobiles();
        wait(3000);
        ContactUs emptytextsending = thinkMobiles.GoToContactUs();
        emptytextsending.EmailChoosed();
        emptytextsending.TextBlockChoosed();
        emptytextsending.SendPage();
        assertEquals("Warning:  Message is empty", getDriver().findElement(By.xpath("//section[@id='our-contact']/div[3]/div[2]/div/ul/li[2]")).getText());

        }

    }


