package Day48;

import java.util.ArrayList;

public class StudentProgram {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        int say=0;
        for (int i = 0; i < 10000; i++) {
            Student varStd = new Student();
            students.add(varStd);
            say++;
        }
        System.out.println("say = " + say);

        for (Student stds:students) {
            System.out.println("stds = " + stds);
        }

    }











}
