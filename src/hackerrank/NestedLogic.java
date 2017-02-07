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
public class NestedLogic {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int dayReturned = input.nextInt();
        int monthReturned = input.nextInt();
        int yearReturned = input.nextInt();

        int dayDue = input.nextInt();
        int monthDue = input.nextInt();
        int yearDue = input.nextInt();
        
        int fine = 0;

        if (yearReturned < yearDue) {
            //Nothing, fine is already 0
        }
        else if (yearReturned == yearDue) {
            if (monthReturned <= monthDue) {
                if (dayReturned <= dayDue) {
                    //Nothing, fine is 0
                }
                else {
                    fine = 15 * Math.abs(dayReturned - dayDue);
                }
            }
            else {
                fine = 500 * Math.abs(monthReturned - monthDue);
            }
        }
        else {
            fine = 10000;
        }
        
        System.out.print(fine);
       }
    
}
