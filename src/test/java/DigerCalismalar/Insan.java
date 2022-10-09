package DigerCalismalar;

public class Insan {
    /*
    Bir insan classi olusturun bu classda boy(cm) ve kilo olucak sekilde 2 degisken tutun
    Bu degiskenlerin mevcut oldugu ve mevcut olmadigi 2 farkli constructor olusturun
    Degiskenlerin getter ve setterlarini olusturun
    Degiskenleri bir farkli class daha olusturup orda okuyun

    Kullanicidan gelen verileri ilgili degiskenlere atayin ve boy kutle endeksini bulun

     */
    private int boy;
    private int kilo;

    public int getBoy(){
        return this.boy;
    }
    public void setBoy(int boy){
        this.boy= boy;
    }
    public int getKilo(){
        return this.kilo;
    }

    public void setKilo(int kilo){
        this.kilo = kilo;
    }
    public Insan (int boy, int kilo){
        this.boy=boy;
        this.kilo= kilo;
    }
    public Insan(){

    }
}
