import java.util.*;
public class Lab01Ta05
{
  public static void main (String []args)
  {
    Scanner scan =new Scanner (System.in);
    int arr [] =new int [10];
    for(int i=0;i<15;i++)
    {
    arr[scan.nextInt()]++;
    }
    for(int i=0;i<10;i++)
    {
      System.out.println(i+"was found "+arr[i]+" times");
    }
  }
}