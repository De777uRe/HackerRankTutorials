/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author willi
 */
public class BinaryNumbers {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.close();
        Stack binaryStack = new Stack();
        
        while(x > 0) {
            int remainder = x % 2;
            binaryStack.push(remainder);
            x /= 2;
        }
        
        String result = new String();
        
        while(!binaryStack.isEmpty()) {
            result = result.concat(binaryStack.pop().toString());
        }
        
        char[] resultArray = result.toCharArray();
        int consecutive = 0;
        
        int streak = 0;
        
        for(int i = 0; i < result.length(); i++) {
            if(resultArray[i] == '1') {
                if (streak < 1) {
                    streak = 1;
                    if (i+1 < result.length()) {
                     if (resultArray[i+1] == '1') {
                        streak++;
                     }
                    }
                }
            }
            else if (resultArray[i] == 0) {
                streak = 0; 
            }
            
            if(streak > consecutive) {
                consecutive = streak;
            }
        }
        
        System.out.println(consecutive);
    }
    
}
