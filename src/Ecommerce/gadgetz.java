package Ecommerce;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class gadgetz {
        public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("Webdrive.chrome.driver","C:\\Users\\SwaminathaN\\eclipse-workspace\\Testing01\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://gadgetz.stagingzar.com/");
		Thread.sleep(3000); driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[1]/ul/li[1]/a/span[1]")).click();//MOBILE
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scroll(0,5000)"); Thread.sleep(3000);
		  jse.executeScript("window.scroll(0,-7000)"); 
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[2]/a/span[1]")).click();//COMPUTER
		  jse.executeScript("window.scroll(0,5000)"); Thread.sleep(3000);
		  jse.executeScript("window.scroll(0,-7000)"); 
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[3]/a/span[1]")).click();//ELECTRONIC
		  jse.executeScript("window.scroll(0,5000)"); Thread.sleep(3000);
		  jse.executeScript("window.scroll(0,-7000)"); 
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[4]/a/span[1]")).click();//car
		  jse.executeScript("window.scroll(0,5000)"); 
		  Thread.sleep(3000);
		  jse.executeScript("window.scroll(0,-7000)"); 
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[5]/a/span[1]")).click();//smartHOME
		  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[2]/a")).click();//DEALS
		  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[3]/a")).click();//STORES
		  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[4]/a")).click();//new RELEASE
          driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[5]/a")).click();//used PRODUCT
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[5]/a")).click();//CONTACTS
		  Thread.sleep(3000);
		  driver.navigate().to("https://gadgetz.stagingzar.com"); //home
		  Thread.sleep(6000);
		  driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div/div/div/div/div[4]/ul/li[1]/div/ul/li/a")).click(); //login 
		  Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("sasiselvaraj1112@gmail.com");
		driver.findElement(By.id("review")).sendKeys("Yasar@12345");
		driver.findElement(By.xpath("//*[@id=\"myAccount\"]/div/form/div[3]/a")).click();
		Thread.sleep(3000);
	    Actions sasi = new Actions(driver);
	    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[2]/a/span[1]"))).build().perform();//mobile
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[2]/div/dl/dt[1]/a/span")).click();
	    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[1]/a/span[1]"))).build().perform();//computer
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[1]/div/dl/dt[1]/a/span")).click();
        sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[3]/a/span[1]"))).build().perform();// electronic
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[3]/div/dl/dt[1]/a/span")).click()	;  
	    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[4]/a/span[1]"))).build().perform();//car
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[4]/div/dl/dt[1]/a/span")).click();
	    sasi.moveToElement(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[5]/a"))).build().perform();//smart home
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div/ul/li[5]/div/dl/dt[1]/a/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[2]/div/div/div/div/div[3]/div/form/div/input")).sendKeys("Mobile");//search bar
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/section/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div/div[1]/div[1]")).click();//image
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/section[1]/div/div/div/div[3]/div[2]/div[2]/div/div[2]/a")).click();//add to cart
	    driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div/div/div/div/div[4]/ul/li[4]/div[1]/ul/li")).click();
        Thread.sleep(6000);
	    TakesScreenshot ts1=(TakesScreenshot) driver;
	    File source = ts1.getScreenshotAs(OutputType.FILE);
	    File sourceFile = new File("C:\\Users\\SwaminathaN\\eclipse-workspace\\Testing01\\snaps\\pic3.png");
	    FileHandler.copy(source, sourceFile);
	    driver.navigate().to("https://gadgetz.stagingzar.com/product-details/mobile-cover#");
	    driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div[3]/div/div/div/div/div/div[4]/ul/li[5]/div/ul/li")).click();
	    driver.navigate().to("https://gadgetz.stagingzar.com/");
	    
	 	    
	     
		
		
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
