import java.util.*;
public class Lab01Ta03
{
  public static void main (String []args)
  {
    Scanner scan=new Scanner (System.in);
    int arr[] =new int [5];
    for(int i=0;i<5;i++)arr[i]=scan.nextInt();
    System.out.println("Before sorting");
    for(int x: arr)System.out.print(x+" ,");System.out.println();
    for(int i=0;i<4;i++)
    {
    for(int j=0;j<4;j++)
    {
      if(arr[j]<arr[j+1])
      {
      int temp= arr[j];
      arr[j]=arr[j+1];
      arr[j+1]=temp;
      }
    }
    }
    System.out.println("After Sorting");
    for(int x: arr)System.out.print(x+" ,");System.out.println();
    }
  }

