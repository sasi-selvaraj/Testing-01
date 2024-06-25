
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class varya {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("Webdrive.chrome.driver","C:\\Users\\SwaminathaN\\eclipse-workspace\\Testing01\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://norinco.stagingzar.com/login");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Admin@123");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[4]/button")).click();//stop
	    driver.findElement(By.xpath("//*[@id=\"layout-menu\"]/ul/li[2]/a/div")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[1]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("sasi");
	    driver.findElement(By.id("last_name")).sendKeys("selvaraj");
	    driver.findElement(By.id("designation")).sendKeys("nothing");
		WebElement dropdownElement = driver.findElement(By.id("department"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Electronics");
        driver.findElement(By.id("email")).sendKeys("sasi@123gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("1234567890");
        driver.findElement(By.id("employee_id")).sendKeys("111220");
        WebElement dropdownElement1 = driver.findElement(By.id("user_type"));
        Select dropdown1= new Select(dropdownElement1);
        dropdown1.selectByVisibleText("Engineer");
        WebElement dropdownElement2 = driver.findElement(By.id("gender"));
        Select dropdown2= new Select(dropdownElement2);
        dropdown2.selectByVisibleText("Female");
        driver.findElement(By.id("address")).sendKeys("Nothing");
        TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File sourceFile = new File("C:\\Users\\SwaminathaN\\eclipse-workspace\\Testing01\\snaps\\pic2.png");
		FileHandler.copy(source, sourceFile);
        driver.findElement(By.id("submit")).click();
	    driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[2]/a/div/img")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[2]/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"profileForm\"]/div[1]/div/div/label/span")).click();
		String filepath ="C:\\Users\\SwaminathaN\\Downloads\\download (5).jpg";
		StringSelection selection = new StringSelection (filepath);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null); 
	    Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
		
		
	    
		
        
        
        
    }

	    
	    
	   
}

