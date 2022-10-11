package Day61_ErrorHandling_Exeptions;

public class ExceptionSample2 {

    public static void main(String[] args) {

        // Step 1 : exception alma
//        System.out.println("Hi class ");
//
//        String a=null;
//
//       // System.out.println(a.substring(0,1));
//
//        System.out.println("By class"); // öncesinde exception olduğu için consolda yazılmadı


        //Step 2 : Try Catch

//        System.out.println("Hi class- Before exception");
//
//        try {
//
//            System.out.println(1/(1-1));  // exception beklediğimiz kodu try bloke içine yazdık
//        }catch (Exception e){   //=>  beklenen muhtemel exception olarak ilgili class ismi ile bir parametre girdik
//            System.out.println("Sıfıra Bölündü, TEST FAILED !!"); // exception olması durumunda istediğimiz mesajı yazdık
//        }
//        System.out.println("By class- After exception");


        //Step 3 : Try Catch bloke içinde hata yoksa- catch içine uğramaz-mesaj görülmez

//        System.out.println("Hi class- Before exception");
//
//        try {
//
//        //    System.out.println(1/(1-1));  // exception beklediğimiz kodu try bloke içine yazdık
//            System.out.println("Try block içi exception cod altı");
//
//
//        }catch (Exception e){   //=>  beklenen muhtemel exception olarak ilgili class ismi ile bir parametre girdik
//            System.out.println("Sıfıra Bölündü, TEST FAILED !!"); // exception olması durumunda istediğimiz mesajı yazdık
//        }
//        System.out.println("By class- After exception");

        //***************

        //Step 4 : 2 Catch bloke ve finally eklendi - catch blocklar arasında hiyerarşiye uyum zorunlu

//        System.out.println("Hi class- Before exception");
//
//        try {
//
//            System.out.println(1/(1-1));
//            //System.out.println("Try block içi exception cod altı");
//
//        }catch (NullPointerException n){
//            System.out.println("NullPointer Exception CATCH BLOCK!");
//
//        }catch (Exception e){
//            System.out.println("Sıfıra Bölündü, TEST FAILED !!");
//            System.out.println("Exception genel CATCH BLOCK");
//
//        } finally {
//            System.out.println("FINALLY BLOCK ICI!!!");
//        }
//        System.out.println("By class- After exception");

//******************

//        //Step 5 : Finally block her halukarda çalışır
//
//        System.out.println("Hi class- Before exception");
//
//        try {
//
//            System.out.println(1/(1-1));
//           // System.out.println("Try block içi exception cod altı");
//
//        }catch (NullPointerException n){
//            System.out.println("NullPointer Exception CATCH BLOCK!");
//
//        }catch (Exception e){
//            System.out.println("Sıfıra Bölündü, TEST FAILED !!");
//            System.out.println("Exception genel CATCH BLOCK");
//
//        } finally {
//            System.out.println("FINALLY BLOCK ICI!!!");
//        }
//        System.out.println("By class- After exception");

//******************

        //Step 6 : try içinde bulunan exception catch block dışı bir exception ise
        // Bu durumda catch block lardan hiçbiri hatayı yakalayamaz

//        System.out.println("Hi class- Before exception");
//
//        try {
//             System.out.println("Try block içi ");
//            System.out.println(1/(1-1));
//
//
//        }catch (NullPointerException n){
//            System.out.println("NullPointer Exception CATCH BLOCK!");
//
//        }catch (ArrayIndexOutOfBoundsException arr){
//            System.out.println(" ArrayIndexOutOfBoundsException CATCH BLOCK, TEST FAILED !!");
//
//
//        } finally {
//            System.out.println("FINALLY BLOCK ICI!!!");
//        }
//        System.out.println("By class- After exception");

        // önce try block içi ni yadırdı, hatayı yakalayamadı, finally block u yazdırdı -> exception hatası verdi



        //**************

        //Step 7 : try içinde birden fazla test var

//        System.out.println("Hi class- Before exception");
//
//        try {
//            String test=null;
//            //Test 1
//            System.out.println("Test 1");
//            //Test 2
//            System.out.println("Test 2" + test.substring(0,1));
//            //Test 3
//            System.out.println("Test 3");
//
//        }catch (Exception e) {
//            System.out.println("CATCH BLOCK içi");
//
//        } finally {
//            System.out.println("FINALLY BLOCK ICI!!!");
//        }
//        System.out.println("By class- After exception");

        //***************

        //Step 8 :e.printStackTrace();

//        System.out.println("Hi class- Before exception");
//
//        try {
//            String test=null;
//            //Test 1
//            System.out.println("Test 1");
//            //Test 2
//            System.out.println("Test 2" + test.substring(0,1));
//            //Test 3
//            System.out.println("Test 3");
//
//        }catch (Exception e) {   // Eğer catch içinde Exception yazılır ise altındaki Herşeyi Handle edebilir,
        // bu durum biz yanıltabilir-> gelecek olan exception sub classlarından
        //herhangi biri olabileceği için hangi exception beklentisi varsa onun tercih edilmesi lazım.
//            e.printStackTrace();
//            System.out.println("CATCH BLOCK içi");
//
//        } finally {
//            System.out.println("FINALLY BLOCK ICI!!!");
//        }
//        System.out.println("By class- After exception");

// önce kodu yazdırdı-> catch block un yakaladığı hatayı en sonda verdi, başında exception yok, exit code 0 olarak tamamladı


        //***************

        //Step 9 :Testleri koşarken 2 farklı test hata verirse ne yapmalıyız ?

        System.out.println("Hi class- Before exception");

        try {
            String test=null;
            //Test 1
            System.out.println("Test 1");
            //Test 2
            System.out.println("Test 2" + test.substring(0,1));
            //Test 3 -- UI ELEMENT LOCATE
            System.out.println(1/(1-1));

        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("DATA NULL geliyor, Kontrol Et!!");
            System.out.println("Test Failed");

        } catch (ArithmeticException e){
            System.out.println("UI daki ELEMENTTE Sorun var, Kontrol Et!!");
            System.out.println("Test Failed");
        }
        System.out.println("By class- After exception");



    }




}

