public class Date
{
  int month;
  int day;
  int year;
  Date(int m, int d, int y)
  {
    month =m;
    year= y;
    day=d;
    
  }
  public int  getDay()
  {
    return day;
  }
  public int  getMonth()
  {
    return month;
  }
  public int getYear()
  {
    return year;
  }
  public void  setDay(int d)
  {
    day=d;
  }
  public void setMonth(int m)
  {
    month=m;
  }
  public void setYear(int y)
  {
    year = y;
  }
  public String displayDate()
  {
    return ""+day+"/"+month+"/"+year;
  }
}