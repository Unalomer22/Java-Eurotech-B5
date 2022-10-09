package Day53_FinalKeyword_MethodHiding;

public class FinalVariables {

    public final int MAX_SPEED = 320;
    //public final int MIN_CAPACITY;
    //MIN_CAPACITY = 1;
    public final int MAX_VELOCITY;
    public final int MAX_WEIGTH;

    public static final int MAX_HEIGHT = 180;
    public static final int MAX_VOLUME;


    public FinalVariables(){
        MAX_VELOCITY = 500;
    }

    /*
    public FinalVariables(int num){
        MAX_VELOCITY = num;
    }
     */

    {
        MAX_WEIGTH = 120;
    }

    static{
        MAX_VOLUME = 25;
    }


    public static void main(String[] args) {

        final int MAX_CAPACITY = 1000;
        //MAX_CAPACITY =2000;

        final double PI = 3.14;

        final int TCNO;
        TCNO = 124124114;
        //TCNO++;

        FinalVariables obj = new FinalVariables();
        System.out.println("Max Speed = " + obj.MAX_SPEED);
        System.out.println("Max Heigth = " + MAX_HEIGHT);
    }
}


