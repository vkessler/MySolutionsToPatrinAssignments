package arrays;

public class Array2D_03 {
    
        //Methode um 2D-Arrays auszugeben
    static void printArray(char[][] ausgabeArray){
        for (int zeile = 0 ; zeile < ausgabeArray.length ; zeile++ ) {
            for (int spalte = 0 ; spalte < ausgabeArray[zeile].length ; spalte++) {
                //if ( spalte != ausgabeArray[zeile].length - 1 )
                    System.out.print(ausgabeArray[zeile][spalte] + " " );
                //else 
                //    System.out.print(ausgabeArray[zeile][spalte]);
            }
            System.out.println();   
        }
    }
    
    static char[][] createBorderedArray(int dim, char x) {
        
        char[][] lustigeArray = new char[dim][dim];
        for ( int zeile = 0 ; zeile < dim ; zeile++) {
            for ( int spalte = 0 ; spalte < dim ; spalte++ ) {
                if (zeile == 0 || zeile == dim - 1 || spalte == 0 || spalte == dim - 1 )
                    lustigeArray[zeile][spalte] = x;
                else lustigeArray[zeile][spalte]=' ';
                }
            
        }
        return lustigeArray;
    }
    
    public static void main(String[] args) {
        
        
        printArray(createBorderedArray(9,'9'));
        
    }
    
}
