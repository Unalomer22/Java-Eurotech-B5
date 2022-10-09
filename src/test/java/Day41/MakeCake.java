package Day41;

import javax.sound.sampled.Port;

public class MakeCake {
    public static void main(String[] args) {
        Cake sadeKek = new Cake();
        sadeKek.name = "Sade Kek" ;
        sadeKek.un = 100;
        sadeKek.seker = 30;
        sadeKek.yag = 35;
        sadeKek.kabartmaTozu = 5;
        sadeKek.sut = 1;
        sadeKek.yumurta = 1;

        SadeKek sadeKek1 = new SadeKek();
        sadeKek1.name = "Sade Kek";

        sadeKek1.un = 100;
        sadeKek1.seker = 30;
        sadeKek1.yag = 35;
        sadeKek1.kabartmaTozu = 5;
        sadeKek1.sut = 1;
        sadeKek1.yumurta = 1;

        PortakalliKek portakalliKek = new PortakalliKek();
        portakalliKek.name = "Portakalli Kek";
        portakalliKek.un = 100;
        portakalliKek.seker = 15;
        portakalliKek.yag = 35;
        portakalliKek.kabartmaTozu = 5;
        portakalliKek.sut = 1;
        portakalliKek.yumurta = 1;
        portakalliKek.portakal = 1;

        CevizliKek cevizliKek = new CevizliKek();
        cevizliKek.name = "Cevizli Kek";
        cevizliKek.un = 150;

        PortakalliCikolataliKek portakalliCikolataliKek = new PortakalliCikolataliKek();
        portakalliCikolataliKek.cikolata = 1;
        portakalliCikolataliKek.name = "Portakalli Cikolatali Kek";
        portakalliCikolataliKek.un = 10;

        System.out.println(portakalliKek.un);// 100
        System.out.println(portakalliCikolataliKek.un);// 10

        PortakalliKek portakalliKek1 = new PortakalliKek();
        portakalliKek1.name = "Portakalli Kek";
        portakalliKek1.un = 100;
        portakalliKek1.seker = 150;
        portakalliKek1.yag = 75;
        portakalliKek1.kabartmaTozu = 5;
        portakalliKek1.sut = 1;
        portakalliKek1.yumurta = 2;
        portakalliKek1.portakal = 1;




    }
}
