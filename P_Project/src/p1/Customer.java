package p1;

import Assignment_16.Account;
class Customer extends Account{
    private String customerName;

    public void deposit(int amt){
        setBalance(getBalance()+amt);
        System.out.println(amt+" depsoited");
    }
    public void withdraw(int amt){
        setBalance(getBalance()-amt);
        System.out.println(amt+" withdrawn");
    }
    public double checkBalance(){
        return getBalance();
    }

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setBalance(5000);
        System.out.println(c1.checkBalance());
        c1.deposit(2000);
        System.out.println(c1.checkBalance());
        c1.withdraw(3500);
        System.out.println(c1.checkBalance());


    }
}


























//import p2.B1;
//
//public class A1 {
//    public static void main(String[] args) {
//        B1 b1 = new B1();
//        b1.fb1();
//    }
//}
