package Apack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page2 {
    WebDriver driver;

    public page2(WebDriver driver) {
        this.driver= driver;
    }

    public WebElement page2(WebDriver driver){
         PageFactory.initElements(driver,this);
         return null;
     }
    @FindBy( css = "#content > div > div:nth-child(2) > div > form > input" )
    public WebElement login2;


     public WebElement login2(){
         return login2;
     }
}



