/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author user
 */
public class Main {
    
     public static void main(String[] args) {
        Sorting m = new Sorting();
        //Sorting2 n = new Sorting2();
        int a[] = {3, 9, 8, 7, 4, 0, 1, 4};
        int b[] = {3, 9, 8, 7, 4, 5, 13, 2};
//        m.print_array(a);
//        m.print_array(b);
//        m.insertion_sort(a);
//        m.print_array(a);
//        m.selection_sort(b);
//        m.print_array(b);
        
        Object [] a1 = {3, 9, 8, 7, 4, 0, 1, 4};
        
        DoublyList h1 = new DoublyList(a1);
        h1.printList();
//        h1.selection_sort();
//        h1.printList();
        h1.insertion_sort();
        h1.printList();
        
//        DoublyList h2 = new DoublyList(a1);
//        h2.forwardprint();
//        h2.insertion_sort();
//        h2.forwardprint();
        
    }
}
