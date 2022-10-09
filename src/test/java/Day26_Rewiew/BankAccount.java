package Day26_Rewiew;

public class BankAccount {

    String accountHolder; // hesap sahıbı
    long accountNumber; // hesap numarsı
    double balance; // hesaptaki para
    // deposit : yatırılan para
    // amount : miktar
    public void deposit(double amount){
        System.out.println("depositting $ " + amount + " to "+ accountNumber);
        balance += amount;
    }

    // withdraw : para cekme
    public void withdraw (double amount) {
        if (amount > balance) {
            System.out.println("------İnsufficent Balance--------");
        } else {
            System.out.println("Withdrawing $ " + amount + " from " + accountNumber);
            balance -= amount;
        }
    }

    public void charge(String item, double price){
        if (price>balance) {
            System.out.println("------İnsufficent Balance--------");
        }else {
            System.out.println("Charging $ " + price+ " from " + accountNumber);
            balance -= price;
        }
    }

    public void displayBalance(){
        System.out.println("-------------------------");
        System.out.println("Account Holder Name = " + accountHolder);
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Balance = " + balance);
        System.out.println("-------------------------");
    }

}
