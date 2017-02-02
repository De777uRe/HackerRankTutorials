/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author willi
 */
public class Printer <T> {
        /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param array
    **/
    
    // Write your code here
    public void printArray(T[] array) {
        for (T obj : array) {
            System.out.println(obj);
        }
    }
    
}
