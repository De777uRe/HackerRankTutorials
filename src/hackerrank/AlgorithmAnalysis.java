/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.*;
import java.util.*;

/**
 *
 * @author willi
 */
public class AlgorithmAnalysis {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        
        for (int i = 0; i < numCases; i++) {
            int num = input.nextInt();
            
            boolean added = false;
            if (num == 1 || num % 2 == 0) {
                if (num != 2) {
                    System.out.println("Not prime");
                }
                else {
                    System.out.println("Prime");
                }
                added = true;
            }
            
            int j = 3;
            while (j <= num/2 && !added) {
                if (num % j == 0) {
                    System.out.println("Not prime");
                    added = true;
                }
                j+=2;
            }
            if (!added) {
                System.out.println("Prime");
            }
        }
    }
    
}
