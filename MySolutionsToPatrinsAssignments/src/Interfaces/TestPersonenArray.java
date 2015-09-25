package Interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class PersonReverseComparator implements Comparator<Person> {
    @ Override
    public int compare(Person p1, Person p2) {
        return p2.compareTo(p1);
    }
}


class Person implements Comparable<Person> {
    private String vorname = "?", nachname = "?";

    public Person() {
    }

    public Person(String vorname, String nachname) {
        if(vorname==null) {
            vorname = "?";
        }
        if(nachname==null){
            nachname="?";
        }
        this.vorname = vorname;
        this.nachname = nachname;
    }
    
//    public void setAlter(int alter) {        
//    }
    
    public void setVorname(String vornamen) {
        if(vorname==null) {
            vorname = "?";
        }        
        this.vorname = vornamen;
    }

    public void setNachname(String nachname) {
        if(nachname==null){
            nachname="?";
        }
        this.nachname = nachname;
    }
    
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    @Override
    public String toString() {
        return vorname.toUpperCase() + " " + nachname.toUpperCase();
    }
    
    @Override
    public int compareTo(Person p2) {
        Person p1 = this;
        int erg = p1.nachname.compareTo(p2.nachname);
        if (erg == 0) {
            erg = p1.vorname.compareTo(p2.vorname);
        }
        return erg; 
    }
}

public class TestPersonenArray {
    
    public static void main(String[] args) {
        
        Person[] arr = {
            new Person("Paul", "Smith"),
            new Person("Paul", "Black"),
            new Person("John", "Smith"),
            new Person("John", "Black"),
        };
        
        System.out.println("Unsortiertes Array: \n" + Arrays.toString(arr));
        
        Arrays.sort(arr);
        
        System.out.println("Sortiertes Array:");
        
        for (Person arr1 : arr) {
            System.out.println(arr1);
        }
        
        System.out.println("--------------Reverse  Sorting-------------------");
        
        Comparator cmp = new PersonReverseComparator();
        
        Arrays.sort(arr, cmp);

        for (Person arr1 : arr) {
            System.out.println(arr1);
        }
        
    }
}
