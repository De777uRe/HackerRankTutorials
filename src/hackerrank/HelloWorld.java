/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author willi
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompt the user to enter a value for our variable.
        System.out.println("Please enter what you would like to print.");
        
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);
        
        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();
        
        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();
        
        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello World.");
        
        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
    }
    
}