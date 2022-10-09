package Day12_SelectionStatements;

public class IfElseStatement01 {

    public static void main(String[] args) {
        int score = 80;

        if (score>60){

            System.out.println("Congrats");
            System.out.println("You passed the exam");
        }else {
            System.out.println("You failed the exam");
        }


        System.out.println("/////////////////////");


        int sales, bonus;
        double commisionRate, salary;

        sales = 5000;
        salary = 10000;

        if(sales > 3000){

          bonus = 500;
          commisionRate = 1.5 ;

          salary *= commisionRate;
          salary += bonus;

        } else {
            commisionRate = 1.2 ;
            salary *= commisionRate;

        }

        System.out.println("salary = " + salary);


    }


}
