import java.util.*;
public class Task5{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner x=new Scanner (System.in);
      int a=x.nextInt();
      int b=x.nextInt();
      int pow=power(a,b);
      System.out.println(pow);
    }
    public static int power(int m,int n)
    {
      if(n==0)return 1;
      return m*power(m,n-1);
    }
}