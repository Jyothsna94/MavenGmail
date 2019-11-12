package Maven.MavenGmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Properties extends Drivers {
	@FindBy (xpath="//*[@id=\"identifierId\"]")public WebElement Email;
	@FindBy (xpath="//*[@id=\"identifierNext\"]/span/span")public WebElement Next;
	@FindBy (xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")public WebElement password;
	@FindBy (xpath="//*[@id=\"passwordNext\"]/span/span")public WebElement Next1;
	@FindBy (xpath="//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div[2]/div/a/span")public WebElement Gsuite;
	@FindBy (xpath="//*[@id=\"gb_71\"]")public WebElement Signout;
    public Properties (WebDriver driver) {
    PageFactory.initElements(driver, this);
    	
    }
    public void UserLogin() throws InterruptedException
	{
    	Thread.sleep(2000);
    	Email.sendKeys("jyothsna@ramersoft.com");
    	Next.click();
    	password.sendKeys("ramer@143");
    	Next1.click();
    	Gsuite.click();
    	Signout.click();
	}
	}

