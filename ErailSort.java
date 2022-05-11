package classroom;

import java.awt.Dimension;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement checkBox1 = driver.findElement(By.id("chkSelectDateOnly"));
		checkBox1.click();
  
		//Uncheck the check box 
		boolean status = checkBox1.isSelected();
		System.out.println(status);
		
	
		
		//clear and type in the source station 
		
		driver.findElement(By.xpath("//input[@id=\'txtStationFrom']")).clear();
		
		//clear and type in the destination station
		
		driver.findElement(By.id("txtStationTo")).clear();
		
		
		//Find all the train names using xpath 
		

		
		//List<WebElement> objLinks = driver.findElements(By.xpath("//a[text()='GOLDEN TEMPLE M']"));
		
		//for(WebElement objCurrentLink : objLinks) {
		//	String strLinkText = objCurrentLink.getText();
			
		//	System.out.println(strLinkText);
			WebElement webTable =driver.findElement(By.tagName("table"));
			
			List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
			
					
			for (int i =0; i<tableRows.size();i++)
			{
				WebElement tableRow = tableRows.get(i);
				List<WebElement> allColumns = tableRow.findElements(By.tagName("td"));
				
				
					for (int j =0; j<allColumns.size();j++)
					{	
			String columnValue = allColumns.get(j).getText();
			System.out.println(columnValue);
				
				driver.close();
				
					}		
		
		}
		
	}
		
}

	
