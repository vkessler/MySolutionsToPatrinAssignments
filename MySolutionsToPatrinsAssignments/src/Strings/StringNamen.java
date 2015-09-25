package Strings;

import java.util.Random;

public class StringNamen {
    
    public static String generiereName(String[] array, int anzahl) {
        Random rand = new Random();
        int i = 0;
        String neuerName ="";
        while ( i < anzahl) {
            int zufallsZahl = rand.nextInt(array.length);
            neuerName += array[zufallsZahl];
            i++;
        }
        return neuerName; 
    }
   
    public static void main(String[] args) {
        //String-Array mit 12 Silben erzeugen
        String[] arrayMitSilben = {"to","um","po","so","ki","la","ca","be","den","mu","se","schi"};
        //50 Namen generieren und ausgeben
        for (int k = 0 ; k < 50 ; k++) {
            System.out.println("Name " + k + ": " + generiereName(arrayMitSilben, 3));
        }
    }   
}
