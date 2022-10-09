package Day41;

public class SadeKek { // Sade Kek tarifi
    public String name;
    int un;
    int seker;
    int yag;
    int yumurta;
    int kabartmaTozu;
    int sut;

    SadeKek(){
        System.out.println("Nesne olustu!");
        un = 100;
        seker = 15;
        yag = 35;
    }

    public SadeKek(String name, int un, int seker, int yag, int yumurta, int kabartmaTozu, int sut) {
        this.name = name;
        this.un = un;
        this.seker = seker;
        this.yag = yag;
        this.yumurta = yumurta;
        this.kabartmaTozu = kabartmaTozu;
        this.sut = sut;
    }

    SadeKek(String name){
        this.name = name;
    }
    public void sadekek (){
        System.out.println("Nesne nin Methodu");
    }




}
