package br.com.chronosacademy.core;

import br.com.chronosacademy.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public Driver(Browser navegador) {

        switch (navegador) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public static void visibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void invibisilityOf(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void atributeChange(WebElement element, String atribute, String value){
        wait.until(ExpectedConditions.attributeContains(element, atribute, value));
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
