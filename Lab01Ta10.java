import java.util.*;
public class Lab01Ta10
{
  public static void main (String []args)
  {
    Scanner scan =new Scanner (System.in);
    int month =scan.nextInt();
    int date =scan.nextInt();
    System.out.println(season(month,date));
    
  }
  public static String season (int a,int b){
  if(a==2||a==1||(a==12&&b>=16)||(a==3&&b<=15)) return "Winter";
  if(a==4||a==5||(a==3&&b>=16)||(a==6&&b<=15)) return "Spring";
  if(a==7||a==8||(a==6&&b>=16)||(a==9&&b<=15)) return "Summer";
  if(a==10||a==11||(a==9&&b>=16)||(a==12&&b<=15)) return "fall";
  return "Error";
  }  
}