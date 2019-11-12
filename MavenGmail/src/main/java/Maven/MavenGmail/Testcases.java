package Maven.MavenGmail;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcases extends Drivers {
	Properties page;

	@BeforeClass
	  public void beforeClass() {
		browserLaunch ("CHROME","https://www.gmail.com");
		}
	@Test
	  public void registration() throws Exception
	  {
		  page=new Properties(driver);
		  page.UserLogin();
	  }
 

}
