/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package linkedlisttester;

/**
 *
 * @author user
 */
public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
     Node temp =new Node (null,null);
    for(int i=0;i<a.length;i++)
    {
        if(i==0)
        {
            head =new Node (a[i],null);
            temp=head;
        }
        else
        {
            Node n=new Node (a[i],null);
            temp.next=n;
            temp=n;   
        }
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
      int count =0;
      for(Node n=head;n!=null;n=n.next)count++;
    return count; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO 
    for(Node n=head;n!=null;n=n.next)System.out.print(n.element+",");System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
      int i=0;
      try{
      if(idx<0){throw new Exception();}
      for(Node n=head;n!=null;n=n.next)
      {
          if(i==idx)return n;
          i++;
      }
      }
      catch (Exception e )
      {
        return null;
      }
      return null;// please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    int i=0;
    
      if(idx<0){return null;}
      for(Node n=head;n!=null;n=n.next)
      {
          if(i==idx)return n.element;
          i++;
      }
      
      
      return null;
     // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    //if(idx<0)return null;
    int i=0;
    Object temp=null;
    for(Node n=head;n!=null;n=n.next)
    {
        if(i==idx)
        {
            temp= (Object)n.element;
            n.element=elem;
            break;
        }
        i++;
    }
    return temp; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
      int i=0;
    for(Node n=head;n!=null;n=n.next)
    {
        int a=(int)n.element;
        int b=(int)elem;
        if(a==b)return i;
        i++;
    }
    
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    for(Node n=head;n!=null;n=n.next)
    {
        int a=(int)n.element;
        int b=(int)elem;
        if(a==b)return true;
    }
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
    int i=0;
    Node headd=new Node(null,null);
    Node temp=new Node(null,null);
    for(Node n=head;n!=null;n=n.next)
    {
        if(i==0)
        {
            headd =new Node (n.element,null);
            temp=headd;
        }
        else
        {
            Node nn=new Node (n.element,null);
            temp.next=nn;
            temp=nn;   
        }
        i++;
    }
    return headd; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    int a= countNode();
    int j=a;
    int i=1;
    Node headd=new Node(null,null);
    Node temp=new Node(null,null);
    for(;a>0;a--)
    {
        i=1;// a hocche 1st counter j=5 ase ja aer prothom value// 4 
        
    for(Node n=head;n!=null;n=n.next)
    {
        if(i==j)
        {
            headd =new Node (n.element,null);// ekbar dhukbe last indext 
            temp=headd;// dhuke head er kaj korbe reverse way te 
        }
        else if(i==a)
        {
            Node nn=new Node (n.element,null);// 5 4 number ghor tar value niye head er porer link add rakhbe .. 3  5 4 3 ....
            temp.next=nn;
            temp=nn; 
            break;
        }
        i++;//i hoche 2nd counter
        //System.out.println(a+" "+i);
    }
    }
    //for(Node n=headd;n!=null;n=n.next)System.out.println(n.element);
    return headd; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    int j=countNode();
    Node temp=new Node (null,null);
    if(idx==0)
    {
        temp = head;
        head =new Node (elem,null);
        head.next=temp;
    }
    else if(idx==j)
    {
        Node n= new Node (elem,null);
        int i=1;
        for(Node h=head;h!=null;h=h.next)
        {
            if(i==j)
            {
                h.next=n;
            }
            i++;
        }
        
    }
    else
    {
        int i=0;
        for(Node n=head;n!=null;n=n.next)
        {
            if(i==idx-1){temp=n;}
            if(i==idx)
            {
                Node nn= new Node (elem,null);
                nn.next=n;
                temp.next=nn;
            }
            i++;
        
    }
  }
  }
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */

    /**
     *
     * @param index
     * @return
     */
    public Object remove(Object index){
     int a= countNode();
     Object elem=null;
     int b=(int)index;
    
     Node temp=new Node (null,null);
    if(b==0)
    {
        elem=head.element;
        head=head.next;
    }
    else if (a==b)
    
        {
        int i=1;
        for(Node h=head;h!=null;h=h.next)
        {
            if(i==a-1)
            {
                elem=h.next.element;
                h.next=null;
                break;
            }
            i++;
        }  
    }
    else
    {
        System.out.println("Aschi bro");
        int i=0;
        for(Node h=head;h!=null;h=h.next)
        {
            if(i==b-1)
            {
                temp=h;
            }
            if(i==b)
            {
                elem=h.element;
                temp.next=h.next;
            }
            i++;
        }  
    }
    
    return elem; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
    Node temp=head;
    head=head.next;
    Node n=head;
    for(;n.next!=null;n=n.next)
    {
        n=n.next;
    }
    n.next=temp;
    temp.next=null;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
        Node temp=null;
    Node n=head;
    for(;n.next!=null;n=n.next)
    {
        temp=n;
    }
    n.next=head;
    head=n;
    temp.next=null;
  }
  
}