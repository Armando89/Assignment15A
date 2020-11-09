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
import java.lang.IllegalStateException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class SequentialTextFile {

    public static void main(String[] args) {
        
        //scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        //declaring variable
        String dirPath;
        
        System.out.println("Enter the directory path of the file desired:");
        dirPath = sc.next();
        
        try (Formatter output = new Formatter(dirPath)) {
            Scanner input = new Scanner(System.in);
            
            System.out.printf("%s%n%s", "Enter the student ID number, last name, "
                + "first name, and major code number or to conclude the program "
                    + "type any letter.", "-");
            
            while (input.hasNextInt()) {
                try {
                    output.format("%d %s %s %d%n", input.nextInt(), 
                        input.next(), input.next(), input.nextInt());
                }
                catch (NoSuchElementException e) {
                    System.err.println("Invalid input: Re-enter the information.");
                    input.nextLine();
                }
            
                System.out.printf("%n%s%n%s", "For another account, enter the student "
                    + "ID number, last name, first name, and major code number or to "
                        + "conclude the program type any letter.", "-");      
            }
        }
        catch (FormatterClosedException e) {
            System.err.println("Invalid input: Formatter object is closed.");
        }
        catch (FileNotFoundException e) {
            System.err.println("Invalid input: File do not exist, or no "
                + "permission to create a new file.");
        }
        catch (SecurityException e) {
            System.err.println("Invalid input: No permission to create, read, or "
                + "write to the file.");
        }
    }
}