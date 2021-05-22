import java.util.*;
public class DateTest
{
  public static void main  (String []args)
  {
    Scanner x=new Scanner (System.in);
    Date d= new Date (3, 4 ,12);
    System.out.println(d.displayDate());
    d.setDay(5);
    d.setMonth(1);
    d.setYear(0);
    System.out.println(d.displayDate());
    System.out.println(d.getDay());
  }
}