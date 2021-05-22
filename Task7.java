import java.util.*;
public class Task7{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner x=new Scanner (System.in);
      Object a[]={10,20,30,40};
      LinkedList ll=new LinkedList(a);
      print(ll.head);
    }
    public static void print(Node n)
    {
      if(n.next!=null)print(n.next);
      System.out.println(n.element);
    }
}