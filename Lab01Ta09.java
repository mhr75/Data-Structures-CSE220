import java.util.*;
public class Lab01Ta09
{
  public static void main (String []args)
  {
    Scanner scan =new Scanner (System.in);
    int arr []=new int [10];
    for(int i=0;i<10;i++)
    {
      arr[i]=scan.nextInt();
    }
    int ar[]=sqr(arr,10);
    prints(ar);
  }
  public static int [] sqr(int [] arr,int a)
  {
  int [] ar=new int [10];
  for(int i=0;i<ar.length;i++)
    ar[i]=arr[i]*arr[i];
  return ar;
  }
  public static void prints(int [] ar)
  {
    for(int i=0;i<ar.length;i++)
      System.out.println(ar[i]);
  }
}