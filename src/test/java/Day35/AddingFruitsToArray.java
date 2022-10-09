package Day35;

public class AddingFruitsToArray {
    public static class BenimVeriTipim{
        int say;
        String firstName;
        String lastName;
        boolean isMarried;
        int dateOfBirthYear;
    }
    public static void  benimVeriGoster(BenimVeriTipim[] benimV){
        System.out.println("Metodun içindeyim..");
        for (int i = 0; i < benimV.length; i++) {
            System.out.print(benimV[i].firstName + " ");
            System.out.println(benimV[i].lastName);
            System.out.println(benimV[i].isMarried);
            System.out.println(benimV[i].dateOfBirthYear);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] meyvelerYaz = new String[3];
        String[] meyvelerKis = new String[3];
        int[] sayilar = new int[3];

        BenimVeriTipim[] benimverim = new BenimVeriTipim[2];

        benimverim[0] = new BenimVeriTipim();
        benimverim[0].firstName = "Ahmet";
        benimverim[0].lastName ="Falanca";
        benimverim[0].isMarried = true;
        benimverim[0].dateOfBirthYear = 2005;

        benimverim[1] = new BenimVeriTipim();
        benimverim[1].firstName = "Mehmet";
        benimverim[1].lastName ="Can";
        benimverim[1].isMarried = false;
        benimverim[1].dateOfBirthYear = 1997;

        sayilar[0]=1;
        sayilar[1]=5;
        sayilar[2]=45;

        meyvelerYaz[0] = "Elma";
        meyvelerYaz[1] = "Kavun";
        meyvelerYaz[2] = "Mango";

        String kisMeyve1 = "Portakal";
        String kisMeyve2 = "Mandalina";
        String kisMeyve3 = "Nar";

        meyvelerKis[0]=kisMeyve1;
        meyvelerKis[1]=kisMeyve2;
        meyvelerKis[2]=kisMeyve3;

        System.out.println("Yaz meyveler");

        for (int i = 0; i < meyvelerYaz.length; i++) {
            System.out.println(meyvelerYaz[i]);
        }
        System.out.println();
        System.out.println("Kış meyveleri");

        for (int j = 0; j < meyvelerKis.length; j++) {
            System.out.println(meyvelerKis[j]);
        }

        System.out.println();
        System.out.println("Benim veri tipim");
        //Method call

        benimVeriGoster(benimverim);

    }
}
