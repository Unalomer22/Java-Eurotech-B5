package Day34;

public class Quiz2 {
    public static void main(String[] args) {

        //Question 3
        int k=0;
        int m=0;


        System.out.println("Question 3");
        for (int i = 0; i <=3 ; i++) {
            k++;
            if (i==2){
                i=4;
            }
            m++;

        }
        System.out.println(k + "," + m);


        //Question 4
        System.out.println("Question 4");
        int sum=0;
        for (int i = 0; i < 10; i++) {
            if (i%3==0){
                sum=sum+i;
            }

        }
        System.out.println("sum = " + sum);

        //Question 5
        System.out.println("Question 5");

        for (int count = 1; count <=10 ; count++) {
            System.out.println(count + " -Welcome to java");

        }

        //Question 6
        System.out.println("Question 6");

        for (int i = 0; i <=9 ; i++) {
            System.out.println(i);
        }
    }
}
