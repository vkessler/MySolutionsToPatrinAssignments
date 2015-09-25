/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabenvonpatrin;

/**
 *
 * @author vkessler
 */
public class Spielerei {
    public static void main(String[] args) {
        
        int hoehe = 4;
        int breite = 5;

        
        for ( int i = 1 ; i <= hoehe  ; i++) {
            if ( i == 1)
                for ( int j = 1 ; j <= breite ; j++) {
                System.out.print("*");
                }
            else if ( i == hoehe)
                for ( int jj = 1 ; jj <= breite ; jj++) {
                System.out.print("*");
                }
            else 
                for ( int jjj = 1 ; jjj <= breite ; jjj++) {
                    if (jjj == 1)
                        System.out.print("*");
                    else if (jjj == breite)
                        System.out.print("*");
                    else
                        System.out.print(" ");                                          
                }
                
            System.out.println("");            
        } 
        
    }
    
}
