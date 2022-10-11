package Day62_Rewiew;

public class TeacherPly extends EmployeePly{

    String schoolName;

    //Contructor overloading
    public TeacherPly(String name){
        super(name);
    }
    public TeacherPly(String name, String schoolName){
        super(name);
        this.schoolName = schoolName;
    }
    @Override
    public void work(){
        System.out.println(this.name + " çalışıyor.");
    }

    public void doExam(){
        System.out.println(this.name + " teacher is doing exam.");
    }
    @Override
    public void showInfo(){
        System.out.println("----------Teacher----------");
        System.out.println("Name        : " + this.name);
        System.out.println("School      : " + this.schoolName) ;
        System.out.println("---------------------------");
    }
}
