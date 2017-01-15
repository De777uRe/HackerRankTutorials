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
public class Operators {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double totalBill = mealCost + ((double) tipPercent / 100.0 * mealCost) + ((double) taxPercent / 100.0 * mealCost);
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalBill);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
    
}
