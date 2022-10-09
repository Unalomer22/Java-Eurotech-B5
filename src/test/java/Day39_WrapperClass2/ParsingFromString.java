package Day39_WrapperClass2;

public class ParsingFromString {

    public static void main(String[] args) {
        String stringNumber = "2022";
        System.out.println("stringNumber = " + stringNumber);// stringNumber = 2022

        int number = Integer.parseInt(stringNumber);// String i int a cevirmek icin
        int number2 = Integer.valueOf(stringNumber);// String i int a cevirmek icin

        System.out.println("number = " + number);// number = 2022
        System.out.println("number2 = " + number2);// number2 = 2022

        stringNumber = stringNumber + 5;
        number = number + 5;

        System.out.println("stringNumber = " + stringNumber);// stringNumber = 20225 ==> Concatanation yapti
        System.out.println("number = " + number);// number = 2027

        Double number3 = Double.parseDouble(stringNumber);// number = 2027
        System.out.println("number3 = " + number3);

        // NUMBER FORMAT EXEPTION
        /*
        String s= "2022A";
        int  number5 = Integer.parseInt(s);
        System.out.println("number5 = " + number5);
*/

    }
}
