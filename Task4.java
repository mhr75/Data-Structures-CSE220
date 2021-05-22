import java.util.*;
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner x=new Scanner (System.in);
      int a=x.nextInt();
      String p = binaryNumber(a);
      System.out.println(p);
    }
    public static String binaryNumber(int a)
    {
      int d=a;
      int e=d/2;
      if(e==0){return ""+(d%2);}
      else {return ""+binaryNumber(a/2)+(d%2);
      }      
    }
}