package DemoTestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoZohoCRM {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("192.168.146.128:8080");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='image']")).click();
		
	}

}
