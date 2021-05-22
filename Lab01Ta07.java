import java.util.*;
public class Lab01Ta07
{
  public static void main (String []args)
  {
    Scanner scan =new Scanner (System.in);
    int arr[]=new int [10];
    for(int i=0;i<10;i++)arr[i]=scan.nextInt();
    System.out.println("Please choose a cell");
    int cell =scan.nextInt();
    cell=arr[cell];
    for(int i=0;i<cell;i++)
    {
      System.out.print("*");
    }
    System.out.println();
  }
}