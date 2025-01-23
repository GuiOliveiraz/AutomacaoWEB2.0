package br.com.chronosacademy.steps;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.enums.Browser;
import br.com.chronosacademy.pages.YoutubePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

public class YoutubeSteps {
    YoutubePage youtubePage;

    @Before
    public void iniciarnavegador() {
        new Driver(Browser.CHROME);
    }

    @After
    public void fecharnavegador() {
        Driver.getDriver().quit();
    }

    @Dado("que eu esteja no youtube")
    public void queEuEstejaNoYoutube() throws InterruptedException {
        Driver.getDriver().get("https://www.youtube.com/");
        youtubePage = new YoutubePage();
        Thread.sleep(3000);
    }

    @E("insira {string}")
    public void insira(String pesquisa) {
        youtubePage.setInpPesquisa(pesquisa);
        youtubePage.clickbtnPesquisa();
    }

    @Entao("Clique em algum video no resultado de pesquisa")
    public void cliqueEmAlgumVideoNoResultadoDePesquisa() throws InterruptedException {
        Thread.sleep(3000);
        youtubePage.clickVideo();
    }

    @E("imprima o titulo do video e o numero de vizualizacoes")
    public void imprimaOTituloDoVideoEONumeroDeVizualizacoes() {
        YoutubePage youtubeMap = new YoutubePage();
        Assert.assertEquals("Docker Tutorial for Beginners - A Full DevOps Course on How to Run Applications in Containers", youtubeMap.getTextNewAccount());

    }
}
