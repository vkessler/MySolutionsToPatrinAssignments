package Vererbung;

public class LKW extends KFZ {
    // Konstruktor der Klasse LKW    
    public LKW(int baujahr, String hersteller, String modell) {
        this.baujahr = baujahr;
        this.hersteller = hersteller;
        this.modell = modell;
    }
//    public String getHersteller(){
//        return hersteller;
//    }
//    public String getModell(){
//        return modell;
//    }
//    public int getBaujahr(){
//        return baujahr;
//    }     
//    //toString()-Methode überschrieben
//    @Override
//    public String toString() {
//        return String.format("Hersteller: %s, Modell: %s, Baujahr: %d", getHersteller(), getModell(), getBaujahr());
//    }
}
