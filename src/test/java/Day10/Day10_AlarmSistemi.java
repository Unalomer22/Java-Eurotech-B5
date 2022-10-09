package Day10;

public class Day10_AlarmSistemi {
    public static void main(String[] args) {

 System.out.println("Alarm sistemi");

    boolean kapi1 = false;
    boolean kapi2 = false;
    boolean pencere1 = false;
    boolean pencere2 = true;

    boolean alarmTetiklendi = false;

    alarmTetiklendi =(kapi1 || kapi2 || pencere1 || pencere2);

        System.out.println("Alarm Tetiklendi = " + alarmTetiklendi);



}


}
