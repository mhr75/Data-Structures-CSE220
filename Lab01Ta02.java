import java.util.*;
public class Lab01Ta02
{
  public static void main (String []args)
  {
    Scanner scan=new Scanner (System.in);
    int max=0,min=0,indexOfMax=0,indexOfMin=0;
    int []arr=new int [10];
    for(int i=0;i<10;i++)
    {
      arr[i]=scan.nextInt();
      if(i==0)
      {
        max=arr[i];
        min=arr[i];
      }
      if(i!=0)
      {
        if(max<arr[i]){max=arr[i];indexOfMax=i;}
        if(min>arr[i]){min =arr[i];indexOfMin=i;}
      }
    }
    System.out.println("Before Swaping");
    for(int x: arr) System.out.print(x+", ");System.out.println();
    arr[indexOfMax]=min;
    arr[indexOfMin]=max;
    System.out.println("After Swaping");
    for(int x: arr) System.out.print(x+", ");System.out.println();
  }
}