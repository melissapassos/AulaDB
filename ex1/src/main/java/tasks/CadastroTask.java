package tasks;

import org.openqa.selenium.WebDriver;

import appobject.Cadastroappobject;

public class CadastroTask {
	
	private Cadastroappobject cadastroappobject;
	
	public CadastroTask(WebDriver driver) {
		this.cadastroappobject = new Cadastroappobject(driver);
	}	
	
	public void PreencherCadastro(String nome, String email, String senha, String confirmasenha, String telefone, String cidade) {
	this.cadastroappobject.getNomeCompletoTextField().sendKeys(nome);
	this.cadastroappobject.getEmailTextField().sendKeys(email);
	this.cadastroappobject.getSenhaTextField().sendKeys(senha);
	this.cadastroappobject.getConfirmaSenhaTextField().sendKeys(senha);
	this.cadastroappobject.getTelefoneTextField().sendKeys(telefone);
	//this.Cadastroappobject.getCidadeTextField().sendKeys(nome);
	}
	
	public void EnviarFormulario() {
		this.cadastroappobject.getCadastrarButton().submit();
	}
}
