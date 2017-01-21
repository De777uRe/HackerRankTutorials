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
public class DictionariesAndMaps {
    
    public static void main(String []argh){
        Map<String, Integer> map;
        map = new HashMap<>();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (map.containsKey(s)) {
                System.out.println(s+"="+map.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
    
}
