package DigerCalismalar;

public class InsanBoyKutle {
    /*

    Bir insan classi olusturun bu classda boy(cm) ve kilo olucak sekilde 2 degisken tutun
    Bu degiskenlerin mevcut oldugu ve mevcut olmadigi 2 farkli constructor olusturun
    Degiskenlerin getter ve setterlarini olusturun
    Degiskenleri bir farkli class daha olusturup orda okuyun

    Kullanicidan gelen verileri ilgili degiskenlere atayin ve boy kutle endeksini bulun


     */
    int boy;
    int kilo;

    public InsanBoyKutle(int boy, int kilo) {
        this.boy = boy;
        this.kilo = kilo;
    }

    public InsanBoyKutle() {
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }
}
