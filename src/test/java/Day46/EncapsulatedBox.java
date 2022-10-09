package Day46;

public class EncapsulatedBox {
    private int en;
    private int boy;
    private int yukseklik;
    private int hacim;

    EncapsulatedBox(){
        en = 1;
        boy = 1;
        yukseklik = 1;
    }
    EncapsulatedBox (int en, int boy, int yukseklik){
        this.en = en;
        this.boy = boy;
        this.yukseklik= yukseklik;
    }
    public void degerataEn(int yeniDeger){// setter methodu ile ayni islevi yapar
        this.en = yeniDeger;
    }
    public int degerokuEn(){
        return this.en;
    }

    public int getEn(){
        deneme();
        return this.en;
    }
    public void setEn(int en){
        this.en = en;
    }
    public int getBoy(){
        return this.boy;
    }
    public void setBoy(int boy){
        this.boy = boy;
    }
    public int getYukseklik(){
        return this.yukseklik;
    }
    public void setYukseklik(int yukseklik){
        this.yukseklik = yukseklik;
    }
    private void deneme(){
        System.out.println("Bu methoda yalniz Class icinden erisilebilir");
    }
    private void hacimHesap(){
        hacim = this.en*this.boy*this.yukseklik;
    }
    public int getHacim(){
        hacimHesap();
        return hacim;
    }
}
