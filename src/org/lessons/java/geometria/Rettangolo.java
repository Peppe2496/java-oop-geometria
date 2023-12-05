package org.lessons.java.geometria;

public class Rettangolo {

    int base;

    int altezza;


    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    int perimetro (){
        return 2*(base+altezza);
    }

    int area (){
        return base * altezza;
    }

    String disegna (){
        String nuovoDisegno = new String();
        for (int i = 1; i <= base; i++) {
            System.out.print("0");
        }
        System.out.println();
        for (int x = 1; x <= altezza - 2; x++) {
            System.out.print("0");
            for (int i = 1; i <= base - 2; i++) {
                System.out.print(" ");
            }
            System.out.println("0");
        }
        for (int i = 1; i <= base; i++) {
            System.out.print("0");
        }
        return nuovoDisegno;

    }
}
