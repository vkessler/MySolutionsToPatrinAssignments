package InnereKlassen;

class Gebaeude {
    
    private String strassenname, hausnummer;
    private int stockwerke, raeumeProStockwerk;
    private Stockwerk stockwerk;
    private Raum raum;

    
    Gebaeude (String strassenname, String hausnummer, int stockwerke, int raeumeProStockwerk) {
        this.strassenname = strassenname;
        this.hausnummer = hausnummer;
        this.stockwerke = stockwerke;
        this.raeumeProStockwerk = raeumeProStockwerk;
    }
    
    public void setStockwerke (int stockwerke) {
        if (stockwerke >= 1)
            this.stockwerke = stockwerke;
    }
    
    public int getStockwerke () {
        return stockwerke;
    }
    
    public void setRaeumeProStockwerk(int raeumeProStockwerk) {
        if (raeumeProStockwerk >= 1)
            this.raeumeProStockwerk = raeumeProStockwerk;
    }
    
    public int getRaeumeProStockwerk () {
        return raeumeProStockwerk;
    }
    
    public String getRaum(int stockwerkNr, int raumNr) {
        return 
    }
    
   /*****************Innere Klassen*******************/
    
    class Stockwerk {
        
    }//end of Stockwerk
    
    class Raum {
        
    }//end of Raum
    
   /*************Ende Innere Klassen******************/
    
}//end of Gebaeude

public class GebaeudeAufgabe {
    
    public static void main(String[] args) {
        
        Gebaeude g1 = new Gebaeude("Hauptstr.", "45", 3, 10);
        
    }
}//end of main
