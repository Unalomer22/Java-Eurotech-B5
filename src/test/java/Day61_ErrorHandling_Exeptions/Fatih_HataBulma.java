package Day61_ErrorHandling_Exeptions;

public class Fatih_HataBulma {
    public static void main(String[] args) {
        // Compile-Time error
        //int a
        // int x="abx";
        //   int y=10,
        //String s=15;
        //byte b=10.5;

//Run-Time error

//        System.out.println("**** First Line  ****");
//
//        System.out.println(1/0);
//
//        System.out.println("**** Last Line  ****");

        // ****** ArithmeticException  ********

        System.out.println(1/0);

        //******* StringIndexOutOfBoundsException *********
        String str="";
        // System.out.println(str.substring(0,2));


        //******* ArrayIndexOutOfBoundsException *********
        String [] strArray={"test"};

        //System.out.println("strArray[0] = " + strArray[0]);
        //System.out.println("strArray[0] = " + strArray[1]);

        //******** NullPointerException   ***********

        String [] strArray2=null;

        //System.out.println("strArray2[0] = " + strArray2[0]);


        //********* NumberFormatException  **********

        // System.out.println(Integer.valueOf("ABC"));


        //*********

        //throw new LinkageError(); created manualy error !!;

    }
    }

