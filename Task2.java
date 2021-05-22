/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.*;
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner x=new Scanner (System.in);
            int a=x.nextInt();
            int b=fib(a);
            System.out.println(b);
    }
    public static int fib (int a)
    {
        if(a==1)return 1;
        if(a==0)return 0;
    return fib(a-1)+fib(a-2);
    }
    
}
