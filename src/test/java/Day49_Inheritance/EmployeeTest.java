package Day49_Inheritance;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.name = "Yeliz";
        emp1.empId = 12345;

        System.out.println("emp1.name = " + emp1.name);
        System.out.println("emp1.empId = " + emp1.empId);

        Developer dev1 = new Developer();
        dev1.name = "Ahmet";
        dev1.empId = 54321;
        dev1.progLanguage = "Java";

        System.out.println("dev1.name = " + dev1.name);
        System.out.println("dev1.empId = " + dev1.empId);

        Lawyer law1 = new Lawyer();
        law1.name = "Bedri";
        law1.empId = 523312;
        law1.caseName = "Dava1";

        System.out.println("law1.name = " + law1.name);
        System.out.println("law1.empId = " + law1.empId);

    }
}
