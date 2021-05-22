import java.util.*;
public class Task6{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner x=new Scanner (System.in);
      Object a[]={1,2,3,4,5,6,7,8,9,10};
      LinkedList LL=new LinkedList(a);
      int add=adding(LL.head);
      System.out.println(add);
    }
    public static int adding(Node a)
    {
      if(a==null)return 0;
      return (int)a.element+adding(a.next);
    }
}