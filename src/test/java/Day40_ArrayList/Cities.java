package Day40_ArrayList;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Virginia");
        cities.add("DC");
        cities.add("Baku");
        cities.add("Berlin");
        cities.add("Baku");

        System.out.println(cities.toString());// [London, Virginia, DC, Baku, Berlin, Baku]

        for(String  city : cities){ // for each methodu ile
            System.out.print(city + " "); // London Virginia DC Baku Berlin Baku
        }
        System.out.println();
        System.out.println("---------------");
        for ( int i = 0; i<cities.size(); i++){// .size elman sayisini verir
            System.out.print(cities.get(i)+ " "); // London Virginia DC Baku Berlin Baku
        }
        System.out.println();
        System.out.println("----------------");

        cities.remove("Baku");// ilk Baku yazisini siler
        System.out.println(cities.toString()); // [London, Virginia, DC, Berlin, Baku]

        System.out.println("-----------------");

        cities.add(0,"Istanbul");// 0.ci indekse Istanbul u ekledik
        System.out.println(cities.toString());// [Istanbul, London, Virginia, DC, Berlin, Baku]

        cities.add(cities.size(),"Istanbul");// Istanbul u en sona eklemek icin indey yerine "cities.size" yaziyoruz
        System.out.println(cities.toString()
        );
        int index = cities.indexOf("Berlin");// Verilen elemanin index numarasini bulmak icin
        System.out.println("Index : "+ index);// 4

        cities.clear();// Tum listeyi bosaltmak icin
        System.out.println(cities.isEmpty());// true
        System.out.println(cities.size());// 0
        System.out.println(cities.toString());// []

    }
}
