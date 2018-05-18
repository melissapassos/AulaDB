package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cadastroappobject {
	private WebDriver driver;

	public Cadastroappobject(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebElement getNomeCompletoTextField() {
		return this.driver.findElement(By.id("nome"));
	}
	
	public WebElement getEmailTextField() {
		return this.driver.findElement(By.id("email"));
	}
	
	public WebElement getSenhaTextField() {
		return this.driver.findElement(By.id("password"));
	}
	
	public WebElement getConfirmaSenhaTextField() {
		return this.driver.findElement(By.id("passconf"));
	}
	
	public WebElement getTelefoneTextField() {
		return this.driver.findElement(By.id("telefone"));
	}
	
	public WebElement getCidadeCombobox() {
		return this.driver.findElement(By.id("cidade"));
	}
	
	public WebElement getCadastrarButton() {
		//return this.driver.findElement(By.ByClassName("btn btn sucess"));
		//return this.driver.findElement(By.cssSelector("#cadastrar > fieldset > div:nth-child(8) > div > input"));
		return this.driver.findElement(By.xpath("//*[@id=\"cadastrar\"]/fieldset/div[8]/div/input"));
	}
}
