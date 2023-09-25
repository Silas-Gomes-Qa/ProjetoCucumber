package steps;

import io.cucumber.java.en.Given;
import page.HomePage;

	
public class SchemaTeste {
	
	HomePage page = new HomePage();

	@Given("informar o {string}")
	public void informar_o(String usuario) {
	 page.preencherUsuario(usuario);
	}

	@Given("informar a {string}")
	public void informar_a(String senha) {
		page.preencherSenhaEClicar(senha);
	}

	@Given("valido a {string}")
	public void valido_a(String mensagem) {
		page.validarResposta(mensagem);
	}
}
