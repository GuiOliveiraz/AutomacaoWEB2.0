package br.com.chronosacademy;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MediaTest {
    @Test
     public void validarAprovado(){
        Media media = new Media();
        String resultado = media.calculandoMedia (5.0, 5.0);
        Assert.assertEquals("Aprovado", resultado);
    }

    @Test
    public void validarReprovado(){
        Media media = new Media();
        String resultado = media.calculandoMedia(4.9, 5.0);
        Assert.assertEquals("Reprovado", resultado);
    }

}