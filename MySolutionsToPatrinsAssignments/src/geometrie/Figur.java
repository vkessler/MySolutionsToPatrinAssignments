package geometrie;

public class Figur {
    
    private float hoehe, breite;
    private float radius;
    
    public void setFigur(float radius){
        if (radius >= 0)
        this.radius = radius;
    }
    
    public void setFigur(float hoehe, float breite){
        if (hoehe >= 0 && breite >= 0)
        this.hoehe = hoehe;
        this.breite = breite;
    }
    
    public double getFlaeche(float radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double getFlaeche(float hoehe, float breite) {
        return hoehe * breite;
    }

}
