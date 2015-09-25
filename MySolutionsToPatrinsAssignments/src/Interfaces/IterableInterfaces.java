/*
Aufgabe Interface 'Iterable'.

- Erstellen Sie nach den JavaBeans Regeln eine Klasse „Person“ mit den Attributen 
  „Vorname“ und „Nachname“, die gelesen und geändert werden dürfen. 

- Erstellen Sie eine Klasse „PersonenList“, die mindestens 10 Objekte von Typ 
  „Person“ speichern kann.
  Wichtig! Die Klasse „PersonenList“ darf NICHT von einer Collection aus dem 
  Package 'java.util' erben.

- Erstellen Sie eine Klasse „TestPersonenList“ mit der folgenden main-Methode:

    public static void main(String[] args) {
	PersonenList list = new PersonenList();
	list.add(new Person(“Peter”, “Braun”));
	list.add(new Person(“Michael”, “Roth”));

	for(Person p : list) {
		System.out.println(p);
	}
    }

  Als Ausgabe soll dabei Folgendes rauskommen:

Person: Peter Braun
Person: Michael Roth
*/
package Interfaces;

import java.util.Iterator;

class Personen {
    private String vorname;
    private String nachname;
    
    Personen(){
    }
    
    Personen(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }
    
    public void setVorname(String vorname){
        this.vorname =vorname;
    }
    
    public String getVorname() {
        return vorname;
    }
    
    public void setNachname(String nachname){
        this.nachname = nachname;
    }
    
    public String getNachname(){
        return nachname;
    }
    
    @Override
    public String toString(){
        return vorname + " " + nachname;
    }
    
}//end of Personen

class PersonenList implements Iterable<Person> {
    
    private Person[] personen = new Person[10];
    private int indexFrei;
    
    public void add(Person p) {
        if (indexFrei == personen.length){
            System.out.println("Die Liste ist voll. Folgende Person wird verworfen: " + p);
            return;
        }
        personen[indexFrei++] = p;
    }    

    @Override
    public String toString() {
        return "Personen in der Liste: " + indexFrei;
    }
    
    @Override
    public Iterator<Person> iterator() {
        return new Iterator<Person> () {
            int lastIndex;
            @Override
            public boolean hasNext() {
                return lastIndex < indexFrei;
            }
            @Override
            public Person next() {
                return personen[lastIndex++];
            }
        };
    }
    
    
    
    
}//end of PersonenList


public class IterableInterfaces {
    
    public static void main(String[] args) {
        PersonenList list = new PersonenList();
        list.add(new Person("Peter", "Braun"));
        list.add(new Person("Michal", "Roth"));
        
        System.out.println(list);
        
        for ( Person p : list) {
            System.out.println(p);
        }
    }

}
