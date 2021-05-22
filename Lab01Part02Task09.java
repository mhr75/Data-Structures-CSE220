import java.util.*;
public class Lab01Part02Task09
{
  public static void main  (String []args)
  {
    Scanner x=new Scanner (System.in);
    int a= x.nextInt(),b= x.nextInt(),c = x.nextInt();
    
    QuadEqn n =new QuadEqn(a,b,c);
    System.out.println(n);
    System.out.println((n.d(a,b,c)));
  }
}