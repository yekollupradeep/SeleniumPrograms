package section;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalcutaorTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://emicalculator.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fromElement = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']/parent::div[@id='loanamountslider']"));
		WebElement toElement = driver.findElement(By.xpath("//span[text()='75L']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(fromElement, toElement).perform();
		
		WebElement intrestFrom = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']/parent::div[@id='loaninterestslider']"));
	    WebElement intrestTo = driver.findElement(By.xpath("//span[text()='12.5']"));
	    act.dragAndDrop(intrestFrom, intrestTo).perform();
	    
	    WebElement tenureFrom = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']/parent::div[@id='loantermslider']"));
	    WebElement tenureTo = driver.findElement(By.xpath("//span[text()='15']/ancestor::div[@id='loantermsteps']"));
	    act.dragAndDrop(tenureFrom, tenureTo).perform();
	    
	    
	
	}
}


