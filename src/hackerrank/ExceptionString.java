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
public class ExceptionString {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
            int stringToInt = Integer.parseInt(S);
            System.out.print(stringToInt);
        }
        catch (Exception e){
            System.out.print("Bad String");
        }
    }
}
