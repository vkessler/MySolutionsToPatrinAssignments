package Interfaces;
import java.util.Arrays;
import java.util.Comparator;

class OS implements Comparable<OS>{
    private String  name;
    private int version;
    
    public OS(){
    }
    
    public OS(String name, int version) {
        if (name == null) {
            name = "?";
        }
        this.name = name;
        this.version = version;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setVersion(int version) {
        this.version = version;
    }
    
    public int getVersion() {
        return version;
    }
    
    @Override
    public String toString() {
        return name + " " + version;
    }
    
    @Override
    public int compareTo(OS os2){
        OS os1 = this;
        int erg = os1.name.compareTo(os2.name);
        if (erg == 0){
            erg = this.version - os2.getVersion();
        }
        return erg;
    }
    
    public static class OSversionComparator implements Comparator<OS> {
        @Override
        public int compare(OS os1, OS os2){
            return os1.version - os2.version;
        }
    }
}//end of OS

class OSComparator implements Comparator<OS> {
    @Override
    public int compare(OS os1, OS os2){
        return os2.compareTo(os1);
    }
}

public class OperationSystem {
    public static void main(String[] args) {
        
        OS[] osArray = {
            new OS("Windows", 10),
            new OS("Linux", 10),
            new OS("Solaris", 1),
            new OS("Windows", 8),
            new OS("Windows", 95),
            new OS("Linux", 3)
        };    
        
        Arrays.sort(osArray);
        for ( OS i : osArray) {
            System.out.println("Betriebssystem: " + i);
        }
        
        System.out.println("------------Reverse Sorting----------------");
        
        Comparator cmp = new OSComparator();
        Arrays.sort(osArray, cmp);
        for ( OS i : osArray) {
            System.out.println("Betriebssystem: " + i);
        } 
        
        System.out.println("--------Version Sorting Inner Class-----------");
        
        Comparator cmpVersion = new OS.OSversionComparator();
        
        Arrays.sort(osArray, cmpVersion);
        for ( OS i : osArray) {
            System.out.println("Betriebssystem: " + i);
        } 
        
    } // Ende der main-Methode
} // Operation System Class close
