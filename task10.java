public class task10
{
 public static void main(String[]args)
 {
 linkedlist l=new linkedlist();
 l.push(5);
 l.push(10);
 l.push(8);
 l.push(7);
  System.out.println("Before sorting");
        l.printlist(l.head);
        l.insertionSort(l.head);
        System.out.println("\nAfter sorting");
        l.printlist(l.head);
 }
}