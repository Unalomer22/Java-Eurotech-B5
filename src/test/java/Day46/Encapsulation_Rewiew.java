package Day46;

public class Encapsulation_Rewiew {
    // Constructors and passing object to method
    // Encapsulation
    public static void main(String[] args) {

        Box kutu1 = new Box();
        System.out.println("kutu1.boy :" + kutu1.boy);// kutu1.boy :0 cunku default deger alir
        kutu1.boy = 10;
        kutu1.en = 5;
        kutu1.yukseklik = 3;

        System.out.println("kutu1 = " + kutu1);// kutu1 = Day46.Box@7a5d012c referans numarasini yazar
        System.out.println(kutu1.boy);// 10

        System.out.println("kutu1..: " + kutu1);// @Override yaptiktan sonra tüm parametleri yazar
                                                // kutu1..: Box{en=5, boy=10, yukseklik=3}
        System.out.println(kutu1.toString());// Box{en=5, boy=10, yukseklik=3}

        kutu1.displayInfo();// En .. 5 Boy .. 10 Yukseklik .. 3

        Box kutu2 = new Box(15,10,5);
        kutu2.displayInfo();// En .. 15 Boy .. 10 Yukseklik .. 5

        Box kutu3 = new Box();
        System.out.println(kutu3.toString());// Box{en=1, boy=1, yukseklik=1}
        System.out.println(kutu3);// Box{en=1, boy=1, yukseklik=1}

        Box kutu4 = new Box(kutu2);

        kutu2.displayInfo();// En .. 15 Boy .. 10 Yukseklik .. 5
        kutu4.displayInfo();// En .. 15 Boy .. 10 Yukseklik .. 5

        System.out.println(kutu2.equals(kutu4));// false

        kutu2=kutu4;
        boolean esitMi = (kutu2 == kutu4);

        System.out.println("esitMi ..: "+ esitMi);// true
        System.out.println("(kutu2 == kutu4) "+ (kutu2 == kutu4));// true

        System.out.println("kutu1.yukseklik = " + kutu1.yukseklik);// 3
        kutu1.addBox(kutu4);
        System.out.println("kutu1.yukseklik = " + kutu1.yukseklik);// 8
    }


}
