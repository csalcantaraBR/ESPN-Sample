import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Find {

	public static String player(String player) throws InterruptedException{
	    
		// TODO Auto-generated method stub
		Screen s = new Screen();
		System.setProperty("webdriver.chrome.driver", "..\\ESPN-DEMO\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Pattern user = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\user.png").similar(0.80);
		//Pattern pwLogin = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\pwLogin.png").similar(0.80);
		//Pattern LoginBtn = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\LoginBtn.png").similar(0.80);
		//Pattern errorLogin = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\errorLogin.png").similar(0.80);
		String result;
		driver.get("https://www.espn.com");
				
				try {
					s.wait("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\ESPN.png");
					driver.manage().window().maximize();
				
				
				
				//driver.findElement(By.xpath("//article[@id='sideLogin-left-rail']//button[@class='button-alt med'][normalize-space()='Log In']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@id='global-search-trigger']")).click();
				driver.findElement(By.xpath("//input[@id='global-search-input']")).sendKeys(player);
				s.type(Key.ENTER, 0);
				s.wait("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\player.png");
				driver.close();
				} catch (FindFailed e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					driver.close();
					result = "Failed";
					return result;
				}
				driver.close();
				result = "sucess";
				return result;
		
	}

	public static String sport(String user, String pw, String folow) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub
		Screen s = new Screen();
		System.setProperty("webdriver.chrome.driver", "..\\ESPN-DEMO\\Libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String result;
		
		System.setProperty("webdriver.chrome.driver", "..\\ESPN-DEMO\\Libs\\chromedriver.exe");
		Pattern folowbtn = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\addfav.png").similar(0.70);
		Pattern pwLogin = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\pwLogin.png").similar(0.70);
		Pattern LoginBtn = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\LoginBtn.png").similar(0.70);
		Pattern errorLogin = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\errorLogin.png").similar(0.70);
		Pattern userin = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\user.png").similar(0.80);
		Pattern FlwMenu = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\FlwMenu.png").similar(0.70);
		Pattern searchbar = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\searchbar.png").similar(0.80);
		Pattern unfollowbtn = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\unfollowbtn.png").similar(0.7);
		
		
		Pattern followbtn = new Pattern("C:\\Users\\csalc\\eclipse-workspace\\ESPN-DEMO\\img\\followbtn.png").similar(0.80);
		
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
			s.click(userin);
			s.type(user, 0);
			
			s.click(pwLogin);
			s.type(pw, 0);
			
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
		Thread.sleep(4000);
		//FlwMenu
		s.click(FlwMenu);
		
		Thread.sleep(2000);
		s.click(folowbtn);
		Thread.sleep(2000);
		s.click(searchbar);
		s.type(folow, 0);
		Thread.sleep(2000);
		s.click(followbtn);
		
		if (s.exists(unfollowbtn) != null
		        && s.exists(unfollowbtn) != null
		        && s.exists(unfollowbtn) != null)

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
