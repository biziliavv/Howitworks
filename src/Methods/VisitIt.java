package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Vitaliy&Yana on 15.08.2014.
 */
public class VisitIt extends ThinkMobiles {
    public WebElement DetailsButton;
    public WebElement Details1Button;
    public WebElement Registration1;
    public WebElement Registration2;
    public WebElement CloseButton;
    public WebElement Register3;
    public WebElement SendButton;
    public WebElement ThinkButton;


    public void VisitIt() throws InterruptedException {
        VisitItSchool = getDriver().findElement(By.xpath(getProperty("visititschool.xpath")));
        VisitItSchool.click();
        wait(3000);
    }
    public void DetailsButtonChoosed() throws InterruptedException {
        DetailsButton = getDriver().findElement(By.xpath(getProperty("details.xpath")));
        DetailsButton.click();
    }
    public void Details1ButtonChoosed() throws InterruptedException {
        Details1Button = getDriver().findElement(By.xpath(getProperty("details2button.xpath")));
        Details1Button.click();
    }
    public void Registration1Choosed() throws InterruptedException {
        Registration1 = getDriver().findElement(By.xpath(getProperty("registration1.xpath")));
        Registration1.click();
    }
    public void Registration2Choosed() throws InterruptedException {
        Registration2 = getDriver().findElement(By.xpath(getProperty("registration2.xpath")));
        Registration2.click();
    }
    public void Details1Close() throws InterruptedException {
        CloseButton = getDriver().findElement(By.xpath(getProperty("closebutton.xpath")));
        CloseButton.click();
    }
    public void RegisterAndroid() throws InterruptedException {
        Register3 = getDriver().findElement(By.xpath(getProperty("register3.xpath")));
        Register3.click();
    }
    public void EmptyPageSending() throws InterruptedException {
        SendButton = getDriver().findElement(By.xpath(getProperty("sendbtn.xpath")));
        SendButton.click();
    }
    public void MainThinkMobiles() throws InterruptedException {
        ThinkButton = getDriver().findElement(By.xpath(getProperty("thinkmobiles.xpath")));
        ThinkButton.click();
    }

}
