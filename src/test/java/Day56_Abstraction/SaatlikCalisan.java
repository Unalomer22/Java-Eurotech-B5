package Day56_Abstraction;

public class SaatlikCalisan extends Calisan{
    /* Base sinifa tasidik
     int id;// Calisanlarin numarasi sicil
    String firstName;
    String lastName;
     */
    double saatUcreti;
    int toplamCalismaSaati;
/* Base sinifa tasidik
 public String tamAdi(){
        return firstName + " "+lastName;
    }
 */
    public double aylikMaas(){
        return saatUcreti * toplamCalismaSaati;
    }

}
