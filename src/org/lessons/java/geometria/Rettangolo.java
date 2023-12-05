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
}
