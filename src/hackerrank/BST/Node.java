/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.BST;

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
    
    public static int getHeight(Node root) {
        //Write your code here
        if (root == null) {
            return -1;
        }
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        }
        else {
            return rightHeight + 1;
        }
    }
}
