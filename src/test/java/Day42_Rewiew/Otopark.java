package Day42_Rewiew;

import java.util.ArrayList;

public class Otopark {
    String name;
    String  adress ;
    int capacity;
    int emptyCapacity = 0;

    ArrayList<Araba> parkArea = new ArrayList<>();

    public void otoparkaGiris(Araba araba){
        for (Araba araba1: parkArea) {
            if (araba1.plateNumber.equals(araba.plateNumber)){
                System.out.println("Bu plakali arac otoparkta var. Bu yuzden giris yapamazsiniz!");
                return;
            }
        }
        parkArea.add(araba);
        System.out.println(araba.marka + " otoparka giris yapti");
    }

    public void otoparkCikis(Araba araba){
        parkArea.remove(araba);
        System.out.println(araba.marka + " otoparktan cikis yapti");
    }

    public void searchByPlateNumber(String plaka){
        for(Araba araba : parkArea){

            if(araba.plateNumber.equals(plaka)){
                System.out.println(plaka+ " arac otoparkta. Bilgileri asagidadir");
                System.out.println("----------------------------------");
                System.out.println(araba.toString());
                return;
            }
        }
        System.out.println("Bu arac otoparkta degil!");
    }
    public void otoparkAracListe(){
        System.out.println("Otoparktaki araclarin listesi");
        System.out.println("Arac Markasi\tPlakasi");
        System.out.println("------------\t-------");
        for(Araba araba : parkArea){
            System.out.println( araba.marka +"\t\t\t"+ araba.plateNumber);
        }
    }

    public void bosAracKapasite(){
        this.emptyCapacity = this.capacity - parkArea.size();// parkArea.size()= arac sayisi demek
        System.out.println();
        System.out.println("Otoparkta "+this.emptyCapacity + " araclik bos alan var.");
    }


}
