package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    // attributi
    int codice;
    String nome;
    String descrizione;
    double prezzoBase;
    int iva;

    // costruttore
    public Prodotto(String nome, String descrizione, double prezzoBase, int iva) {
        Random random = new Random();
        this.codice = random.nextInt(1000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzoBase = prezzoBase;
        this.iva = iva;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }

    public double getPrezzoIvato() {
        return prezzoBase + (prezzoBase * iva / 100);
    }

    public String getFullName() {
        return codice + "-" + nome;
    }
}
