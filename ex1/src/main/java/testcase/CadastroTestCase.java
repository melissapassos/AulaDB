package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.CadastroTask;

public class CadastroTestCase {
	
	private WebDriver driver;
	private CadastroTask cadastro;
	
	@Before 
	public void setUp () {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.get("http://www.xiru.rs/d/trocas/homolog/usuarios/cadastrar");
		driver.manage().window().maximize();
		cadastro = new CadastroTask(driver);
	}
	
	@Test
	public void testMain() {
		cadastro.PreencherCadastro("Maria" , "teste@teste", "minhasenha", "minhasenha", "51985777081", "Porto Alegre");
		cadastro.EnviarFormulario();
	}
	
	//@After
	//public void tearDown() {
	//	this.driver.quit();
	//}
}
