package Day43;

import java.util.ArrayList;

public class Course {
    String courseName;
    int maxCapacity;
    int emptyCapacity;

    ArrayList<Student> courseListe = new ArrayList<>() ;

    Course(String courseName){
        this.courseName = courseName;
    }

    public void displayCourseInfo(){
        for (Student student: courseListe) {
            System.out.println(student.studentNo +" "+ student.name);
        }
        System.out.println();
    }


}
