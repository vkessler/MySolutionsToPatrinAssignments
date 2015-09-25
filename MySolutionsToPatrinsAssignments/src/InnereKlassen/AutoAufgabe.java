package InnereKlassen;

class Rennwagen {
    
    private String rennstall;
    private Fahrer f;
    private Motor m;
    
    public Rennwagen(){
    }
    
    public Rennwagen(String rennstall) {
        this.rennstall = rennstall;
        m = new Motor();
    }
    
    public void setFahrer(Fahrer f){
        this.f = f;
    }
    
    public Fahrer getFahrer() {
        return f;
    }
    
    public void setMotor(Motor m) {
        this.m = m;
    }
    
    public Motor getMotor() {
        return m;
    }

    @Override
    public String toString() {
        return "Rennwagen " + rennstall + ". Fahrer: " + f ;
    }    
    
    class Motor {
        
        private String motorenName;
        
        public Motor(){
        }
        
        public Motor(String motorenName){
            this.motorenName = motorenName;
        }
        
        public void setMotor(String motorenName){
            this.motorenName = motorenName;
        }
        
        public String getMotor() {
            return motorenName;
        }
        
        @Override
        public String toString() {
            return "Motor Type1 aus dem Rennwagen " + Rennwagen.this.rennstall;
        }
        
    }//end of Motor
    
   static class Fahrer {
       
        private String vorname, nachname;
        
        public Fahrer() {
        }
        
        public Fahrer(String vorname, String nachname) {
            this.vorname = vorname;
            this.nachname = nachname;
        }
        
        public void setFahrer(String vorname, String nachname){
            this.vorname = vorname;
            this.nachname = nachname;
        }
        
        public String getFahrer(){
            return vorname + " " + nachname;
        }
        
        @Override
        public String toString(){
            return vorname + " " + nachname;
        }
        
    }//end of Fahrer

   
   
}//end of Rennwagen

public class AutoAufgabe {
    
    public static void main(String[] args) {
 
        Rennwagen rw = new Rennwagen("Mercedes");

        Rennwagen.Fahrer f = new Rennwagen.Fahrer("M.", "Schumacher");
        rw.setFahrer(f);

        Rennwagen.Motor m = rw.getMotor();

        System.out.println(rw); 	//Zeile 1
        System.out.println(m);	//Zeile 2

    }
    
}
