package Day62_Rewiew;

import java.util.ArrayList;

public class EmployeeDatabasePly {

    private ArrayList<EmployeePly> employees;
    public EmployeeDatabasePly(){
        employees = new ArrayList<>();
        addTestRecords();
    }

    public void addEmployee(EmployeePly eleman){
        employees.add(eleman);
    }

    public void deleteEmployeeByName(String name){
        employees.remove(findByName(name));
    }

    public EmployeePly findByName(String name){
        for (EmployeePly eleman: employees) {
            if(name.equals(eleman.name)){
                // eleman.showInfo();
                return eleman;
            }
        }
        System.out.println("Kayıt bulunamadı!");
        return null;
    }

    public int getSize(){
        return employees.size();
    }
    public void getListNames(){
        System.out.println("Veritabanında kayıtlı olan kişiler listesi");
        System.out.println("------------------------------------------");
        int sayac = 0;
        for (EmployeePly eleman: employees) {
            sayac++;
            System.out.print( sayac + "- " + eleman.name + "  -  ");
            if( eleman instanceof TeacherPly){
                System.out.println(((TeacherPly) eleman).schoolName);
            }
            if( eleman instanceof EngineerPly){
                System.out.println(((EngineerPly) eleman).workPlace);
            }
        }
        System.out.println("\nToplam kayıt sayısı = " + getSize());
    }

    public void getList(){
        for (EmployeePly eleman: employees) {
            eleman.showInfo();
        }
    }
    private void addTestRecords(){
        EmployeePly employeePly = new TeacherPly("Jhone Smith","Univercity of New York");
        employees.add(employeePly);

        employeePly = new EngineerPly("Nicola Tesla","Tesla Corporation");
        employees.add(employeePly);

        employeePly = new TeacherPly("Ahmet Falanca", "Ankara Üniversitesi");
        employees.add(employeePly);

        employeePly = new EngineerPly("Ayşe Hanım","EuroTech Education");
        employees.add(employeePly);

    }
}
