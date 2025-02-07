package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUserLink")
    public WebElement btnLogin;

    @FindBy(css = ".closeBtn")
    public WebElement btnFechar;

    @FindBy(css = ".PopUp")
    public WebElement divFecharModal;

    @FindBy(css = "*[name='username']")
    public WebElement inpUsarname;

    @FindBy(css = "*[name='password']")
    public WebElement inpPassword;

    @FindBy(css = "#sign_in_btn")
    public WebElement btnSignIn;

    @FindBy(css = "*[name='remember_me']")
    public WebElement inpRemenber;

    @FindBy (linkText = "CREATE NEW ACCOUNT")
    public WebElement linkCreateAccount;

    @FindBy (css = ".loader")
    public WebElement divLoader;
}
