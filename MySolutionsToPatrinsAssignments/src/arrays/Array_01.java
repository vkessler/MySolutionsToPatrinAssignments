package arrays;
import java.util.Random;
import java.util.Arrays;

public class Array_01 {
    //Array erzeugen mit Methode createArray(min, max, länge)
    static int[] createArray(int min, int max, int laenge){
        Random zufall = new Random();
        int[] integerArray = new int[laenge];
        for ( int i = 0 ; i < laenge ; i++ ) {
            integerArray[i] = zufall.nextInt(max - min + 1) + min;
        }
        return integerArray;       
    }
    //Array ausgeben mit Methode printArray
    static void printArray(int[] array){
        // Warum funzt das nicht???? IndexOutOfBoundsException.
        for (int i : array)
        System.out.print(i);
        //Lösung 1:
        //for (int i = 0 ; i < array.length  ; i++){
        //    System.out.print(array[i] + " ");
        //}
        //Lösung 2:
        System.out.println("");
        System.out.println(Arrays.toString(array));
    }
    //Main-Methode aufrufen
    public static void main(String[] args) {
        //Array erzeugen
        int[] arr = createArray(50, 80, 20);
        //Array ausgeben
        printArray(arr); 
    }
}
