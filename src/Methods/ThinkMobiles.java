package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class ThinkMobiles extends PageBase {
    WebDriver driver = getDriver();
    public static WebElement HowWeWork;
    public WebElement Career;
    public static WebElement ContactUs;
    public WebElement VisitItSchool;
    public WebElement BodrumLifeButton;
    public WebElement StartupHelpBtn;


    public ThinkMobiles() {               //використовується у всіх тестах

        super();

    }

    public void Init() {                 //використовується у всіх тестах

    }

    public HowWeWork GoToHowWeWork() throws InterruptedException {
        HowWeWork = getDriver().findElement(By.xpath(".//*[@id='ut-navigation']/a[1]"));
        HowWeWork.click();
        wait(1000);
        return new HowWeWork();
    }

    public Career GoToCareer() throws InterruptedException {
        Career = getDriver().findElement(By.xpath(".//*[@id='ut-navigation']/a[2]"));
        Career.click();
        wait(1000);
        return new Career();
    }


    public ContactUs GoToContactUs() throws InterruptedException {
        ContactUs = getDriver().findElement(By.xpath(".//*[@id='ut-navigation']/a[3]"));
        ContactUs.click();
        wait(1000);
        return new ContactUs();
    }

    public VisitIt GoToVisitIt(String xpath) throws InterruptedException {
        VisitItSchool = getDriver().findElement(By.xpath(xpath));
        VisitItSchool.click();
        wait(1000);
        return new VisitIt();
    }

    public void GoToBodrum(String xpath) throws InterruptedException {
        BodrumLifeButton = getDriver().findElement(By.xpath(xpath));
        BodrumLifeButton.click();
        wait(1000);


    }
    public void GoToStartup(String xpath) throws InterruptedException {
        StartupHelpBtn = getDriver().findElement(By.xpath(xpath));
        StartupHelpBtn.click();
        wait(1000);
    }

}