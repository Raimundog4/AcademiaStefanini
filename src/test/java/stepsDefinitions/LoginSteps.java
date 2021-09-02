package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.LoginPage;

public class LoginSteps {

	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.preencherCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.preencherCampoSenha(senha);
	}
	
	@Quando("clicar no botao Login")
	public void clicarNoBotaoLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.acionarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem de credenciais invalidas")
	public void oSistemaExibeAMensagemDeCredenciaisInvalidas() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.validarUsuarioInvalido();
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.validarDashboard();
	}

}
