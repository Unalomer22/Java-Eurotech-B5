package Day62_Rewiew;

public class EmployeeDatabaseTest {

    public static void main(String[] args) {

        EmployeeDatabasePly database = new EmployeeDatabasePly();
        EmployeePly employeePly;

        // database.getList();
        // database.findByName("Ahmet Falanca");
        // database.findByName("Nicola Tesla");

        //System.out.println("database.getSize() = " + database.getSize());

        employeePly = new TeacherPly("Hasan Can", "Goethe School of Social Science");
        database.addEmployee(employeePly);

        // database.getList();

        //database.findByName("Ahmet Falanca").showInfo();

        database.getListNames();
        database.deleteEmployeeByName("Ahmet Falanca");

        database.getListNames();

    }

}
