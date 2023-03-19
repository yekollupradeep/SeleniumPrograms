package section;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iphone {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.xpath("//div[contains(text(),\"APPLE iPhone\")]"));
		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}
		
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(WebElement price:prices) {
			System.out.println(price.getText());
		}
	}

}
