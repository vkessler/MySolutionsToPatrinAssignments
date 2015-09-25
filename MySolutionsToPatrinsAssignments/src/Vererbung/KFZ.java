package Vererbung;

public class KFZ {
    
    int baujahr;
    String hersteller;
    String modell;
    

    
    //KFZ(int baujahr, String hersteller){};
    
    @Override
    public String toString() {
        return hersteller + modell + baujahr;
    }
    
    
    

}
