package Day43;

import java.util.concurrent.Callable;

public class ConstructorEmployee {
    public String name;
    public int salary;// salary = maas
    public String address;

    // default constructor of the class
    public ConstructorEmployee(){
        // this will call the constructor with String parameter
        this("Ahmet Falanca");
    }

    public ConstructorEmployee(String name){
        // call the constructor with (String,int) parameters
        this(name,80000);
    }
    public ConstructorEmployee(String name,int salary){
        // call the constructor with (String, int, String) parameters
        this(name,salary, "Ankara-Turkiye");
    }
    public ConstructorEmployee(String name,int salary, String address){
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
    public void printInfo(){
        System.out.println("Employee Name = " + name);// Employee Name = Ahmet Falanca
        System.out.println("Employee Salary = " + salary);// Employee Salary = 80000
        System.out.println("Employee Address = " + address);// Employee Address = Ankara-Turkiye
    }

    public static void main(String[] args) {
        ConstructorEmployee yeniCalisan = new ConstructorEmployee();
        yeniCalisan.printInfo();
        System.out.println();

        ConstructorEmployee yeniCalisan1 = new ConstructorEmployee("Ali Can");
        yeniCalisan1.printInfo();
        System.out.println();

        ConstructorEmployee yeniCalisan2 = new ConstructorEmployee("Ali Can",100000);
        yeniCalisan2.printInfo();
        System.out.println();

        ConstructorEmployee yeniCalisan3 = new ConstructorEmployee("Has Ali",120000,"ABD New York");
        yeniCalisan3.printInfo();




    }

}
