package Pages;

import org.openqa.selenium.By;
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
        WebElement input = driver.findElement(By.xpath("//*[@id=\"email_field\"]"));
        input.sendKeys("test");

    }


}