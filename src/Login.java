import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Login {

	public static String login(String userIn , String pwIn) throws InterruptedException{
	    
		// TODO Auto-generated method stub
				Screen s = new Screen();
				System.setProperty("webdriver.chrome.driver", "..\\ESPN-DEMO\\Libs\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				Pattern user = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\user.png").similar(0.80);
				Pattern pwLogin = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\pwLogin.png").similar(0.80);
				Pattern LoginBtn = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\LoginBtn.png").similar(0.80);
				Pattern errorLogin = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\errorLogin.png").similar(0.80);
				String result;
				driver.get("https://www.espn.com");
				
				try {
					s.wait("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\ESPN.png");
					driver.manage().window().maximize();
				} catch (FindFailed e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				driver.findElement(By.xpath("//article[@id='sideLogin-left-rail']//button[@class='button-alt med'][normalize-space()='Log In']")).click();
				
				try {
					Thread.sleep(2000);
					s.click(user);
					s.type(userIn, 0);
					
					s.click(pwLogin);
					s.type(pwIn, 0);
					
					s.click(LoginBtn);
		
		
				} catch (FindFailed e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if (s.exists(errorLogin) != null
				        && s.exists(errorLogin) != null
				        && s.exists(errorLogin) != null)

				    // This will create a log message letting the user know if the folder did or did not display
				    // correctly.
				    {
					result = "Fail";
				    } else {
				    	result = "Success";
				    }
				
				driver.close();
				return result;

		
	}

	

}
