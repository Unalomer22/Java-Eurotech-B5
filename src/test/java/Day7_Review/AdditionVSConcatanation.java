package Day7_Review;

public class AdditionVSConcatanation {

    public static void main(String[] args) {

        // (+) operatorin farkli kullanimlari
        // Number + Number = Addition
        System.out.println(10 + 5);

        // Number + String = Concatanation
        System.out.println(40 + " yasinda");

        // String + Boolean = Concatanation
        System.out.println("Senin adin " + false);

        // String + String = Concatanation
        System.out.println("Hello " + "World");

        // Number + Boolean = error
        //System.out.println(10 + true);

        // Number + String + Boolean = error yatistirildi
        System.out.println(10 + "SSS" + true);

        // String + Number + Number
        System.out.println("EurotechStudy " + 5 + 4);

        // String + (Number + Number)
        System.out.println("EurotechStudy " + (5 + 4));

        // Number + Number + String
        System.out.println(5 + 4 + " EurotechStudy");

        // Number + Number + String + Number + Number
        System.out.println(5 + 4 + " EurotechStudy" + 5 + 4);

        System.out.println(5 + 4 + " EurotechStudy " + (5 + 4));

        // String + Number + Number
        // Carpma islemi precedence dan dolayi compiler tarafindan oncelikli islenip daha sonra concatanation uygulaniyor
        System.out.println("EurotechStudy " + 5 * 4);

        // String + Number + Number
        // Ancak cikarma islemi toplamaya gore oncelikli olmadigi icin artihmetic olarak islme alinmiyor
        // Compiler String "-" operatorunu islem olarak tanimlayamayip hataya dusuyor
        //System.out.println("EurotechStudy " + 5 - 4);

    }



}
