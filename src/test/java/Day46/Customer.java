package Day46;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int Account;
    ArrayList<Account> accounts = new ArrayList<>(Account);

    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  public void addAccount(Account account){
        accounts.add(account);
  }
  public void showMyAccounts(){
      System.out.println("Müsteri Adi");
      System.out.println("\t-----------");
      System.out.println(this.name);
      for(Account account: accounts){
          System.out.println();
          System.out.print("Hesap adi = " + account.getName());
          System.out.println(" Bakiye = " + account.getBalance());
      }
  }
}
