package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "txtUsername")
	public WebElement campoUsuario;
	
	@FindBy(how = How.ID, using = "txtPassword")
	public WebElement campoSenha;
	
	@FindBy(how = How.ID, using = "btnLogin")
	public WebElement btnLogin;
	
	@FindBy (how = How.ID , using = "menu_dashboard_index")
	private WebElement dashboard;
	
	public void preencherCampoUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}
	
	public void preencherCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {
		btnLogin.click();
	}
	
	public void validarUsuarioInvalido() {
		WebElement validacaoElement = driver.findElement(By.xpath("//*[contains(text(), 'Invalid credentials')]"));
		assertTrue(validacaoElement.isDisplayed());
	}
	
	public void validarDashboard() {
		assertTrue(dashboard.isEnabled()); 
	}
}
