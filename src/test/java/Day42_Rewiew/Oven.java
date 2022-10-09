package Day42_Rewiew;

import Day41.SadeKek;

import java.util.ArrayList;

public class Oven {
    public int temparature;
    public int timer;

    public ArrayList<SadeKek> tepsi = new ArrayList<>();

    public void cook (int temparature, int timer){
        this.temparature = temparature;
        this.timer = timer;

        System.out.println("Kek pisiriliyor...");

    }
    public void tepsideNevar (){
        for (SadeKek kek : tepsi)
            System.out.println(kek.name);
    }





}
