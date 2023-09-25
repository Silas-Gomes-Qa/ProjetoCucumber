package page;

import org.openqa.selenium.By;

import metodos.MetodosDeTestes;

public class HomePage {

	MetodosDeTestes metodos = new MetodosDeTestes();

	By username = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");
	String urlLogado = "https://www.saucedemo.com/inventory.html";
	By msgError = By.xpath("//h3[@data-test='error']");

	public void login(String usuario, String senha, String nomeDoTeste) {
		metodos.escrever(username, usuario, "Informar usuário para login");
		metodos.escrever(password, senha, "Informar senha para login");
		metodos.clicar(btnLogin, "clicar no botão para login");
		metodos.capturarTela("Login", nomeDoTeste);

	}
	
	public void preencherUsuario(String usuario) {
		metodos.escrever(username, usuario, "Informar usuario para login");
		
	}
	public void preencherSenhaEClicar(String senha) {
		metodos.escrever(password, senha, "Informar senha para login");
		metodos.clicar(btnLogin, "clicando no botão login");
		
	}

	public void validarLogin() {
		metodos.validarUrl(urlLogado);
	}

	public void validarResposta(String msgEsperada) {
		if (msgEsperada.equals(urlLogado)) {
			metodos.validarUrl(msgEsperada);

		} else {
			metodos.validarTexto(msgError, msgEsperada);
		}
	
	}
}
