package Day35;

public class TelRehberTekrar {
    public static class Person {
        String firstName;
        String lastName;
        int phone;

        private static void displayHeader(){
            System.out.println("First Name\tLast Name\t\tPhone");
            System.out.println("----------\t---------\t\t-----");
        }
        private static void telListe(Person[] liste) {
            System.out.println("Rehberimdeki kisileri liste halinde ekrana yazar.");

            displayHeader();
            for (int i = 0; i < liste.length; i++) {
                if (liste[i] == null) continue;
                System.out.print(liste[i].firstName + "\t\t ");
                System.out.print(liste[i].lastName + "\t\t\t");
                System.out.print(liste[i].phone);
                System.out.println();
            }
        }
        public static void findByName(Person[] liste, String kisi) {
            System.out.println("Isimden arama yapar. Buldugu sonucu ekrana yazar.");
            displayHeader();
            for (int i = 0; i < liste.length; i++) {
                if (liste[i] == null) continue;
                if (liste[i].firstName.equals(kisi)) {
                    System.out.print(liste[i].firstName + "\t\t ");
                    System.out.print(liste[i].lastName + "\t\t\t");
                    System.out.print(liste[i].phone);
                    System.out.println();
                }
            }
            }
            public static void findByLastName (Person[] liste, String kisi){
                System.out.println("Soyisimden arama yapar. Buldugu sonucu ekrana yazar.");
                displayHeader();
                for (int i = 0; i < liste.length; i++) {
                    if (liste[i] == null) continue;
                    if (liste[i].lastName.equals(kisi)) {
                        System.out.print(liste[i].firstName + "\t\t ");
                        System.out.print(liste[i].lastName + "\t\t\t");
                        System.out.print(liste[i].phone);
                        System.out.println();
                    }
                }
            }

        public static void main(String[] args) {
            Person[] rehberim = new Person[10];
            rehberim[0] = new Person();
            rehberim[0].firstName = "Mustafa";
            rehberim[0].lastName = "Can";
            rehberim[0].phone = 509456;

            rehberim[1] = new Person();
            rehberim[1].firstName = "John ";
            rehberim[1].lastName = "Smith";
            rehberim[1].phone = 12509456;

            rehberim[2] = new Person();
            rehberim[2].firstName = "Mustafa";
            rehberim[2].lastName = "Smith";
            rehberim[2].phone = 67509456;

            Person.telListe(rehberim);
            Person.findByName(rehberim, "Mustafa");
            Person.findByLastName(rehberim,"Can");

        }
    }
}