import java.util.*;
public class Lab01Part02Task10
{
  public static void main  (String []args)
  {
    Scanner x=new Scanner (System.in);
    int arr [] ={1,4,8,16,25,36,49,64,81,100};
    int a=x.nextInt();
    int c=a;
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[a%arr.length]+" ");
      a++;
    }
    System.out.println();
    System.out.println();
    int aa=arr.length-c;
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[aa%arr.length]+" " );
      aa++;
      
    }
    System.out.println();
    
  }
}