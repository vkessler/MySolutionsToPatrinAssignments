package Vererbung;

public class TestKFZ {
    
    public static void main(String[] args) {
        
        LKW lkw1 = new LKW(2005, "MAN", "TLG");
        System.out.println(lkw1.hersteller);
        
        PKW pkw1 = new PKW(2012, "Tesla", "Model S");
        System.out.println(pkw1.hersteller);
        
        PKW pkw2 = new PKW(2015, "Tesla", "Model X");
        System.out.println(pkw2);
        System.out.println(lkw1);
        
        
    }

}
