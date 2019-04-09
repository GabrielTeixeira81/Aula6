package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("20", "Vira-lata", "Bidu");

        System.out.println("Esse cachorro é mamifero?" + cachorro.ehMamifero());

    }
}
