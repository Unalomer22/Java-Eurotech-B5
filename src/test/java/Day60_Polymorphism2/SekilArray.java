package Day60_Polymorphism2;

import java.util.ArrayList;
import java.util.List;

public class SekilArray {
    public static void main(String[] args) {

        Sekil[] sekiller = new Sekil[3];
        sekiller[0] = new Kare();
        sekiller[1] = new Ucgen();
        sekiller[2] = new Daire();


        for(Sekil sekil: sekiller){
            System.out.println(sekil.getClass().getName());
            sekil.ciz();
        }
        System.out.println("--------------------");
        List<Sekil> sekilList = new ArrayList<>();
        sekilList.add(new Kare());
        sekilList.add(new Ucgen());
        sekilList.add(new Daire());

        for (Sekil list: sekilList) {
            System.out.println(list.getClass().getSimpleName());
            list.ciz();
        }

    }
}
