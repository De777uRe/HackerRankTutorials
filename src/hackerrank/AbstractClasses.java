/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.*;

/**
 *
 * @author willi
 */
public class AbstractClasses {
    
    abstract class Book
    {
        String title;
        String author;
        Book(String t,String a){
            title=t;
            author=a;
        }
        abstract void display();
    }
    
    static class MyBook extends Book {
        int price;
        
        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }
        
        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }
    
    public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
    
}
