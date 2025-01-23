package br.com.chronosacademy.steps;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.enums.Browser;
import br.com.chronosacademy.pages.LoginPage;
import br.com.chronosacademy.pages.NewAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {
    LoginPage loginPage;

    @Before
    public void iniciarnavegador() {
        new Driver(Browser.CHROME);
    }

    @After
    public void fecharnavegador() {
        Driver.getDriver().quit();
    }

    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://advantageonlineshopping.com");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
        loginPage.visibilityOfBtnFechar();
        loginPage.aguardaLoader();
    }

    @Quando("for realizado um clique fira da modal")
    public void forRealizadoUmCliqueFiraDaModal() {
        loginPage.clickFecharModal();
    }

    @Entao("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() throws Exception {
        try {
            loginPage.invisibilityOfBtnFechar();
        } catch (Exception e) {
            throw new Exception("A janela modal nao foi fechada");
        }
    }

    @Quando("for realizado um clique no ícone de fechar")
    public void forRealizadoUmCliqueNoIconeDeFechar() {
        loginPage.clickBtnFechar();
    }

    @Quando("for realizado um clique no link create new account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
    }

    @Entao("a pagina new account deve ser exibida")
    public void aPaginaNewAccountDeveSerExibida() {
        NewAccountPage newAccountPage = new NewAccountPage();
        Assert.assertEquals("CREATE ACCOUNT", newAccountPage.getTextNewAccount());
    }

    @Quando("os campos de login forem preenchidos da seguinte forma")
    public void osCamposDeLoginForemPreenchidosDaSeguinteForma(Map<String, String> map) {
        String username = map.get("login");
        String password = map.get("password");
        boolean remember = Boolean.parseBoolean(map.get("remember"));
        if (username != null) {
            loginPage.setInpUserName(username);
        }
        if (password != null) {
            loginPage.setInpPassword(password);
        }

        if (remember) loginPage.clickInpRemember();
    }

    @Quando("for realizado um clique no botão sign in")
    public void forRealizadoUmCliqueNoBotaoSignIn() {
        loginPage.clickBtnSignIn();
    }

    @Entao("deve ser possível logar no sistema")
    public void deveSerPossivelLogarNoSistema() {

    }

    @Entao("o sistema deve exibir uma mensagem de erro")
    public void oSistemaDeveExibirUmaMensagemDeErro() {

    }

    @Entao("o botão sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);
    }


}
