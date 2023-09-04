package p1;

import assignment_16.Account;
class Customer{
    Account account;
    private String customerName;

    public Customer(String acc, double initialBalance, String name){
        account=new Account();
        account.setAccountNumber(acc);
        account.setBalance(initialBalance);
        customerName=name;

    }


    public void deposit(int amt){
        account.setBalance(account.getBalance()+amt);
        System.out.println(amt+" depsoited");
    }
    public void withdraw(int amt){
        if (account.getBalance()-amt>0) {
            account.setBalance(account.getBalance() - amt);
            System.out.println(amt + " withdrawn");
        }
        else
            System.out.println("Insufficient Amount");
    }
    public void checkBalance(){
        System.out.println("Name: "+customerName);
        System.out.println("Account Number: "+account.getAccountNumber());
        System.out.println("Balance: "+account.getBalance());
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("123456789",3000,"Prakash Pandey");
        c1.account.setBalance(5000);
        c1.checkBalance();
        c1.deposit(2000);
        c1.checkBalance();
        c1.withdraw(3500);
        c1.checkBalance();


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
