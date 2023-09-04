package assignment_19;
abstract class Account {
    private  double balance;
    private String accountNo;
    private static double rateOfInterest;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        Account.rateOfInterest = rateOfInterest;
    }
    public abstract double calculateInterest(int time);
}

class SavingAccount extends Account{
    private String customerName;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public double calculateInterest(int time){
        return getBalance()*0.06*time;
    }
}

class Test{
    public static void driver(){
        SavingAccount a1 = new SavingAccount();
        a1.setBalance(3000);
        System.out.println(a1.getBalance());
        a1.setCustomerName("Prakash");
        a1.setAccountNo("123456789");
        System.out.println(a1.calculateInterest(2));
    }

    public static void main(String[] args) {
        Test.driver();
    }
}
