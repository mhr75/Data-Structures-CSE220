import java.util.*;
public class Lab01Ta01
{
  public static void main (String []args)
  {
    Scanner scan =new Scanner (System.in);
    int []arr =new int [scan.nextInt()];
    for(int i=0;i<arr.length;i++) arr[i]=scan.nextInt();
    if(firstLast6(arr))
    {
      System.out.println("true");
    }
    else
    {System.out.println("false");}
  }
  public static boolean firstLast6(int [] arr)
  {
    if(arr[0]==6||arr[arr.length-1]==6) return true;
    else return false;
  }
}