package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;
import runner.Executa;

public class LoginTeste {

	HomePage page = new HomePage();

	String msgLoginBranco = "Epic sadface: Username is required";
	String msgSenhaBranco = "Epic sadface: Password is required";
	String msgUsuarioBloq = "Epic sadface: Sorry, this user has been locked out.";

	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();
	}

	@Given("que esteja na tela login")
	public void que_esteja_na_tela_login() {
	    Executa.abrirNavegador();
	}

	@When("enviar os dados de login validos")
	public void enviar_os_dados_de_login_validos() {
		page.login("standard_user", "secret_sauce", "Login Sucesso");
	}

	@Then("valido login realizado com sucesso")
	public void valido_login_realizado_com_sucesso() {
		page.validarLogin(); 
	}

	@Given("enviar os dados de login com usuario em branco")
	public void enviar_os_dados_de_login_com_usuario_em_branco() {
		page.login("", "secret_sauce", "Campo usuário em branco");
	}

	@Given("valido mensagem de erro usuario em branco")
	public void valido_mensagem_de_erro_usuario_em_branco() {
		page.validarResposta(msgLoginBranco);
	}

	@Given("enviar os dados de login com senha em branco")
	public void enviar_os_dados_de_login_com_senha_em_branco() {
		page.login("standard_user", "", "Campo senha em branco");
	}

	@Given("valido mensagem de erro senha em branco")
	public void valido_mensagem_de_erro_senha_em_branco() {
		page.validarResposta(msgSenhaBranco);
	}

	@Given("enviar os dados de login usuario bloqueado")
	public void enviar_os_dados_de_login_usuario_bloqueado() {
		page.login("locked_out_user", "secret_sauce", "Login com usuário bloqueado");
	}

	@Given("valido mensagem de erro login bloqueado")
	public void valido_mensagem_de_erro_login_bloqueado() {
		page.validarResposta(msgUsuarioBloq);
	}

	@Given("enviar os dados de login com dados em branco")
	public void enviar_os_dados_de_login_com_dados_em_branco() {
		page.login("", "", "Login em branco");
	}

	@Given("valido mensagem de erro login em branco")
	public void valido_mensagem_de_erro_login_em_branco() {
		page.validarResposta(msgLoginBranco);
	}
}
