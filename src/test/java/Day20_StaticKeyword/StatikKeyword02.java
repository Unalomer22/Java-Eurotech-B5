package Day20_StaticKeyword;

public class StatikKeyword02 {
    public static void main(String[] args) {
        // Statik olanlara sadece class ismi kullanilarak ulasabilirsiniz.
        System.out.println("StatikKeyword01.gender = " + StatikKeyword01.gender);// Erkek
        System.out.println(StatikKeyword01.k);// 0

        // Instance olanlara ulasmak icin object uretmek zorundayiz
        StatikKeyword01 obj1 = new StatikKeyword01();
        System.out.println(obj1.i);// 0
        System.out.println(obj1.name);// Ali

        // Statik olanlara object uzerinden ulasabiliriz AMA Tavsiye edilmez
        System.out.println(obj1.gender);// Erkek
        System.out.println(obj1.k);// 0

    }
}
