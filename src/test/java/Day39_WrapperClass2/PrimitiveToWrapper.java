package Day39_WrapperClass2;

public class PrimitiveToWrapper {

    public static void main(String[] args) {

        int num = 5;
        double num2 = 5.35;
        boolean b = true;

        Integer obj1 = Integer.valueOf(num);
        Double obj2 = Double.valueOf(num2);
        Boolean obj3 = Boolean.valueOf(b);

        System.out.println("obj1 = " + obj1);// obj1 = 5
        System.out.println("obj2 = " + obj2);// obj2 = 5.35
        System.out.println("obj3 = " + obj3);// obj3 = true

        // 'instance of' operatörü
        if (obj1 instanceof Integer){
            System.out.println(obj1 + " is converted to wrapper Class object");// 5 is converted to wrapper Class object
        }else {
            System.out.println(obj1 + " is not converted to wrapper Class object");
        }

        /*
         if (obj2 instanceof Integer){ ===>> Türü farkli olan bir objeyi baska bir objede kullanamiyoruz
            System.out.println(obj2 + " is converted to wrapper Class object");
        }else {
            System.out.println(obj2 + " is not converted to wrapper Class object");
        }
         */

        if (obj2 instanceof Double){
            System.out.println(obj2 + " is converted to wrapper Class object");// 5.35 is converted to wrapper Class object
        }else {
            System.out.println(obj2 + " is not converted to wrapper Class object");
        }
        if (obj3 instanceof Boolean){
            System.out.println(obj3 + " is converted to wrapper Class object");// true is converted to wrapper Class object
        }else {
            System.out.println(obj3 + " is not converted to wrapper Class object");
        }
    }
}
