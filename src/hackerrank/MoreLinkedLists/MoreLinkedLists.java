/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.MoreLinkedLists;

import java.io.*;
import java.util.*;

/**
 *
 * @author willi
 */
public class MoreLinkedLists {
    
    public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=Node.insert(head,ele);
              }
              head=Node.removeDuplicates(head);
              Node.display(head);

       }
    
}
