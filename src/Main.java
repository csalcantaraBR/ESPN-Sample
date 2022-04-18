import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.*;
import org.sikuli.script.*;


public class Main {
	

	public static void main(String[] args) throws InterruptedException, FindFailed {
		String Step1 = singup.singup("name", "name", "teste@hotmail.com", "name@12345", true);
		System. out. println(Step1);
		String Step2 = Login.login("username","pw2345");
		System. out. println(Step2);
		String Step3 = Find.player("Neymar");
		System. out. println(Step3);
		String Step4 = Find.sport("c.s.alcantara@hotmail.com","Accenture@2022","Lakers");
		System. out. println(Step4);
	}
	

}

