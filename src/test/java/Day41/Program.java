package Day41;

import Day42_Rewiew.Oven;

public class Program {
    public static void main(String[] args) {
        SadeKek sadeKek = new SadeKek();
        System.out.println("Default constructor ile olusturulan nesne ");

        System.out.println(sadeKek.name);// null
        System.out.println(sadeKek.kabartmaTozu);// 0
        System.out.println(sadeKek.seker);// 15
        System.out.println(sadeKek.un);// 100
        System.out.println(sadeKek.yag);// 35

        SadeKek sadeKek1 = new SadeKek("Sade Kek");
        SadeKek sadeKek2 = new SadeKek("Sadekek 123",100,35,30,1,5,1);
        SadeKek sadeKek3 = new SadeKek("Sadekek 123",100,35,30,1,5,1);
        SadeKek sadeKek4 = new SadeKek("Sadekek 123",100,35,30,1,5,1);
        SadeKek sadeKek5 = new SadeKek("Sadekek 123",100,35,30,1,5,1);
        SadeKek sadeKek6 = new SadeKek("Sadekek 123",100,35,30,1,5,1);

        System.out.println("Parametreli constructor ile olusturulan nesne ");
        System.out.println(sadeKek1.name);// Sade Kek
        System.out.println(sadeKek1.kabartmaTozu);// 0
        System.out.println(sadeKek1.seker);// 0
        System.out.println(sadeKek1.un);// 0
        System.out.println(sadeKek1.yag);// 0

        sadeKek.sadekek(); // Nesnenin methodu

        Oven firin = new Oven();
        firin.temparature = 180;
        firin.timer = 35;
        firin.tepsi.add(sadeKek3);
        firin.cook(180,35);

        firin.tepsideNevar();
    }
}
