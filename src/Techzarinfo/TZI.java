

package Techzarinfo;





import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class TZI {
	
	    public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SwaminathaN\\eclipse-workspace\\Testing01\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techzarinfo.com/");
		driver.manage().window().maximize();
		                                                                                                           
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scroll(0,5000)"); Thread.sleep(3000);
		  jse.executeScript("window.scroll(0,-7000)"); Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div/div/div[1]/div/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[3]/a")). click(); Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[6]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[7]/a")).
		  click(); Thread.sleep(3000); 
		  jse.executeScript("window.scroll(0,500)");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("sasi");
		  driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("123456789");
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sasiselvaraj@gmail.com");
		  WebElement dp2=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		  Select select=new Select(dp2); 
		  select.selectByVisibleText("India"); 
		  WebElement dp1=driver.findElement(By.xpath("//*[@id=\"service\"]")); 
		  Select select1= new  Select(dp1); select1.selectByVisibleText("SaaS");
		  driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Testing");
		  driver.findElement(By.xpath("//*[@id=\"contact\"]/div[1]/div/form/div[4]")).click(); 
		  TakesScreenshot ts=(TakesScreenshot) driver; 
		  File source=ts.getScreenshotAs(OutputType.FILE); 
		  File sourceFile = new File("C:\\Users\\SwaminathaN\\eclipse-workspace\\Testing01\\snaps\\pic.png");
		  FileHandler.copy(source, sourceFile);
		    driver.navigate().refresh();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    Actions sasi = new Actions(driver);
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[1]/div/a[1]"))).build().perform();//mobile
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[1]/div/a[1]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[1]/div/a[2]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[1]/div/a[2]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[1]/div/a[3]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[1]/div/a[3]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[1]/div/a[4]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[1]/div/a[4]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[2]/div/a[1]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[2]/div/a[1]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[2]/div/a[2]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[2]/div/a[2]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[2]/div/a[3]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[2]/div/a[3]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[2]/div/a[4]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[2]/div/a[4]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    Thread.sleep(3000);
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[2]/div/a[5]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[2]/div/a[5]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    Thread.sleep(3000);
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[3]/div/a[1]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[3]/div/a[1]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[3]/div/a[2]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[3]/div/a[2]")).click();
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[3]/div/a[3]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[3]/div/a[3]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]")).click();
		    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[3]/div/a[4]"))).build().perform();
		    driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[4]/div/div/div/div[3]/div/a[4]")).click();
		  //  driver.quit();
		    
		    
		    
		    
		    
		    
			 
		
	
		
		
	    
	    }}

























































































































































































































		
		
		
	
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


