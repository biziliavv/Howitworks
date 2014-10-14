package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Vitaliy&Yana on 14.08.2014.
 */
public class ContactUs extends ThinkMobiles {

    public static WebElement ContactUs;
    public WebElement SendBtn;
    public WebElement FirstMenuBtn;
    public WebElement EntrepreneurBtn;
    public WebElement BusinessExecutiveBtn;
    public WebElement ItExpertBtn;
    public WebElement VcBtn;
    public WebElement OtherBtn;
    public WebElement SecondMenuBtn;
    public WebElement MobileAppDevBtn;
    public WebElement IdeaRequirementsBtn;
    public WebElement TimeBudgetBtn;
    public WebElement AppDevBtn;
    public WebElement OtherSecondBtn;
    public WebElement IndustrySpecificBtn;
    public WebElement EmailField;
    public WebElement TextBlock;


    public void ContactUs() throws InterruptedException {
        goHome();
        wait(3000);
        ContactUs = getDriver().findElement(By.xpath(".//*[@id='ut-navigation']/a[3]"));
        ContactUs.click();

        wait(3000);
    }

    public void SendPage() throws InterruptedException {
        SendBtn = getDriver().findElement(By.xpath(getProperty("sendbtn.xpath")));
        SendBtn.click();
        wait(2000);

    }

    public void FirstMenuSelected() throws InterruptedException {
        FirstMenuBtn = getDriver().findElement(By.xpath(getProperty("firstmenu.xpath")));
        FirstMenuBtn.click();
    }

    public void EntrepreneurChoosed() throws InterruptedException {
        EntrepreneurBtn = getDriver().findElement(By.xpath(getProperty("entrepreneur.xpath")));
        EntrepreneurBtn.click();
    }

    public void BusinessExecutiveChoosed() throws InterruptedException {
        BusinessExecutiveBtn = getDriver().findElement(By.xpath(getProperty("businessexecutive.xpath")));
        BusinessExecutiveBtn.click();
    }

    public void ItExpertChoosed() throws InterruptedException {
        ItExpertBtn = getDriver().findElement(By.xpath(getProperty("itexpert.xpath")));
        ItExpertBtn.click();
    }

    public void VcChoosed() throws InterruptedException {
        VcBtn = getDriver().findElement(By.xpath(getProperty("vc.xpath")));
        VcBtn.click();
    }

    public void OtherChoosed() throws InterruptedException {
        OtherBtn = getDriver().findElement(By.xpath(getProperty("other.xpath")));
        OtherBtn.click();
    }

    public void SeconMenuChoosed() throws InterruptedException {
        SecondMenuBtn = getDriver().findElement(By.xpath(getProperty("secondmenu.xpath")));
        SecondMenuBtn.click();
    }

    public void MobileAppDevChoosed() throws InterruptedException {
        MobileAppDevBtn = getDriver().findElement(By.xpath(getProperty("mobileappdev.xpath")));
        MobileAppDevBtn.click();
    }

    public void IdeaRequirementsChoosed() throws InterruptedException {
        IdeaRequirementsBtn = getDriver().findElement(By.xpath(getProperty("idearequirements.xpath")));
        IdeaRequirementsBtn.click();
    }

    public void TimeBudgetChoosed() throws InterruptedException {
        TimeBudgetBtn = getDriver().findElement(By.xpath(getProperty("timebudget.xpath")));
        TimeBudgetBtn.click();
    }

    public void IndustrySpecificChoosed() throws InterruptedException {
        IndustrySpecificBtn = getDriver().findElement(By.xpath(getProperty("industryspecific.xpath")));
        IndustrySpecificBtn.click();
    }

    public void AppDevChoosed() throws InterruptedException {
        AppDevBtn = getDriver().findElement(By.xpath(getProperty("appdev.xpath")));
        AppDevBtn.click();

    }

    public void OtherSecondChoosed() throws InterruptedException {
        OtherSecondBtn = getDriver().findElement(By.xpath(getProperty("othersecond.xpath")));
        OtherSecondBtn.click();
    }

    public void EmailChoosed() throws InterruptedException {
        EmailField = getDriver().findElement(By.xpath(getProperty("email.xpath")));
        EmailField.clear();
        EmailField.sendKeys(getProperty("email"));
    }


    public void TextBlockChoosed() throws InterruptedException {
        TextBlock = getDriver().findElement(By.xpath(getProperty("textblock.xpath")));
        TextBlock.clear();
        TextBlock.sendKeys(getProperty("textfield"));

    }
}
