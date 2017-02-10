/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Random;

/**
 *
 * @author willi
 */
public class Testing {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Random rand = new Random();
        
        System.out.println('5');
        
        for (int i = 0; i < 5; i++) {
            int n = rand.nextInt(200) + 1;
            int k = rand.nextInt(n) + 1;
            int studentTimes[] = new int[n];
            studentTimes[0] = 0;
            studentTimes[1] = rand.nextInt(1000);
            
            for (int j = 2; j < n; j++) {
                studentTimes[j] = rand.nextInt(1000) - 1000;
            }
            
            System.out.println(n + " " + k);
            
            for (int j = 0; j < n; j++) {
                System.out.print(studentTimes[j] + " ");
            }
            
            System.out.println();
        }
    }
}
