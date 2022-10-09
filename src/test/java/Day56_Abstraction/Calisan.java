package Day56_Abstraction;

public abstract class Calisan {

    int id;// Calisanlarin numarasi sicil
    String firstName;
    String ikinciAd = "";
    String lastName;

    public String tamAdi(){
        return firstName +" "+ ikinciAd + " "+lastName;
    }
    public abstract double aylikMaas();

}
