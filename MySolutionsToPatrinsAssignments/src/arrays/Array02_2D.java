package arrays;
import java.util.Arrays;
public class Array02_2D {
    
    //Methode um 2D-Arrays zu erzeugen
    static int[][] createArray(int zeile, int spalte){
        int[][] array2D = new int[zeile][spalte];
        return array2D;
    }
    //Überladenes Array
    static int[][] createArray(int zeile, int spalte, int wert){
        int[][] array2D = createArray(zeile,spalte);// new int[zeile][spalte];
        for ( int zei = 0 ; zei < array2D.length ; zei++) {
            for ( int spal = 0 ; spal < array2D[zei].length ; spal++) {
                array2D[zei][spal] = wert;
            }
        }
        return array2D;
    }
    
    //Methode um 2D-Arrays auszugeben
    static void printArray(int[][] ausgabeArray){
        for (int zeile = 0 ; zeile < ausgabeArray.length ; zeile++ ) {
            for (int spalte = 0 ; spalte < ausgabeArray[zeile].length ; spalte++) {
                if ( spalte != ausgabeArray[zeile].length - 1 )
                    System.out.print(ausgabeArray[zeile][spalte] + ", ");
                else 
                    System.out.print(ausgabeArray[zeile][spalte]);
            }
            System.out.println();   
        }
    }

    public static void main(String[] args) {
        
        int[][] array1 = createArray(4,5);
        //Array ausgeben mit Arrays.deepToString()
        //System.out.println(Arrays.deepToString(array1));
        //Array ausgeben mit Methode "printArray"
        printArray(array1);
        System.out.println("");
        
        int[][] array2 = createArray(4,5);
        array2[1][1] = 5;
        printArray(array2);
        System.out.println("");
        
        int[][] array3 = createArray(4,5);
        for ( int zeile = 0 ; zeile < array3.length ; zeile++) {
            for ( int spalte = 0 ; spalte < array3[zeile].length ; spalte++) {
                array3[zeile][spalte] = 2;
            }
        }
        printArray(array3);
        System.out.println("");
        
        int[][] array4 = createArray(24,15,35);
        printArray(array4);
             
    }
}
