package aufgabenvonpatrin;

import java.util.Random;

public class PrintFromTo {
    
    static void printFromto(int from, int to) {
 
        do {
            System.out.print(from + " ");
            from++;
        } while (from <= to);
        
    }
    
    static void sum(int a, int b) {
        
        System.out.print(a + b);
    }
    
    static void sumFromto(int x, int y) {
        int summe = 0;
        for (int i = x ; i <= y; i++) {
            summe = summe + i;
        }
        //return summe;
        System.out.print(summe);
    }
    
    static void zeichneRechteck(int b, int h){
        for ( int j = 1 ; j <= h  ; j++) {
            for ( int jj = 1 ; jj <= b ; jj++) {
                System.out.print("*");
            }
            System.out.println("");            
        } 
    }
    
    static void booleanRechteck(int breite, int hoehe, boolean fuellen) {
        if (fuellen == true)
        for ( int i = 1 ; i <= hoehe  ; i++) {
            for ( int j = 1 ; j <= breite ; j++) {
                System.out.print("*");
            }
            System.out.println("");            
        } 
        else
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
    
    static void printRandompatrin(int count, int min, int max){
        Random r = new Random();
        
        for (int i = 0; i < count; i++) {
            int value = r.nextInt(max);
            System.out.print(value + " ");
            
        }
        System.out.println();
    }
    
    static void printRandom(int N, int lower, int upper) {         

        for ( int i = 1 ; i <= N ; i++) {
            //int hjhj = int nextInt();
            double random = java.lang.Math.random();
            int randomint = (int) (random * 10);
            System.out.print(randomint);
        }
    }
    
    public static void main(String[] args) {
        
        printFromto(2,10);
        
        System.out.println("");
        
        sum(-3,4); // liefert nicht immer das richtige Ergebnis 
        
        System.out.println("");
        
        sumFromto(2,4);
                
        System.out.println();
        
        zeichneRechteck(2,2);
        
        System.out.println("");
        
        booleanRechteck(10,5,false);
        
        System.out.println("");
        
        printRandom(2,2,2);
        
        System.out.println("");
        
        
                
        
        
    }
    
}
