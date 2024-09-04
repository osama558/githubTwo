package GithubWeb;

import Base.BaseClass;
import Pages.HomePages;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;


public class GithubHomePagesTest extends BaseClass {

    @Test
    public void homePagesMethod() throws InterruptedException {

        HomePages d = new HomePages(driver);
        d.openUrl();
        String ActuallTitle = d.getDriver().getTitle();
        String ExpactedTitle = "GitHub: Let’s build from here · GitHub";
        assertEquals(ExpactedTitle, ActuallTitle);
        d.ScrollDownEnd();
        //Thread.sleep(5000);
        //d.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        //WebDriver dd = new ChromeDriver();
        //String newUrl = driver.getCurrentUrl();
        //System.out.println(newUrl);#

        //d.scrollToPosition(100, 100);

        d.getDriver().get("https://docs.github.com/en");
        //WebElement v = d.getDriver().findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div/div/button"));
        //v.sendKeys(Keys.END);
        d.ScrollDownEnd2();
        d.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //WebElement n = d.getDriver().findElement(By.xpath("//*[@id='survey-yes']"));
        //n.click();

        d.clickOnYes();

        d.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        //WebElement m = d.getDriver().findElement(By.xpath("//*[@id='survey-comment']"));
        //m.sendKeys("Yes");
        d.addText("Testing");
        d.getDriver().manage().timeouts().implicitlyWait(1000000000, TimeUnit.SECONDS);

        //WebElement se = d.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/footer/section[1]/div/div[1]/form/div[3]/button[2]"));
        //se.click();
        d.clickSend();
        d.getDriver().navigate().back();



    }


    //public void


}
