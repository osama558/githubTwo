package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPaths.LoginObjects.*;


public class LoginPages {

    WebDriver driver = null;

    public LoginPages(WebDriver driver){

        this.driver = driver;
    }

    public void openUrl(){
        driver.get("https://github.com/login");
    }

    //public void switchToEnglish(){
      //  WebElement english = driver.findElement(language);
       // english.click();
        //new Actions(driver)
        //        .click(english)
        //        .perform();




   // }

    //public void startNow(){
    ///    WebElement start = driver.findElement(startnow);
    //    start.click();
    //}

    public void usernameField(){
        WebElement userName = driver.findElement(username);
        userName.sendKeys("osam3@gmail.com");



    }
    public void passwordField(){
        WebElement passWord = driver.findElement(password);
        passWord.sendKeys("555");



    }
    public void loinBtn(){
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();



    }
    public void forgetPass(){
        WebElement forgetPssObj = driver.findElement(forgetpassword);
        forgetPssObj.click();
    }

   // public void more() {
        //driver.manage().timeouts().implicitlyWait(1555, TimeUnit.SECONDS);
   //     WebElement more = driver.findElement(morec);
        //new Actions(driver)
        //        .scrollToElement(more);

   //     more.click();
  //  }

    //public void scroll(){
       // WebElement scroll = driver

    //}
}