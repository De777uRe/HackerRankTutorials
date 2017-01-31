/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.*;
import java.io.*;

/**
 *
 * @author willi
 */
public class MoreExceptions {
    
    static class Calculator {
        Calculator() {
        }
        
        public int power(int i, int j) throws Exception{
            if (i < 0 || j < 0) {
                throw new Exception("n and p should be non-negative");
            }
            int answer = (int) Math.pow((double) i, (double) j);
            return answer;
        }
    }
    
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
    
}
