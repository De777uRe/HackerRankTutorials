/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author willi
 */
public class Scope {
    
    static class Difference {
  	private int[] elements;
  	public int maximumDifference;
        // Add your code here
        Difference(int elements[]) {
            this.elements = elements;
            maximumDifference = 0;
        }
        
        public void computeDifference() {
            for (int i = 0; i < elements.length; i++) {
                for (int j = i+1; j < elements.length; j++) {
                    if (Math.abs(elements[i] - elements[j]) > maximumDifference) {
                        maximumDifference = Math.abs(elements[i] - elements[j]);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
    
}
