import java.util.*;
public class Lab01Ta12
{
  public static void main (String []args)
  {
    Scanner scan =new Scanner (System.in);
    int month1=scan.nextInt();
    int date1=scan.nextInt();
    int month2=scan.nextInt();
    int date2=scan.nextInt();
    if(checking(month1,date1,month2,date2))System.out.println("True");
    else System.out.println("False");
  }
  public static boolean checking(int a, int c ,int b, int d)
  {
  if(a>b) return true;
  if(a==b){if(c>d)return true;}
  return false;
  }
}