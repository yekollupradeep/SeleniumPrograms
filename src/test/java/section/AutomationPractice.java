package section;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPractice {
	

	private static String us;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Pradeep");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("yekollu");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("abc@gmail.com");
	//	driver.findElement(By.xpath("//div[@class='selected-flag']/following-sibling::ul[@class='country-list dropup hide']/descendant::span[text()='United States']")).click();
//		List<WebElement> countries = driver.findElements(By.xpath("//ul[@class='country-list dropup hide']/child::li[@class='country preferred']"));
//		for(int i=1;i<=countries.size();i++) {
//			if(countries.get(i).getText().contains("United States")) {
//				countries.get(i).click();
//				break;
//		WebElement ele=driver.findElement(By.className("country preferred"));
//		Select s= new Select(ele);
//		s.selectByVisibleText(us);
//			}
//		}
		
		WebElement phone=driver.findElement(By.name("phonenumber"));
		phone.sendKeys("1234567890");
		
	}

}
