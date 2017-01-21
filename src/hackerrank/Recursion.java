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
public class Recursion {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = factorial(n);
        System.out.print(x);
    }
    
    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n-1);
        }
        else {
            return 1;
        }
    }
    
}
