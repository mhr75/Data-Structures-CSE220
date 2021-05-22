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
public class Node2{
  public Object element;
  public Node2 next;
  public Node2 prev;
  
  public Node2(Object e, Node2 n, Node2 p){
    element =e ;
    next = n;
    prev =p;
    
  }
  
}
