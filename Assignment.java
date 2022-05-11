package Alert;
  

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Assignment {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
		
			
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			
			driver.switchTo().alert().accept();
			String demo = driver.findElement(By.id("demo")).getText();
			
			
			if(demo.contains("You pressed OK!"))
			{
				System.out.println("The result of OK is as expected - Passed");
			}
				
			else
			{
				System.out.println("The result is not as expected - Failed");
			}
			
			
           driver.findElement(By.xpath("//button[text()='Try it']")).click();
			
			driver.switchTo().alert().dismiss();
			String demo1 = driver.findElement(By.id("demo")).getText();
			
			
			if(demo1.contains("You pressed Cancel!"))
			{
				System.out.println("The result of OK is as expected - Cancel");
			}
				
			else
			{
				System.out.println("The result is not as expected - Failed");
			}
			
			driver.close();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.close();
			}
}
		
	
	
	
	