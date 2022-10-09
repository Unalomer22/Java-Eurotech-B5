package Day42_Rewiew;

public class MethodChaining {
    public static String buyukHarfeCevir(String a){
        a = a.trim();
        a = (a.toLowerCase().replace(a.charAt(0),a.toUpperCase().charAt(0)));
        return a;
    }
    public static void main(String[] args) {
        String a = "meHMEt";
        char b;
        a = a.toUpperCase();
        b = a.charAt(0);
        a = a.toLowerCase();
        a = a.replace(a.charAt(0),b);
        System.out.println(a);// MehMet

        //Method chaining
        System.out.println(a.toLowerCase().replace(a.charAt(0),a.toUpperCase().charAt(0)));// mehmet

        System.out.println(a.toUpperCase().substring(0,1).concat(a.toLowerCase().substring(1)));// Mehmet

        System.out.println(a.toUpperCase().charAt(0));// M

        System.out.println(a.replace(a.charAt(0), '6'));//6eh6et

        a= a.toLowerCase().replace(a.charAt(3),'c');
        System.out.println(a);// mehmet

        System.out.println(buyukHarfeCevir(" merhmba"));// MerhMba

    }
}
