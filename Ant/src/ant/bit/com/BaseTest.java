package ant.bit.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	

	WebDriver dr;
	public void openBrowser() throws InterruptedException {
		dr=new ChromeDriver();
		Thread.sleep(5000);
		dr.get("https://www.target.com/cart");
		dr.manage().window().setSize(new Dimension(1350,900));
		Thread.sleep(5000);
		dr.findElement(By.cssSelector("#search")).sendKeys("BedSheet",Keys.ENTER);
		Thread.sleep(7000);
		dr.findElement(By.xpath("//div[@title=\"Silvon Cotton Bed Sheet for Acne Prone Skin - Twin - Gray\"]/a")).click();
        Thread.sleep(8000);
        dr.findElement(By.xpath("/html/body/div[1]/div[2]/div/main/div/div[1]/div[2]/div[2]/div/div[3]/div/div/div[2]/div/button")).click();	
        Thread.sleep(10000);
        dr.findElement(By.xpath("/html/body/div[35]/div/div/div[2]/div[3]/button")).click();
        Thread.sleep(11000);
        
	
	
	}
	}
