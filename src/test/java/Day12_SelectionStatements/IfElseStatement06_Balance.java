package Day12_SelectionStatements;

public class IfElseStatement06_Balance {
    public static void main(String[] args) {
       double balance = 120;
       int score = 8 ;

       if (score>= 8){
           balance += 50;
       }
        if (score >= 6){
            balance += 20;
        } else {
            balance -= 10;
        }

        System.out.println("balance = " + balance );
    }
}
