/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.MoreLinkedLists;

/**
 *
 * @author willi
 */
public class Node {
    int data;
    Node next;
    
    Node(int d){
    data=d;
    next=null;
    }
    
    public static Node removeDuplicates(Node head) {
        Node start = head;
        while (start != null) {
            if (start.next != null) {
                if (start.data == start.next.data) {
                    Node peek = start.next.next;
                    while (peek != null && peek.data == start.data) {
                        peek = peek.next;
                    }
                    start.next = peek;
                }
            }
            start = start.next;
        }
        return head;
    }
    
    public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    
    public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
}
