/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabenvonpatrin;

/**
 *
 * @author Victor
 */
public class ifelseAmpel {
    
    public static void main(String[] args) {
        
        String farbe = javax.swing.JOptionPane.showInputDialog( "Welche Farbe hat die Ampel?" );
        //String farbe = "Rot";

                
        if ( farbe.equals("Rot") )
            System.out.println("Bitte warten");
        else
        if ( farbe.equals("Gelb") )
            System.out.println("Es geht gleich los");
        else
        if ( farbe.equals("Gruen") )
            System.out.println("Freie fahrt");
        else
            System.out.println("Wait forever!");
        
    }
    
}
