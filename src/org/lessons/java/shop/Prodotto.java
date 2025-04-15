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
        this.codice = random.nextInt(9999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzoBase = prezzoBase;
        this.iva = iva;
    }

    public double getPrezzoBase() {
        return this.prezzoBase;
    }

    public double getPrezzoIvato() {
        if (this.prezzoBase <= 0) {
            return 0;
        } else if (this.iva <= 0) {
            return this.prezzoBase;
        } else {
            return this.prezzoBase + (this.prezzoBase * this.iva / 100);
        }
    }

    public String getFullName() {
        return this.codice + "-" + this.nome;
    }
}
