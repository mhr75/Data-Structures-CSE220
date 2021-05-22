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
public class DoublyList implements Sorting2{
    Node2 head=null;
     public DoublyList(Object [] a){
        head = new Node2(null, null, null);
        Node2 tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node2 mn = new Node2(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    @Override
    public void selection_sort() {
           Node2 cur=head.next;
        while(cur!=head)
        {
            Node2 min=cur;
            Node2 n=cur.next;
            while (n!=head)
            {
                int a=(int)min.element;
                int mini=(int)n.element;
                if(a>mini)min=n;
                n=n.next;
            }
            Object temp=cur.element;
            cur.element=min.element;
            min.element=temp;
            cur=cur.next;
        }}

    @Override
    public void insertion_sort() {
        Node2 i = head.next.next;
        while(i != head)
        {
            Object key = i.element;
            Node2 j = i.prev;
            while(j!=head && (int) j.element > (int) key)
            {
                j.next.element = j.element;
                j=j.prev;
            }
            j.next.element = key;
            i=i.next;
        }
    }

    @Override
    public void bubbleSort() {
            Node2 n=head.next;
            while(n!=head)
            {
                Node2 m=head.next;
                while(m.next!=head)
                {
                    if((int)m.element>(int)m.next.element)
                    {
                        Object temp=m.element;
                        m.element=m.next.element;
                        m.next.element=temp;
                    }
                m=m.next;
                }
            n=n.next;
            }
          
    }

    @Override
    public void printList(){
    Node2 cur = head.next;
    while(cur!=head){
        System.out.print(cur.element + " ");
        cur = cur.next;  
    }
        System.out.println("");
  }
    
}
