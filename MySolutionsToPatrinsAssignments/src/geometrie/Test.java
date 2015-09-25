package geometrie;

public class Test {
    
    public static void main(String[] args) {
        
        Kreis k1 = new Kreis();
        Rechteck r1 = new Rechteck();

        
        System.out.println(k1.getFlaeche(2));
        System.out.println("Fläche des Rechtecks: " + r1.getFlaeche(2,4));
        
    }

}
