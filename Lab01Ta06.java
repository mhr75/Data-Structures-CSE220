import java.util.*;
public class Lab01Ta06
{
  public static void main (String []args)
  {
    Scanner scan =new Scanner (System.in);
    int pali= scan.nextInt();
    if( checkpalin(pali))System.out.println(pali +" this number is palindrome");
    else System.out.println("this is not palindrome "+pali);
  }
  public static boolean checkpalin(int a)
  {
    String palin = a+"";
    char []abc=palin.toCharArray();
    String s="";
    for(int i=abc.length-1;i>-1;i--)s=s+abc[i];
    
    if(s.equals(palin)) return true;
    else return false;
  }
}