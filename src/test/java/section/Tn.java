package section;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tn {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeSelected(By.id("fromCity")));
		driver.findElement(By.xpath("//span[text()='From']")).sendKeys("hy");
		//driver.findElement(By.id("//label[@class='lbl_input makeFlex column latoBold']")).sendKeys("hyd");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list'][1]"));
		System.out.println(elements.size());
	}

}
