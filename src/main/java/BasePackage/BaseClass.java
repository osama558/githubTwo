package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class BaseClass {

    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

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
