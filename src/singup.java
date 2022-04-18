import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class singup {

	public static String singup(String firstnameIn , String lastnameIn, String emailIn, String pwIn, boolean checkboxIn) throws InterruptedException{
	    
		// TODO Auto-generated method stub
		
				Screen s = new Screen();
				System.setProperty("webdriver.chrome.driver", "..\\ESPN-DEMO\\Libs\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				Pattern firstname = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\firstname.png").similar(0.85);
				Pattern lastname = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\lastname.png").similar(0.85);
				Pattern email = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\email.png").similar(0.85);
				Pattern pw = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\pw.png").similar(0.85);
				Pattern checkbox = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\checkbox.png").similar(0.85);
				Pattern error = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\error.png").similar(0.85);
				String result;
				driver.get("https://www.espn.com");
				
				try {
					s.wait("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\ESPN.png");
					driver.manage().window().maximize();
				} catch (FindFailed e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				driver.findElement(By.xpath("//article[@id='sideLogin-left-rail']//button[@class='button med'][normalize-space()='Sign Up']")).click();
				
				try {
					Thread.sleep(2000);
					
					s.click(firstname);
					s.type(firstnameIn, 0);
					
					s.click(lastname);
					s.type(lastnameIn, 0);
					
					s.click(email);
					s.type(emailIn, 0);
					
					s.click(pw);
					s.type(pwIn, 0);
					
					if (checkboxIn) {
						s.click(checkbox);
						}
					
					
					
					s.type(Key.PAGE_DOWN, 0);
					s.type(Key.PAGE_DOWN, 0);
					s.type(Key.PAGE_DOWN, 0);
					s.type(Key.PAGE_DOWN, 0);
					s.type(Key.PAGE_DOWN, 0);
					s.type(Key.PAGE_DOWN, 0);
					
					s.wait("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\signup.png");
					s.click("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\signup.png");
					
				} catch (FindFailed e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if (s.exists(error) != null
				        && s.exists(error) != null
				        && s.exists(error) != null)

				    // This will create a log message letting the user know if the folder did or did not display
				    // correctly.
				    {
					result = "fail";
				    } else {
				    	result = "Success";
				    }
				
				driver.close();
				return result;

		
	}

	

}
