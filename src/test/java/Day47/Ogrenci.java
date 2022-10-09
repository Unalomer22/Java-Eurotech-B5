package Day47;

public class Ogrenci {
    private static String okulAd= "Eurotech";
    static int number = 1000;
    private int ogrNumber;
    String ad;
    String soyad;

    Ogrenci(){
            number++;
            this.ogrNumber = number;
    }
    Ogrenci(String ad){
        nextNumber();
        this.ad = ad;
    }
    private void nextNumber(){
        number++;
       this.ogrNumber = number;

    }

    @Override
    public String toString() {
        return "Ogrenci{" + "Okul Adi = "+ okulAd +" "+
                "Ogrenci Number = "+ ogrNumber + " "+
                "ad= " + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
