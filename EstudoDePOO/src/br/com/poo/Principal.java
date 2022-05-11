package br.com.poo;

public class Principal {
    public static void main(String[] args) {
       Carro meuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.anoDeFabricacao = 2024;
        meuCarro.modelo = "Argo";
        meuCarro.cor = "Branco";

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Toyota";
        seuCarro.anoDeFabricacao = 2024;
        seuCarro.modelo = "Sw4";
        seuCarro.cor = " Preto";

        System.out.println("Meu carro");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoDeFabricacao);

        System.out.println("---------------------");

        System.out.println("Seu carro");
        System.out.println("Modelo: "+ seuCarro.modelo);
        System.out.printf("Ano: "+ seuCarro.anoDeFabricacao);

    }
}
