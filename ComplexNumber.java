public class ComplexNumber extends RealNumber
{
  private double imaginaryValue;
  public ComplexNumber()
  {
    super.setRealValue(1);
    imaginaryValue = 1;
  }
  public ComplexNumber(double a, double b)
  {
    super.setRealValue(a);
    imaginaryValue = b;
  }
  public String toString()
  {
    return super.toString()+ "\nImaginaryPart: "+ imaginaryValue;
  }
  public void check()
  {
    System.out.println("I'm in ComplexNumber class");
    super.ping();
    System.out.println("Checking ended.");
  }
}