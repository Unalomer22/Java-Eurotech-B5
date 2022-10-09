package odevler;

public class Task7 {
    public static void main(String[] args) {

        timeStamp();

    }

    public static void timeStamp() {

        String date = "30/12/2021 17:35:00";
        System.out.println(date.replace("/", "").replace(" ", "").replace(":", ""));

    }
}
