package Apack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
    WebDriver driver;

    public loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
     // creating object
    @FindBy( id = "input-email" )
    public WebElement email;
    @FindBy( id = "input-password" )
    public WebElement Pass;
    @FindBy( css = "#content > div > div:nth-child(2) > div > form > input" )
    public WebElement login;
    // creating method and returning value
    public WebElement email() {
        return email;
    }
    public WebElement Pass() {
        return Pass;
    }
    public WebElement login() {
        return login;
    }
}
