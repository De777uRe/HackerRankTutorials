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
interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n) {
        ArrayList divisors = new ArrayList();
        
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        
        int sum = 0;
        
        for (int i = 0; i < divisors.size(); i++) {
            sum += (int) divisors.get(i);
        }
        
        return sum;
    }
}

public class Interfaces {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
    
}
