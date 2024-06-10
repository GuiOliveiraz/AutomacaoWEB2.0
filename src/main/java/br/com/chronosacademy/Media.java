package br.com.chronosacademy;

public class Media {
    public String calculandoMedia(double v, double v1) {
        double media = (v + v1) / 2;
        String resultado;
        if (media < 5 ){
            resultado = "Reprovado";

        }else{
resultado = "Aprovado";
        }
        return resultado;
    }
}
