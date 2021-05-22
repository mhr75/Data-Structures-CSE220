import java.util.*;
public class Lab01Ta11
{
  public static void main (String []args)
  {
    Scanner scan =new Scanner (System.in);
    int digits=scan.nextInt();
    if(allDigitsOdd(digits)){System.out.println("All digits are Odd");}
    else
    {
      System.out.println("All digits are not odd");
    }
  }
  public static boolean allDigitsOdd(int a)
  {
    String s=a+"";
  char []abc =s.toCharArray();
  for(int i=0;i<abc.length;i++)
  {
    if(abc[i]=='2'||abc[i]=='4'||abc[i]=='6'||abc[i]=='8'||abc[i]=='0') return false;
  }
  return true;
  }
}