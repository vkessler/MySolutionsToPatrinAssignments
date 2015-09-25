/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabenvonpatrin;

import java.util.Random;

class Rechteck {
    static void printRechteck(Rechteck r) {
        System.out.println("Rechteck: Breite: " + r.breite + " Höhe: " + r.hoehe );
    }

    void print(int u) {
        System.out.println("Rechteck Nr " + (u+1) + ": Breite: " + this.breite + " Höhe: " + this.hoehe + " Fläche: " + getFlaeche());        
    }
    
    int getFlaeche() {
        int a = breite * hoehe;
        return a;
    }

    int breite, hoehe;    
}

public class Rechtecke {   
    public static void main(String[] args) {
        
        Rechteck[] r = new Rechteck[100];
        Rechteck r1 = new Rechteck();
        for (int i = 0; i < 100; i++) {
            r[i] = new Rechteck();
        }
        r1.breite = 2;
        r1.hoehe = 3;
        Rechteck.printRechteck(r1);
        r[33].breite=5;
        
        Random rand = new Random();
        int ga = 0;
        Rechteck[] g = new Rechteck[100];
        for (int j = 0; j < 100; j++) {
            g[j] = new Rechteck();
            g[j].breite = rand.nextInt(20) + 1;
            g[j].hoehe = rand.nextInt(20) + 1;
            g[j].print(j);
            ga += g[j].getFlaeche();
        }
        System.out.println("Gesamtfläche: " + ga);
    }
}