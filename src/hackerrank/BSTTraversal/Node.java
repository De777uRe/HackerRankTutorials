/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.BSTTraversal;

import java.util.*;
import java.io.*;

/**
 *
 * @author willi
 */
public class Node {
    Node left,right;
    int data;
    
    Node(int data){
        this.data=data;
        left=right=null;
    }
    
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    
    public static void levelOrder(Node root) {
        LinkedList queue = new LinkedList();
        if (root != null) {
            queue.push(root);
        
            while (!queue.isEmpty()) {
                Node tree = (Node) queue.pop();

                System.out.print(tree.data + " ");

                if (tree.left != null) {
                    queue.addLast(tree.left);
                }
                if (tree.right != null) {
                    queue.addLast(tree.right);
                }
            }
        }
    }
}
