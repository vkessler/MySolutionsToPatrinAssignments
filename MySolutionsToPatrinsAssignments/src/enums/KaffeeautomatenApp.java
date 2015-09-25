/*
Aufgabe "Enums / Kaffeeautomat"

Erstellen Sie eine Konsolenanwendung, die einen Kaffeeautomaten simuliert. 
Folgende Bedingungen müssen erfüllt werden:

1.  Der Kaffeeautomat (KA) kann folgende Kaffeesorten verkaufen: 
    KAFFEE (1 Euro). CAPPUCCINO (1,20 Euro), ESPRESSO (1,13 Euro). 
Benutzen Sie Enums um diese Sorten zu definieren.

2.  Verwenden Sie die Klasse "java.util.Scanner", um die Kommunikation zw. dem 
Benutzer und KA zu implementieren. Folgende Schritte der Kommunikation sollen 
definiert werden:
    a.  Die Preisliste wird auf dem Bildschirm angezeigt.
    b.  Der Benutzer kann die gewünschte Sorte auswählen.
    c.  Danach wird der Benutzer aufgefordert das Geld einzuwerfen. 
        Der Benutzer darf nur gültige Münzen einwerfen (1 Cent, 2 Cent … 2 Euro). 
        Verwenden Sie Enums, um die Münzentypen zu definieren.
    d.  Der Benutzer wirft das Geld ein bis die notwendige (oder größere) Summe 
        eingesammelt wurde.
    e.  Das Getränk wird ausgegeben.
    f.  Das Rückgeld (falls nötig) wird in den gültigen Münzen ausgegeben.

3.  Alle Vorgänge sollen mit der entsprechenden Ausgabe auf dem Bildschirm 
sichtbar gemacht werden.
*/

package enums;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;

enum KA { 
    KAFFEE (100, "Cent"), 
    CAPUCCINO (120, "Cent") , 
    ESPRESSO (113, "Cent");

    private final int preis;
    private final String waehrung;

    KA (int preis, String waehrung) {
        this.preis = preis;
        this.waehrung = waehrung;
    }
    
    public int getPrice() {
        return preis;
    }
    
    public String getWaehrung() {
        return waehrung;
    }
    
    DecimalFormat df = new DecimalFormat("#0.00"); 
    
    @Override
    public String toString() {
        return ordinal() + " " + name() + " " +  (df.format((double) preis/100 )) + " Euro" ;
    }
    
};

enum Muenzen { 
    M1 (1, "Cent"), 
    M2 (2, "Cent"), 
    M3 (5, "Cent"), 
    M4 (10, "Cent"), 
    M5 (20, "Cent"), 
    M6 (50, "Cent"), 
    M7 (100, "Cent"), 
    M8 (200, "Cent");
    
    private final int muenzWert;
    private final String muenzEinheit;
    
    int count1;
    
    
    Muenzen (int muenzWert, String muenzEinheit) {
        this.muenzWert = muenzWert;
        this.muenzEinheit = muenzEinheit;
    }
    
    public int getMuenzWert () {
        return muenzWert;
    }
  
    public static Muenzen getMuenze(int muenzWert) {
        for(Muenzen p : Muenzen.values()) {
            if(p.getMuenzWert() == muenzWert) {
                return p;
            }
        }
        System.out.println("Münze wird nicht akzeptiert!");
        return null;
    }    
    
}

public class KaffeeautomatenApp {
    
    public static void main(String[] args) throws ParseException {
    
        KA[] kaffeeSorten = KA.values();
        System.out.println("Hallo! \nFolgende Kaffeesorten stehen zur Auswahl:");
        for (KA n : kaffeeSorten) {
            System.out.println(n);
        }
        
        DecimalFormat df = new DecimalFormat("#0.00");        
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Welche Sorte möchten Sie wählen? Geben Sie bitte die Sortennummer ein!");
        int input;
        KA kaffee = null;
        do {
            input = sc1.nextInt();
            if (input < kaffeeSorten.length && input >= 0 ) {
                kaffee = kaffeeSorten[input];
            } 
            else {
                System.out.println("Keine gültige Eingabe! Bitte erneut eingeben: ");
            }     
                 //   break;  
        } while (input >= kaffeeSorten.length || input < 0 );
        
        System.out.println("Sie haben " + kaffee.name() + " gewählt. \nBitte geben Sie " + 
                (df.format((double)kaffee.getPrice()/100)) + " Euro ein. Danke!" );
        
        Scanner sc2 = new Scanner(System.in);
        int guthaben = 0;
        int preis = kaffee.getPrice();
        
        while ( preis > guthaben ) {
            double eingabe1 = sc2.nextDouble();
            int eingabe2 = (int) (eingabe1 * 100);
            Muenzen coin = Muenzen.getMuenze(eingabe2);
            guthaben += coin.getMuenzWert();
            if (preis > guthaben) 
            System.out.println("Bitte noch " + df.format((double)(preis - guthaben) / 100) + " Euro eingeben." );
        }  

        int restgeld = Math.abs(preis - guthaben);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Danke! Bitte entnehmen Sie ihr Getränk (\"true\" oder \"false\" eingeben).");
        boolean take = sc3.nextBoolean();

        while( take == false ) {
        	System.out.println("Sie haben Ihr Getränk nicht entnommen!");
            System.out.println("Bitte entnehmen Sie ihr Getränk "
            		+ "(\"true\" oder \"false\" eingeben).");
            take = sc3.nextBoolean();
        } ;
        System.out.println(restgeld);
        Muenzen[] muenzArr = Muenzen.values();
        if (restgeld > 0 ) {
            System.out.println("Vielen Dank! Sie bekommen noch " + df.format((double) restgeld / 100) + 
                " Euro. Bitte entnehmen Sie Ihr Restgeld.");
            for (int n = muenzArr.length - 1 ; n >= 0 ; n--) {
            	muenzArr[n].count1 = restgeld / muenzArr[n].getMuenzWert();
            	restgeld %= muenzArr[n].getMuenzWert();
            }
            for (Muenzen n : Muenzen.values()){
            	System.out.println(n.count1 + " mal\t" + df.format((double) n.getMuenzWert() / 100) + " Euro"  );
            }
        }   
        else {
            System.out.println("Vielen Dank! Haben Sie noch einen schönen Tag.");
        }

    }//end of main
}
