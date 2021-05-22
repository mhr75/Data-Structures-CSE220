import java.util.*;
public class Lab01Ta04
{
  public static void main (String []args)
  {
    Scanner scan=new Scanner (System.in);
    int arr [] =new int [10];
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=scan.nextInt();
      if(checkDuplicate(arr,i,arr[i]))
      {
        System.out.println(arr[i]+" is duplicate Number change it!");
        i--;
      } 
    }
    System.out.println("Perfect We got unique 10 numbers from you :D"); 
  }
    public static boolean checkDuplicate(int []arr,int i,int a)
    {
    for(int j=0;j<i;j++)
    {
    if(arr[j]==a) return true;
    }
    return false;
    }
  }
