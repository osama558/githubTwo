package GithubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import Pages.SearchPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;


public class GithubTest extends BaseClass {

    @Test
    public void loginPagesMethod() {
        LoginPages loginPages = new LoginPages(driver);
        loginPages.openUrl();
        loginPages.usernameField();
        loginPages.passwordField();
        loginPages.loinBtn();
        //Thread.sleep((5000));
    }

    @AfterMethod
    public void forgetPasswordTest() {
        LoginPages loginPages = new LoginPages(driver);
        loginPages.openUrl();
        loginPages.forgetPass();
        


    }

    @Test
    public void assertionFunction() {
        LoginPages assertFunction = new LoginPages(driver);
        assertFunction.openUrl();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Sign in to GitHub · GitHub";
        assertEquals(ExpectedTitle, ActualTitle);
        System.out.println(ExpectedTitle + " " + ActualTitle);
    }

    @Test
    public void assertionForgetFunction() {
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://github.com/password_reset");
        String A = driver1.getTitle();
        String E = "Forgot your password? · GitHub";
        assertEquals(E,A);
        System.out.println(A + "A - E" + E);
        driver1.quit();


        //LoginPages assertionFFunction = new LoginPages(driver);
        //assertionFFunction.openUrl();
        //assertionFFunction.forgetPass();


        //String ActualTitle = driver.getTitle();
        //String ExpectedTitle = "Sign in to GitHub · GitHub";
        //assertEquals(ExpectedTitle, ActualTitle);
        //System.out.println(ExpectedTitle + " " + ActualTitle);
    }
    @Test
    public void assertionSearchFunction() {

        SearchPages SearchObj = new SearchPages(driver);

        SearchObj.openUrl();
        String ActualTitle = SearchObj.driver.getTitle();
        String ExpectedTitle = "Search · GitHub";
        assertEquals(ExpectedTitle,ActualTitle);
        System.out.println(ExpectedTitle + " == " + ActualTitle);
        SearchObj.SearchInput();
        SearchObj.openUsersUrl();
        SearchObj.choosingUser();
        SearchObj.projectsClick();
        SearchObj.codeButtenClick();
        driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
        SearchObj.DownloadButton();
        driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);


    }







}


