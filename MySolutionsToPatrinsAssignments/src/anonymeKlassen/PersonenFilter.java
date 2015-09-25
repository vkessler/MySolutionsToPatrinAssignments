/*
- Jede Person hat Vornamen, Nachnamen und Geburtsjahr

- Das Interface Filter hat eine Methode 
        'boolean accept(Person)'

- Erzeugen Sie in der main-Methode einer Test-Klasse mindestens 4 Personen und
  speichern sie ein einem Array

- Definieren Sie in der Test-Klasse eine weitere Methode 
    Person[] filtern(Person[], Filter)
  Sie liefert ein Array zurück, in dem nur die Personen gespeichert sind, die
  mit dem übergebenem Filter (2. Parameter) akzeptiert werden. Die Methode
  sucht in dem Array, das als 1. parameter übergeben wird

- Testen Sie die neue Methode 'filtern' mit unterschiedlichen Filter. Z.B.
  kann ein Filter die Personen akzeptieren, die nach einem bestimmten Jahr
  geboren wurden. Benutzen Sie dabei, wenn möglich, anonyme Klassen.

*/

package anonymeKlassen;

class Person {
    private String vorname, nachname;
    private int geburtsjahr;
    
    Person(){
    }
    
    Person(String vorname, String nachname, int geburtsjahr) {
        this.vorname=vorname;
        this.nachname=nachname;
        this.geburtsjahr=geburtsjahr;
    }
    
    public int getGeburtsjahr () {
        return geburtsjahr;
    }
    
    String getNachname() {
        return nachname;
    }
    
    @Override
    public String toString(){
        return vorname + " " + nachname + ". Geboren " + geburtsjahr;
    }
    
}//end of Person

interface Filter {
    boolean accept(Person p); 
}

public class PersonenFilter {

    public static void main(String[] args) {
       
        
        Person[] arr = { 
            new Person("Tom","Schmitz",1972),
            new Person("Maria","Knauf",1986),
            new Person("Harald","Schneider",1963),
            new Person("Eva","Meier",1994),
        };
        
        print(arr);
        
        //Filter erzeugen mit anonymer Klasse, welche implizit 
        //das Interface "Filter" implementiert
        Filter jung = new Filter() {
            @Override
            public boolean accept(Person p) {
                return p.getGeburtsjahr() > 1984;
            }
        }; 
        
        //Anderer Filter
        Filter pMitS = new Filter() {
            @Override
            public boolean accept(Person p) {
                return p.getNachname().charAt(0) == 'S';
            }
        };        

        Person[] jungeArr = filtern(arr, jung);
        print(jungeArr);
        
        Person[] mitSArr = filtern(arr, pMitS);
        print(mitSArr);
        

 
    }//end of main
    
    //Definieren der statischen Methode "print"
    static void print(Person[] arr){
        System.out.println("*********************************");
        for (Person p : arr) {
            System.out.println(p);
        }
    }
    
    //Definieren der Methode "filtern"
    static Person[] filtern(Person[] scrArr, Filter f) {
        int count = 0;
        //Es wird überprüft, wieviele Personen aus "scrArr" dem Filter 
        //entsprechen und das Ergebnis wird in "count" festgehalten
        for ( Person p : scrArr) {
            if (f.accept(p)) {
                count++;
            }
        }
        // Array "arrBack" mit "count" Plätzen erstellen
        Person[] arrBack = new Person[count];
        
        int freePos = 0;
        //Jede Person "p" aus "scrArr" wird in "arrBack" aufsteigend 
        //gespeichert, sofern sie akzeptiert wird.
        for (int i = 0 ; i < scrArr.length ; i++) {
            Person p = scrArr[i];
            if ( f.accept(p) ) {
                arrBack[freePos++] = p;
            }
        }
        return arrBack;
    }//end of filtern
    
}//end of PersonenFilter
