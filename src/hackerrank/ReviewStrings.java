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
public class ReviewStrings {
    
    public static void main(String args[]) {
		
        Scanner scan = new Scanner(System.in);
        
        int numStrings = scan.nextInt();
        scan.nextLine();
        
        for (int i = 0; i < numStrings; i++) {
            String input = scan.nextLine();
            
            for (int j = 0; j < input.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(input.charAt(j));
                }
            }
            
            System.out.print(" ");
            
            for (int j = 0; j < input.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(input.charAt(j));
                }
            }
            
            System.out.print("\n");
        }
        
    }
    
}
