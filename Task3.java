import java.util.*;
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Scanner x=new Scanner (System.in);
      int a [] = {1,2,3,4,5};
      print(a,0);
    }
    public static void print(int arr[],int i)
    {
      System.out.println(arr[i]);
      i++;
      if(i!=arr.length)print(arr,i);
      
    }
}