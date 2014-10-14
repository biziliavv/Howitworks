package Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Created by Vitaliy&Yana on 12.08.2014.
 */
public class Career extends ThinkMobiles {
    public static WebElement Career;
    public WebElement BenefitBtn;
    public WebElement MiddleIOSDeveloper;
    public WebElement JuniorIOSDeveloper;
    public WebElement JuniorAndroidDeveloper;
    public WebElement Designer;
    public WebElement Analyst;
    public WebElement NotConvincedtBtn;
    public WebElement BDM;

    public void Career() throws InterruptedException {
        goHome();
        wait(2000);
        Career = getDriver().findElement(By.xpath(getProperty("career.xpath")));
        Career.click();
        wait(2000);

    }

    public void OpenBenefit() throws InterruptedException {
        BenefitBtn = getDriver().findElement(By.xpath(getProperty("benefitbtn.xpath")));
        BenefitBtn.click();
    }

    public void NotConvincedPage() throws InterruptedException {
        NotConvincedtBtn = getDriver().findElement(By.xpath(getProperty("notconvincedbtn.xpath")));
        NotConvincedtBtn.click();

    }

    public void MiddleIOSDeveloperPage() throws InterruptedException {
        MiddleIOSDeveloper = getDriver().findElement(By.xpath(getProperty("middleiosdeveloper.xpath")));
        MiddleIOSDeveloper.click();
    }

    public void JuniorIOSDeveloperPage() throws InterruptedException {
        JuniorIOSDeveloper = getDriver().findElement(By.xpath(getProperty("junioriosdeveloper.xpath")));
        JuniorIOSDeveloper.click();

    }

    public void JuniorAndroidDeveloperPage() throws InterruptedException {
        JuniorAndroidDeveloper = getDriver().findElement(By.xpath(getProperty("juniorandroiddeveloper.xpath")));
        JuniorAndroidDeveloper.click();
    }

    public void DesignerPage() throws InterruptedException {
        Designer = getDriver().findElement(By.xpath(getProperty("designer.xpath")));
        Designer.click();
    }

    public void AnalystPage() throws InterruptedException {
        Analyst = getDriver().findElement(By.xpath(getProperty("analyst.xpath")));
        Analyst.click();
    }

    public void BDMPage() throws InterruptedException {
        BDM = getDriver().findElement(By.xpath(getProperty("bdm.xpath")));
        BDM.click();
    }


}