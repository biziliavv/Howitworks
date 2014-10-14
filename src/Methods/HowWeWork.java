package Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Created by Vitaliy&Yana on 12.08.2014.
 */
public class HowWeWork extends ThinkMobiles {
    public static WebElement HowWeWork;
    public WebElement WholeProcessLnk;
    public WebElement Methodologies;
    public WebElement AgileBtn;
    public WebElement CustomizedSupportLnk;
    public WebElement ApplicationDevelopmentLnk;
    public WebElement BusinessRelationsTm;
    public WebElement AnalyzeLnk;
    public WebElement StrategyLnk;
    public WebElement DevelopmentLnk;
    public WebElement SolutionLnk;
    public WebElement WaterfallBtn;


    public void HowWeWork() throws InterruptedException {
        goHome();
        wait(3000);
        HowWeWork = getDriver().findElement(By.xpath(getProperty("howwework.xpath")));
        HowWeWork.click();
        wait(3000);


    }

    public void OpenMethodologies() throws InterruptedException {
        Methodologies = getDriver().findElement(By.xpath(getProperty("methodologies.xpath")));
        Methodologies.click();
    }


    public void WaterfallTM() throws InterruptedException {
        WaterfallBtn = getDriver().findElement(By.xpath(getProperty("waterfalbtn.xpath")));
        WaterfallBtn.click();


    }

    public void SolutionTM() throws InterruptedException {
        SolutionLnk = getDriver().findElement(By.xpath(getProperty("solutionlnk.xpath")));
        SolutionLnk.click();
    }

    public void DevelopmentTM() throws InterruptedException {
        DevelopmentLnk = getDriver().findElement(By.xpath(getProperty("developmentlnk.xpath")));
        DevelopmentLnk.click();
    }


    public void OpenBusinessRelations() throws InterruptedException {
        BusinessRelationsTm = getDriver().findElement(By.xpath(getProperty("businessrelationstm.xpath")));
        BusinessRelationsTm.click();
    }

    public void OpenAnalyze() throws InterruptedException {
        AnalyzeLnk = getDriver().findElement(By.xpath(getProperty("analyzelnk.xpath")));
        AnalyzeLnk.click();
    }

    public void OpenStrategy() throws InterruptedException {
        StrategyLnk = getDriver().findElement(By.xpath(getProperty("strategylnk.xpath")));
        StrategyLnk.click();
    }

    public void OpenAppDev() throws InterruptedException {
        ApplicationDevelopmentLnk = getDriver().findElement(By.xpath(getProperty("applicationdevelopmentlnk.xpath")));
        ApplicationDevelopmentLnk.click();
    }

    public void OpenCustomizedSupport() throws InterruptedException {
        CustomizedSupportLnk = getDriver().findElement(By.xpath(getProperty("customizedsupportlnk.xpath")));
        CustomizedSupportLnk.click();
    }
    public void OpenAgile() throws InterruptedException {
        AgileBtn = getDriver().findElement(By.xpath(getProperty("agilebtn.xpath")));
        AgileBtn.click();

    }
    public void OpenWholeProcess() throws InterruptedException {
        WholeProcessLnk = getDriver().findElement(By.xpath(getProperty("wholeprocesslnk.xpath")));
        WholeProcessLnk.click();

    }
}
