public class Main{
  public static void main(String[] args){
   Bank b=new Bank(12345,20000);
   b.withdraw(20000);
   b.deposite(10000);
   b.display();
  }
}
  class Bank{
    int ac_no;
    double balance;
    Bank(int ac,double b){
      ac_no=ac;
      balance=b;
    }
  void deposite(double amount){
    balance=balance+amount;
  }
  void withdraw(double amount){
    balance=balance-amount;
  }
  void display(){
    System.out.println(ac_no);
    System.out.println(balance);
  }
}