package Day60_Polymorphism2;

public class Sekil {


    public void ciz() {
        System.out.println("Sekil ciziyor");
    }

    public void sekilOlustur() {
        System.out.println("Sekil olusturuluyor");
    }
}

    class Kare extends Sekil{

        public void ciz(){
            System.out.println("Kare ciziyor");
        }
    }

    class Ucgen extends Sekil{

        public void ciz(){
            System.out.println("Ucgen ciziyor");
        }
    }
    class Daire extends Sekil{

        public void ciz(){
            System.out.println("Daire ciziyor");
        }
    }
class TestSekil{
    public static void main(String[] args) {
        Sekil sekil = new Sekil();
        sekil.ciz();
        sekil.sekilOlustur();

        Sekil sekil1 = new Kare();
        sekil1.ciz();
        sekil1.sekilOlustur();

        Sekil sekil2 = new Ucgen();
        sekil2.ciz();
        sekil2.sekilOlustur();

        Sekil sekil3 = new Daire();
        sekil3.ciz();
        sekil3.sekilOlustur();
        
    }
}


