package arrays;

import java.util.Random;

public class Array_01_01 {
    
    static long NUMBER_OF_TESTS = 1000000L;
    
    
    static boolean equalsMitWhile(int[] a, int[] b) {
        int i = 0;
        while ( i < a.length ) {
            if (a[i] != b[i])
                return false;            
            i++;
        }
        return true;
    }
    
    static int[] createArray(int min, int max, int laenge){
        Random zufall = new Random();
        int[] integerArray = new int[laenge];
        for ( int i = 0 ; i < laenge ; i++ ) {
            integerArray[i] = zufall.nextInt(max - min + 1) + min; 
        }
        return integerArray;       
    }
    
    static boolean equalsMitFor(int[] a, int[] b) {
        for (int i = 0; i < a.length ; i++) {
            if (a[i] != b[i])
                return false;
        }       
        return true;
    }
    
    public static void main ( String[] args ) {
        int[] array1 = new int[] {3,4,5,4,5,67,2,34,234,12,1,1,23,12,3,1,4,4,5,1,234};
        int[] array2 = new int[] {3,4,5,4,5,67,2,34,234,12,1,1,23,12,3,1,4,4,5,1,234};
        
        long zeit1 = System.currentTimeMillis();
        for (long i = 0; i < NUMBER_OF_TESTS ; i++){
            equalsMitWhile(array1, array2);
        }
        long zeit2 = System.currentTimeMillis();
        System.out.println("Dauer der While-Schleife: " + (zeit2 - zeit1) + " ms");
        System.out.println("Durchschnittliche Zeit einer While-Schleife: " + ((double)(zeit2 - zeit1)/NUMBER_OF_TESTS));
        
        Array_01_01 obj1 = new Array_01_01();
        Array_01_01 obj2 = new Array_01_01();
        
        zeit1 = System.currentTimeMillis();
        for (long i = 0; i < NUMBER_OF_TESTS ; i++){
            equalsMitFor(array1, array2);
        }
        zeit2 = System.currentTimeMillis();
        System.out.println("Dauer der For-Schleife: " + (zeit2 - zeit1) + " ms");
        System.out.println("Durchschnittliche Zeit einer For-Schleife: " + ((double)(zeit2 - zeit1)/NUMBER_OF_TESTS));
        //System.out.println(equalsMitWhile(array1, array2));
        //System.out.println(equalsMitFor(array1, array2));
    }        
}

