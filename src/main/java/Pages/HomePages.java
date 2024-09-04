package Pages;

import org.openqa.selenium.*;
import ObjectsPaths.HomePagesPaths;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPaths.HomePagesPaths.*;

public class HomePages {

    WebDriver driver = null;


    public HomePages(WebDriver driver) {

        this.driver = driver;

    }


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl() {
        getDriver().get("https://github.com/");
    }

    public void ScrollDownEnd() throws InterruptedException {

        WebElement pr = driver.findElement(productBtn);
        pr.sendKeys(Keys.END);
        WebElement pl = driver.findElement(docsLink);
        pl.click();

//        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//        String currentURL = driver.getCurrentUrl();
//        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//        String currentURL2 = driver.getCurrentUrl();
//        String currentURL3 = driver.getCurrentUrl();
//        //String j = getDriver().getCurrentUrl();
//        System.out.println(currentURL);
//        System.out.println(currentURL2);
//        System.out.println(currentURL3);


        //driver;

    }

    public void scrollToPosition(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0],arguments[1]);", x, y);
    }

    public void ScrollDownEnd2() throws InterruptedException {

        WebElement pr = driver.findElement(senkey);
        pr.sendKeys(Keys.END);
    }

    public void clickOnYes() {
        WebElement n = getDriver().findElement(yes_survay);
        n.click();
    }

    public void addText(String s) {
        WebElement m = getDriver().findElement(yes_comment);
        m.sendKeys(s);

    }

    public void clickSend() {
        WebElement se = getDriver().findElement(sendBtn);
        se.click();
    }


}

