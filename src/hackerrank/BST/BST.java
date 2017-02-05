/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.BST;

import java.util.*;
import java.io.*;

/**
 *
 * @author willi
 */
public class BST {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=Node.insert(root,data);
        }
        int height=Node.getHeight(root);
        System.out.println(height);
    }
    
}
