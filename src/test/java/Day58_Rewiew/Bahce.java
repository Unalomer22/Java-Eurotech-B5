package Day58_Rewiew;

public class Bahce {
    private String zemin;
    private String cit;
    private String mangal;
    private boolean havuzVarmi;

    public void sula(){
        System.out.println("Bahce sulaniyor...");
    }

    public Bahce(String zemin, String cit, String mangal, boolean havuzVarmi) {
        this.zemin = zemin;
        this.cit = cit;
        this.mangal = mangal;
        this.havuzVarmi = havuzVarmi;
    }

    public String getZemin() {
        return zemin;
    }

    public String getCit() {
        return cit;
    }

    public String getMangal() {
        return mangal;
    }

    public boolean isHavuzVarmi() {
        return havuzVarmi;
    }
}
