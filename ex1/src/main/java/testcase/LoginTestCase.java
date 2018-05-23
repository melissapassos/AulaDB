package testcase;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import verificationpoints.LoginVerificationPoint;


public class LoginTestCase {
	private WebDriver driver;
	private LoginVerificationPoint verificationPoint;
	
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://demo.virtuemart.net/");
		
		this.verificationPoint = new LoginVerificationPoint(driver);
		
	} 
		

	@Test
	public void testMain() {
			
		WebElement usernameTextField = this.driver.findElement(By.id("modlgn-username"));
		usernameTextField.sendKeys("demo"); //inserir palavra demo
		
		WebElement passwordTextField = this.driver.findElement(By.id("modlgn-passwd"));
		passwordTextField.sendKeys("demo"); //inserir palavra demo
		WebElement loginButton = this.driver.findElement(By.name("Submit"));
		loginButton.click();
		
		
		//loginButton.submit();//mesma ação que click()
		
		verificationPoint.checkHelloMessage();
	}

	//@After
	//public void tearDown() {
	//this.driver.quit();
	//}
}
