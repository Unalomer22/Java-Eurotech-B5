package Day62_Rewiew;

import java.util.ArrayList;

public class EmployeeTest {

    public static void addEmployee(EmployeePly emp , ArrayList array){
        array.add(emp);
        System.out.println("Toplam kayıt sayısı : " + array.size());
    }
    public static void main(String[] args) {
        ArrayList<EmployeePly> employeePlies = new ArrayList<>();
        /*
        Teacher teacher = new Teacher("Adem Badem");
        System.out.println("teacher.name = " + teacher.name);
        teacher.work();
        teacher.showInfo();
        teacher.doExam();

        Engineer engineer = new Engineer("Ali Can","Fabrika");
        System.out.println("engineer.name = " + engineer.name);
        engineer.work();
        engineer.showInfo();
         */


        //Polymorphic variable ile tanımlama
        System.out.println("-----------------------");
        EmployeePly employeePlyPlmrc = new TeacherPly("Mehmet Filanca","Üniversite");
        // employees.add(employeePlmrc);
        addEmployee(employeePlyPlmrc, employeePlies);

        employeePlyPlmrc.work();
        //    employeePlmrc.showInfo();
        ((TeacherPly) employeePlyPlmrc).doExam();

        employeePlyPlmrc = new EngineerPly("Ahmet Can","Samsung");
        // employees.add(employeePlmrc);
        addEmployee(employeePlyPlmrc, employeePlies);

        employeePlyPlmrc.work();
        // employeePlmrc.showInfo();
        ((EngineerPly) employeePlyPlmrc).doDesing();

        System.out.println("employees.size() = " + employeePlies.size());

        System.out.println();
        System.out.println("Liste");

        for (EmployeePly emp: employeePlies) {
            // System.out.println("Name = " + emp.name);
            emp.showInfo();
            emp.work();
            if( emp instanceof TeacherPly){
                System.out.println("Name = " + emp.name);
                System.out.println("Hi teacher!");
                ((TeacherPly)emp).doExam();
            }
            if (emp instanceof EngineerPly){
                System.out.println("Name = " + emp.name);
                System.out.println("Hi engineer!");
                ((EngineerPly)emp).doDesing();
            }

        }


    }

}
