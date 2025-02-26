package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto test = new Prodotto();
        test.codice = 1;
        test.nome = "Test";
        test.descrizione = "Test description";
        test.prezzoBase = 10.0;
        test.iva = 22;

        System.out.println(test.getFullName());
        System.out.println(test.getPrezzoIvato());
    }
}
