package GithubWeb;

import Base.BaseClass;
import Pages.HomePages;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;


public class GithubHomePagesTest extends BaseClass {

    //@Test
    //@Description("This test homePagesMethod at this test does not test 2-Factor Authentication.")
    @Test
    @Epic("Home Page")
    @Feature("Docs form")
    @Story("User send feedback")
    @Owner("Osama Alghamdi")
    @Severity(SeverityLevel.MINOR)
    @Description("Testing sending feedbacks")
    public void homePagesMethod() throws InterruptedException {
        HomePages d = new HomePages(driver);
        d.openUrl();
        String ActuallTitle = d.getDriver().getTitle();
        String ExpactedTitle = "GitHub: Let’s build from here · GitHub";



        assertEquals(ExpactedTitle, ActuallTitle);
        d.ScrollDownEnd();
        //d.scrollToPosition(100, 100);
        d.getDriver().get("https://docs.github.com/en");
        d.ScrollDownEnd2();
        d.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(500);
        d.clickOnYes();
        d.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        d.addText("Testing");
        d.getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        d.clickSend();
        d.getDriver().navigate().back();
    }





}
