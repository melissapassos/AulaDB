package testcase;
import static org.junit.Assert.assertTrue;

import org.junit.After;
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
	private LoginVerificationPoint verificationpoint;
	
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://demo.virtuemart.net/");
		
		this.verificationpoint = new LoginVerificationPoint(driver);
		
	} 
		

	@Test
	public void testMain () {
			
		WebElement usernameTextField = this.driver.findElement(By.id("modlgn-username"));
		WebElement passwordTextField = this.driver.findElement(By.id("modlgn-passwd"));
		//WebElement loginButton = this.driver.findElement(By.id("Submit"));
		
		
		usernameTextField.sendKeys("demo"); //inserir palavra demo
		passwordTextField.sendKeys("demo"); //inserir palavra demo
		//loginButton.click();
		//loginButton.submit();//mesma ação que click()
		
		verificationpoint.checkHelloMessage();
	}

	//@After
	//public void tearDown() {
	//this.driver.quit();
	//}
}
