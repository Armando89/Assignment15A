//Armando Galan-Cedeño Assignment15A
//CS225 Fall 2020
//November 8, 2020
//Purpose: Sequential Text File Input/Output

package sequentialtextfile;
import java.util.Scanner;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.lang.SecurityException;

public class SequentialTextFile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Scanner input = new Scanner(System.in);
        
        String dirPath;
        
        System.out.println("Enter the directory path of the file desired:");
        dirPath = sc.next();
        
        try (Formatter output = new Formatter(dirPath)) {
            Scanner input = new Scanner(System.in);
            
            System.out.printf("%s%n", "To conclude the program type any letter.");
            //System.out.printf("To conclude the program type any letter.\n");
            
            System.out.printf("%s%n%s", "Information needed: student ID, last name, first "
                + "name, and major code number.", "-");
            //System.out.printf("Enter student's ID number:\n");
            //System.out.printf("Enter student's last name:\n");
            //System.out.printf("Enter student's first name:\n");
            //System.out.printf("Enter student's major code number:\n");
            
            while (input.hasNextInt()) {
                try {
                    output.format("%d %s %s %.2f%n", );
                }
                catch {
                    
                }
            }
        }   
    }
}