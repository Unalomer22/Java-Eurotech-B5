package Day32_String_Methods;

public class String_Contains {
    public static void main(String[] args) {

        String email = "test@mail.com";

        System.out.println( email.contains("@"));// true

        String liste = " domates, patates, sogan, havuc";
        if (liste.contains("muz")){
            System.out.println(" Urun listede mevcut");
        }else {
            System.out.println(" Urun listede mevcut degil");
        }

        boolean havucVarmı = liste.contains("havuc");
        System.out.println("havucVarmı = " + havucVarmı);// true

        boolean soganVarmı = liste.contains("sogan");
        System.out.println("soganVarmı = " + soganVarmı);//true

        boolean patatesVarmi = liste.contains("patates");
        System.out.println("patatesVarmi = " + patatesVarmi);// true

        boolean hiyarVarmi = liste.contains("hiyar");
        System.out.println("hiyarVarmi = " + hiyarVarmi);// false

    }
}
