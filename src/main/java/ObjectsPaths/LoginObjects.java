package ObjectsPaths;

import org.openqa.selenium.By;

public class LoginObjects {

    //public static final By language = By.xpath("//nav[1]//div//button[contains(text(),'English')]");
    //public static final By startnow = By.xpath("//*[@id=\"intro\"]/div/div[4]/div/div[3]/a");
    //public static final By language = By.xpath("//nav[1]//div//button[contains(text(),'English')]");
    //public static final By morec = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[4]/button");

    public static final By username = By.id("login_field");
    public static final By password = By.xpath("//*[@id=\"password\"]");
    public static final By loginButton = By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]");
    public static final By forgetpassword = By.xpath("//*[@id=\"forgot-password\"]");



}