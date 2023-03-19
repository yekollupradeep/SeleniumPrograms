package section;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalucutorTest2 {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
	driver.get("https://emicalculator.net");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("loaninterest"))));
	driver.findElement(By.id("loaninterest")).clear();
	driver.findElement(By.id("loaninterest")).sendKeys("75,00,000");
//	Thread.sleep(2000);
//	driver.findElement(By.id("loanterm")).clear();
//	Thread.sleep(2000);
	//driver.findElement(By.id("loaninterest")).sendKeys("12.5");
	
	
}
}
