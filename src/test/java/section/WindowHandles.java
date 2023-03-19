package section;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement gift = driver.findElement(By.linkText("Gift Cards"));
		Actions act = new Actions(driver);
		act.moveToElement(gift).perform();
		act.contextClick(gift).perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String parent="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	String child="Wedding Gifts For Couples: Buy Wedding Gifts For Couples online at best prices in India - Amazon.in";

		
		Set<String> handles = driver.getWindowHandles();
		for(String single:handles) {
			if(!parent.equals(driver.switchTo().window(single).getTitle())) {
				driver.close();
			}
			else {
				driver.switchTo().window(single);
			}
		}
	}

}
