package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci le dimensioni della base del rettangolo");
        int baseUtente = scanner.nextInt();

        System.out.println("Inserisci le dimensione dell'altezza del rettangolo");
        int altezzaUtente = scanner.nextInt();


       Rettangolo rettangolo = new Rettangolo(baseUtente,altezzaUtente);

        System.out.println("L'area del rettangolo è: " + rettangolo.area());
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.perimetro());


    }
}
