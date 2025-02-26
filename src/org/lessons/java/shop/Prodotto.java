package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    int codice;
    String nome;
    String descrizione;
    double prezzoBase;
    int iva;

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
