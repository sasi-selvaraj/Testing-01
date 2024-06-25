
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SwaminathaN\\eclipse-workspace\\Testing01\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sasiselvaraj@123");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Sasi@123");
		
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		
		
	
		
		
		
		

	}

}
