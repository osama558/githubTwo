package Pages;

import Base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPaths.SearchObjectsPath.*;


public class SearchPages{

    public WebDriver driver = null;

    public SearchPages(WebDriver driver){
        this.driver = driver;
    }

    public void openUrl(){driver.get("https://github.com/search");
        }

    public void SearchInput(){
        WebElement searchInput = driver.findElement(searchBtn);
        searchInput.sendKeys("bshrAhmed");
        searchInput.sendKeys(Keys.RETURN);

    }
    public void openUsersUrl(){
        WebElement clickUsers = driver.findElement(usersLeft);
        clickUsers.click();
    }

    public void choosingUser(){
        WebElement userClick = driver.findElement(userBtn);
        userClick.click();
    }
    public void projectsClick(){
        WebElement userProClick = driver.findElement(userPro);
        userProClick.click();
    }

    public void codeButtenClick(){
        WebElement codeBtnO = driver.findElement(codeBtn);
        codeBtnO.click();
    }
    public void DownloadButton(){
        WebElement DownloadObj = driver.findElement(Download);
        DownloadObj.click();
    }

}
