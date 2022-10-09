package Day35;

public class ArrayContactList {
    public static void main(String[] args) {
        Contact[] telRehber = new Contact[10];

        telRehber[0] = new Contact();
        telRehber[0].firstName = "Ahmet";
        telRehber[0].lastName = "Falanca";
        telRehber[0].telNumber = 1234567890;

        telRehber[1] = new Contact();
        telRehber[1].firstName = "Mehmet";
        telRehber[1].lastName = "Falanca";
        telRehber[1].telNumber = 212569893;

        telRehber[2] = new Contact();
        telRehber[2].firstName = "Ali";
        telRehber[2].lastName = "Can";
        telRehber[2].telNumber = 312469897;

        //Methods call
        Contact.contactList(telRehber);
        Contact.findContact(telRehber,1234567890);
        Contact.findContact(telRehber,"Ahmet","Falanca");
        Contact.findContact(telRehber,null,"Falanca");
        Contact.findContact(telRehber,"Mehmet",null);

    }

    public static class Contact {
        String firstName;
        String lastName;
        int telNumber;
        static int count = 0; //record count

        private static void displayHeader() {
            System.out.println("First Name  \tLast Name   \tPhone Number");
            System.out.println("------------\t------------\t------------");
        }

        private static void displayCount() {
            if (count == 0) {
                System.out.println(count + " number of record found.");
            } else if (count > 1) System.out.println(count + " numbers of records found.");
            else System.out.println(count + " number of record found.");
            count = 0;
            System.out.println();
        }

        public static String rightDoldur(String string, int length, String pad) {//Konsola fixed size değer yazmak için
            return string + pad.repeat(length - string.length());
        }

        public static void contactList(Contact[] contacts) {
            displayHeader();
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i] == null) continue; //dizide null obje varsa hata vermemek için döngüyü atlat
                System.out.println(rightDoldur(contacts[i].firstName, 12, " ") + "\t" + rightDoldur(contacts[i].lastName, 12, " ") + "\t" + contacts[i].telNumber);
                count++;
            }
            displayCount();
        }

        public static void findContact(Contact[] contacts, int telNum) {
            displayHeader();
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i] == null) continue; //dizide null obje varsa hata vermemek için döngüyü atlat
                if (contacts[i].telNumber == telNum) {
                    System.out.println(rightDoldur(contacts[i].firstName, 12, " ") + "\t" + rightDoldur(contacts[i].lastName, 12, " ") + "\t" + contacts[i].telNumber);
                    count++;
                }
            }
            displayCount();
        }

        public static void findContact(Contact[] contacts, String fName, String lName) {
            if ((fName != null && lName != null)) {
                displayHeader();
                for (int i = 0; i < contacts.length; i++) {
                    if (contacts[i] == null) continue; //dizide null obje varsa hata vermemek için döngüyü atlat
                    if ((contacts[i].firstName == fName) && (contacts[i].lastName == lName)) {
                        System.out.println(rightDoldur(contacts[i].firstName, 12, " ") + "\t" + rightDoldur(contacts[i].lastName, 12, " ") + "\t" + contacts[i].telNumber);
                        count++;
                    }
                }
            } else if (fName != null) {
                displayHeader();
                for (int i = 0; i < contacts.length; i++) {
                    if (contacts[i] == null) continue; //dizide null obje varsa hata vermemek için döngüyü atlat
                    if (contacts[i].firstName == fName) {
                        System.out.println(rightDoldur(contacts[i].firstName, 12, " ") + "\t" + rightDoldur(contacts[i].lastName, 12, " ") + "\t" + contacts[i].telNumber);
                        count++;
                    }
                }
            } else {
                displayHeader();
                for (int i = 0; i < contacts.length; i++) {
                    if (contacts[i] == null) continue; //dizide null obje varsa hata vermemek için döngüyü atlat
                    if (contacts[i].lastName == lName) {
                        System.out.println(rightDoldur(contacts[i].firstName, 12, " ") + "\t" + rightDoldur(contacts[i].lastName, 12, " ") + "\t" + contacts[i].telNumber);
                        count++;
                    }
                }
            }
            displayCount();
        }
    }
}
