package verificationpoints;

import org.openqa.selenium.WebDriver;

public class LoginVerificationPoint {
	private WebDriver driver;
	
	 public LoginVerificationPoint (WebDriver driver) {
		 this.driver = driver;
	
	 }
	 
	 public void checkHelloMessage() {
		 final String expectedMessage = "Hi demo";
		 
		 if(this.driver.getPageSource().contains(expectedMessage));

		 
//		 if(this.driver.gerPageSource().contains("Hi demo")){
//			System out.println("Encontrou");
//		} else {
//			System.out.println("Não encontrou");
//		}
		 

	 }
	
}

//https://github.com/thvieira/treinamento-selenium