package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto test = new Prodotto("Test", "Test descrizione", 10.0, 22);

        System.out.println("Il nome completo del prodotto è: " + test.getFullName());
        System.out.println("Il prezzo base è: " + test.getPrezzoBase());
        System.out.println("Il prezzo comprensivo di iva è: " + test.getPrezzoIvato());
    }
}
