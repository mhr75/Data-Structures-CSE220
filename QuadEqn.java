import java.lang.Math;
public class QuadEqn
{
  public int a,b,c;
  QuadEqn(int x,int y,int z)
  {
    a=x;
    b=y;
    c=z;
  }
  public String toString()
  {
   return a+"x2+("+b+"x)"+"+("+c+")";
  }
 public double d( int a, int b, int c)
 {
   double firstRoot =(Math.sqrt(b*b - 4*a*c))/ (2*a);
   return firstRoot;
 }
}
