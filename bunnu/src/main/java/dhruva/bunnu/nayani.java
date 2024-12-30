package dhruva.bunnu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nayani {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\Users\dhruv\Downloads\chrome-win64.zip\chrome-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://facebook.com");
		//sendKeys-is to input the text in "username/password fields"
		driver.findElement(By.id("email")).sendKeys("dhruvamuvva@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.name("pass")).sendKeys("bunnunayani");
		Thread.sleep(10000);
		//click is to perform action on "buttons"
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();
		driver.getCurrentUrl();

	}

}
