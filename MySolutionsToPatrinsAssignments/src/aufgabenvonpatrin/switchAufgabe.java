/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AufgabenvonPatrin;

/**
 *
 * @author Victor
 */
public class switchAufgabe {
    
    public static void main(String[] args) {
     
        String farbe = javax.swing.JOptionPane.showInputDialog( "Welche Farbe hat die Ampel?" );
        
        switch ( farbe ) {
            
            case "Rot":
                System.out.println("Bitte warten");
                break;
            case "Gelb":
                System.out.println("Gleich geht es los");
                break;
            case "Gruen":
                System.out.println("Weg frei");
                break;
            default:
                //System.out.printf( "Die Farbe %s gibt es nicht! %n" , farbe);
                System.out.println("Fehler! Diese Farbe gibt es nicht.");
        }            
    }
}
