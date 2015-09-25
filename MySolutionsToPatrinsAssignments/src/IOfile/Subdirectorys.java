//Klasse java.io.File. Api (s. auch SCJP-Buch)
//Methoden listFiles() und listFiles(FileFilter) der Klasse File kennenlernen und vergleichen.
//Mit der Klasse File: alle Unterverzeichnisse von C:\Windows ausgeben

package IOfile;
import java.io.File;
import java.io.FileFilter;
public class Subdirectorys {
    public static void main(String[] args) {
    
        File f = new File("C:\\Windows");
        File[] fileArray = f.listFiles();
        
        print(fileArray);
        
        //Nur Unterverzeichnisse ausgeben
        FileFilter uv = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                    return !pathname.isFile();
            }        
        };
        
        File[] paths = f.listFiles(uv);
        print(paths);
        
        
    }//end of main
    
    //Definition der Methode "print"
    static void print(File[] fileArray){
        System.out.println("***********************************************");
        for (File f : fileArray) {
            System.out.println(f);
        }
    }
    
}//end of Subdirectory
