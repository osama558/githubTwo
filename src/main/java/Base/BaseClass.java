package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;

import java.util.concurrent.TimeUnit;


public class BaseClass {

    public WebDriver driver;

    @BeforeClass

    public void setUp() {


        // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "Drivers/chromedriver-win64/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


    }


    @AfterClass

    public void tearDown() {

        driver.quit();

    }


}
