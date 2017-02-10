/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author willi
 */
public class Regex {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int numEmails = input.nextInt();
        
        ArrayList<String> validNames = new ArrayList<>();
        
        for (int i = 0; i < numEmails; i++) {
            String name = input.next();
            String email = input.next();
            
            String regex = "@gmail.com";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(email);
            
            if (m.find()) {
                validNames.add(name);
            }
        }
        
        Collections.sort(validNames);
        
        for (String name : validNames) {
            System.out.println(name);
        }
    }
}
