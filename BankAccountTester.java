public class BankAccountTester
{
  public static void main (String [] args)
  {
    BankAccount acc1 =new BankAccount();
    BankAccount acc2 =new BankAccount();
    BankAccount acc3 =new BankAccount();
    acc1.setName("John");
    acc1.setAccountID("17101396");
    acc1.setAddress("Bodura");
    acc1.setBalance(4.0);
    System.out.println(acc1.getName());
    System.out.println(acc1.getAccountID());
    System.out.println(acc1.getAddress());
    System.out.println(acc1.getBalance());
    acc2.setName("Carol");
    acc2.setAccountID("17101322");
    acc2.setAddress("Kodura");
    acc2.setBalance(10.0);
    System.out.println(acc2.getName());
    System.out.println(acc2.getAccountID());
    System.out.println(acc2.getAddress());
    System.out.println(acc2.getBalance());
    acc3.setName("Mike");
    acc3.setAccountID("27101396");
    acc3.setAddress("lodura");
    acc3.setBalance(100.0);
    System.out.println(acc3.getName());
    System.out.println(acc3.getAccountID());
    System.out.println(acc3.getAddress());
    System.out.println(acc3.getBalance());
    acc1.addInterest();
    acc3.addInterest();
    System.out.println(acc1.getBalance());
    System.out.println(acc3.getBalance());
  }
}