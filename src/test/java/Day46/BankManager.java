package Day46;

public class BankManager {
    public static void main(String[] args) {
        Bank bank1 = new Bank("EuroStudy Tech Bank","Germany");
        Customer cust1 = new Customer("Ahmet Falanca");
        Customer cust2 = new Customer("Mehmet Smithson");
        Customer cust3 = new Customer("Ali Can");

        Account account = new Account("Mevduat Hesabi",100);
        Account accountdvz = new Account("Döviz Hesabi",1500);

        cust1.addAccount(account );
        cust1.addAccount(accountdvz);
        cust1.showMyAccounts();

        cust2.addAccount(new Account("Mevduat Hesabi",20000));
        cust2.addAccount(new Account("Döviz",9000));
        cust3.addAccount(new Account("Euro Hesabi",500));

        bank1.addCustomer(cust1);
        bank1.addCustomer(cust2);
        bank1.addCustomer(cust3);

        bank1.showCustomer();

    }
}
