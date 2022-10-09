package Day56_Abstraction;

public class AbstractClassHesaplamaProg {

    public static void main(String[] args) {
        Toplama topla = new Toplama();
        topla.hesapla(10,25);

        Cikartma cikart = new Cikartma();
        cikart.hesapla(34,6);

        Carpma carp = new Carpma();
        carp.hesapla(23,56);
    }



}
