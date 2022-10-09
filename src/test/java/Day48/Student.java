package Day48;

public class Student {
    static String schoolName;
    static String schoolAddress;
    static String schoolDepartment;
    static String schoolTelNumber;
    static String schoolWebPage;
    static String schoolEmail;
    static int numberOfStudents;

    String studentName;
    String studentLastName;
    String studentAddress;
    int studentNumber;

    static {
        schoolName ="ABC School";
        schoolAddress = "Nowhere Street 15. Somewhere in the world";
        schoolDepartment = "JAVA -SDET";
        schoolTelNumber = "123-987 789 34";
        schoolWebPage = "www.falancaschool.edu";
        schoolEmail = "info@falancaschool.edu";

    }

    Student(){
        numberOfStudents();
    }
    public void numberOfStudents(){
        numberOfStudents++;
        this.studentNumber =numberOfStudents;
    }


    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", schoolDepartment='" + schoolDepartment + '\'' +
                ", schoolTelNumber='" + schoolTelNumber + '\'' +
                ", schoolWebPage='" + schoolWebPage + '\'' +
                ", schoolEmail='" + schoolEmail + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", studentName='" + this.studentName + '\'' +
                ", studentLastName='" +this.studentLastName + '\'' +
                ", studentAddress='" + this.studentAddress + '\'' +
                ", studentNumber=" + this.studentNumber +
                '}';
    }
}
