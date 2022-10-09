package Day35;

public class TelRehber {
    public static class Person{
        String firstName;
        String lastName;
        int phone;

        private static void displayHeader(){
            System.out.println("First Name\tLast Name\tPhone");
            System.out.println("----------\t---------\t-----");
        }
        public static void telListe(Person[] liste){
            System.out.println("Rehberimdeki kişileri liste halinde ekrana yazar.");
            displayHeader();

            for (int i = 0; i < liste.length; i++) {
                if (liste[i] == null) continue;
                System.out.print(liste[i].firstName + "\t");
                System.out.print(liste[i].lastName +"\t\t");
                System.out.print(liste[i].phone);
                System.out.println();
            }
        }
        public static void  findByName(Person[] liste, String kisi){
            System.out.println("İsimden arama yapar.Bulduğu sonucu ekrana yazar.");
            displayHeader();

            for (int i = 0; i < liste.length; i++) {
                if (liste[i] == null) continue;
                if (liste[i].firstName.equals(kisi)){
                    System.out.print(liste[i].firstName + "\t");
                    System.out.print(liste[i].lastName +"\t\t");
                    System.out.print(liste[i].phone);
                    System.out.println();
                }
            }
        }
        public static void  findByLastName(Person[] liste, String kisi){
            System.out.println("İsimden arama yapar.Bulduğu sonucu ekrana yazar.");
        }
    }

    public static void main(String[] args) {

        Person[] rehberim = new Person[10];
        rehberim[0] = new Person();
        rehberim[0].firstName ="Mustafa";
        rehberim[0].lastName = "Can";
        rehberim[0].phone = 509456;

        rehberim[1] = new Person();
        rehberim[1].firstName ="Ali";
        rehberim[1].lastName = "Smith";
        rehberim[1].phone = 12509456;

        rehberim[2] = new Person();
        rehberim[2].firstName ="Mustafa";
        rehberim[2].lastName = "Smith";
        rehberim[2].phone = 125088456;

        Person.telListe(rehberim);
        Person.findByName(rehberim,"Mustafa");
    }
}
