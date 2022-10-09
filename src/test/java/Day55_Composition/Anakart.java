package Day55_Composition;

import java.util.SimpleTimeZone;

public class Anakart {

    private String model;
    private String uretici;
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public Anakart(String model, String uretici, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.uretici = uretici;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }
    public void programYükle(String programIsmi){
        System.out.println(programIsmi +" isimli program yükleniyor");
    }
    public String getModel() {
        return model;
    }

    public String getUretici() {
        return uretici;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }
}
