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
public class Bitwise {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int numCases = input.nextInt();
        
        for (int h = 0; h < numCases; h++) {
            int n = input.nextInt();
            int k = input.nextInt();
        
            int set[] = new int[n];
            
            for (int i = 0; i < n; i++){
                set[i] = i+1;
            }

            int result = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && i < j) {
                        int andOp = set[i] & set[j];
                        if ( andOp < k && andOp > result) {
                            result = andOp;
                        }
                    }
                }
            }

            System.out.println(result);
        }
    }
}
