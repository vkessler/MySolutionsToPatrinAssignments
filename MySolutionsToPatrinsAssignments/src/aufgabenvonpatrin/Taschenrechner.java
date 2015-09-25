package aufgabenvonpatrin;
import java.util.Scanner;
public class Taschenrechner {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        /*
        
        Lösungsvariante 1:
        
        System.out.println("Zahl 1 eingeben");
        int zahl1 = sc.nextInt();
        
        System.out.println("Operation eingeben (+ - / *):");
        char ch = sc.next().charAt(0);
        
        System.out.println("Zahl 2 eingeben:");
        int zahl2 = sc.nextInt();
       
        */ 
        
        System.out.println("Bitte einen Ausdruck eingeben! (z. B. 1 + 2)");
        
        int zahl1 = sc.nextInt();
        
        String eingabe = sc.next();
        char ch = eingabe.charAt(0);
        
        int zahl2 = sc.nextInt();
        
                
        int erg = 0;
        switch (ch) {
            case '+':
                erg = zahl1 + zahl2;
                break;
            case '-':
                erg = zahl1 - zahl2;
                break;
            case '*':
                erg = zahl1 * zahl2;
                break;
            case '/':
                erg = zahl1 / zahl2;
                break;
            default:
                System.out.println("Fehler! Unbekannte Operation: " + ch);
                return;
        }
        sc.close();
        System.out.println("Ergebnis " + erg );
    }
    
}
