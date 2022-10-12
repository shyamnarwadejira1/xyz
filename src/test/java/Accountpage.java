import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accountpage {

     WebDriver driver;
     public Accountpage (WebDriver driver){
          this.driver = driver;
     }

     private By Account = By.xpath("//*[@id=\"account-account\"]/ul/li[2]/a");

     public WebElement Account(){
          return driver.findElement(Account);

     }
}
