package enums;

enum Hunderasse { DACKEL(0.5), COLLIE(1.0), DOGE(1.5); 
    
    Hunderasse(double maxGroesse) {
        this.maxGroesse = maxGroesse;
    }

    private final double maxGroesse;
    
    public double getMaxGroesse() {
        return maxGroesse;
    }
    
    @Override
    public String toString() {
        String name = name().charAt(0) + name().substring(1).toLowerCase();
        return name + ", max. Größe: " + getMaxGroesse();
    }

}

public class HunderasseApplikation {
    
    public static void main(String[] args) {
        
//        Hunderasse r1 = Hunderasse.DACKEL;
//        Hunderasse r2 = Hunderasse.COLLIE;
//        Hunderasse r3 = Hunderasse.DOGE;
//        
//        System.out.println(r1);
        
        Hunderasse[] hundeArray = Hunderasse.values();
        
        for ( Hunderasse h : hundeArray) {
            System.out.println(h);
        }
        
    }

}
