package Day38_Rewiew;

public class Array2 {
/*
Write a method that accepts an array and check the lenght of the array first.
Bir diziyi kabul eden bir yöntem yazın ve önce dizinin uzunluğunu kontrol edin. Ilk ve son
elemanlari ayni ise true, degilse false dondursun
If the
    int [] x = {1,2,3};// false
    int [] y = {1,2,3,1};// true
    int [] z = {1,2,1};// true
    int [] k = {1}; not a valid(gecerli) array(dizi) ==> geçerli bir dizi değil

 */
    public static void main(String[] args) {
        int [] x = {1,2,3};
        System.out.println(firstLastEqual(x));//false

        int [] y = {1,2,3,1};
        String result = firstLastEqual(y);
        System.out.println(result);// true

        int [] z = {1,2,1};
        System.out.println(firstLastEqual(z));// true
        Boolean b1 = new Boolean(firstLastEqual(z));// ikinci bir yontem olarak da boolean wrapper methodu kullanabiliriz
        System.out.println("b1 = " + b1);

        int [] k = {1};
        System.out.println(firstLastEqual(k));// not a valid array
    }

    public static String firstLastEqual(int[] arr) {
        if (!(arr.length>1)){
            return "not a valid array";
        }
        if (arr[0]== arr[arr.length-1]){
            return "true";
        }else {
            return "false";
        }
    }
}