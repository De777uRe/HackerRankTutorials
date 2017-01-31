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
public class LinkedListExample {
    
    static class Node {
	int data;
	Node next;
        
	Node(int d) {
        data = d;
        next = null;
       }
    }
   
    public static Node insert(Node head, int data) {
        //Complete this method
        Node newNode = new Node(data);
        Node pointerNode = head;
        Node returnNode = null;
        
        if (head == null) {
            returnNode = newNode;
        }
        else {
            while (pointerNode.next != null) {
                pointerNode = pointerNode.next;
            }
            pointerNode.next = newNode;
            returnNode = head;
        }
        
        return returnNode;
    }
    
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
    
}
