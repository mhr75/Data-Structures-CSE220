import java.util.*;
public class Lab01Ta08
{
  public static void main (String []args)
  {
    Scanner scan =new Scanner (System.in);
    System.out.println("Please enter the Matrix size");
    int size=scan.nextInt();
    int a[]=new int [size];
    System.out.println("Inputs for first Matrix");
    for(int i=0;i<size;i++)a[i]=scan.nextInt()*5;
    System.out.println("Inputs for second Matrix");
    for(int i=0;i<size;i++)a[i]=a[i]-scan.nextInt();
    for(int i=0;i<size;i++) System.out.print(a[i]+" ");
    System.out.println();
  }
}