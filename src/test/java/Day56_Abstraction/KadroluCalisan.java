package Day56_Abstraction;

public class KadroluCalisan extends Calisan{
/* Base sinifa tasidik
    int id;// Calisanlarin numarasi sicil
    String firstName;
    String lastName;
 */
    double yillikMaas;
/* Base sinifa tasidik
 public String tamAdi(){
        return firstName + " " + lastName;
    }
 */
    public double aylikMaas(){
        return yillikMaas/12;
    }
}
