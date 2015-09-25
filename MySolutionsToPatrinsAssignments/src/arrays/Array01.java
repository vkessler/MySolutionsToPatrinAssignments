package arrays;
import java.util.Arrays;
import java.util.Random;
class Array {    
    void printArray(int u){
        System.out.println("Element ar[" + (u + 1) + "]: " + this.element);
                
    } 
    int element;
}

public class Array01 {
    
    public static void main ( String[] args) {
        
        Random rand = new Random();
        Array[] ar = new Array[20];
        for ( int i = 0 ; i < ar.length ; i++){
            ar[i] = new Array();
            ar[i].element = rand.nextInt(10) + 1;
            ar[i].printArray(i);
        }
        System.out.println("Länge des Arrays: " + ar.length);
        
        System.out.println(Arrays.toString(ar));
        
        String[] namen = new String[3];
 

       
        
        
    }
    
}

