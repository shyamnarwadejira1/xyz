
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

    WebDriver driver;
      public loginpage (WebDriver driver){
          this.driver = driver;
      }

   private By emailId = By.id("input-email");
     private By pass = By.id("input-password");
private  By login = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");


    public WebElement emailId(){
        return driver.findElement(emailId);


    }
    public WebElement pass(){
        return driver.findElement(pass);
        //ok
    }
    public WebElement login(){
        return driver.findElement(login);
    }
}

