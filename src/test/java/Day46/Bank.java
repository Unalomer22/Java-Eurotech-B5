package Day46;

import java.util.ArrayList;

public class Bank {
    String name;
    String address ;
    ArrayList<Customer> customers= new ArrayList<Customer>();

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void showCustomer(){
        System.out.println(this.name);
        System.out.println("Address = " + this.address);

        for (Customer customer:customers) {
            System.out.println("customer.getName() = " + customer.getName());
            customer.showMyAccounts();
            System.out.println("----------------------------");
        }
    }




}
