package Day64_Collections_List;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FromFileToObject {

    public static ArrayList<Person> readByLine() throws FileNotFoundException {
        //  Person person = new Person();
        Scanner lineReader = new Scanner(new File("C:\\Employee\\Data.txt"));
        ArrayList<Person> persons = new  ArrayList<>();
        while (lineReader.hasNextLine())
        {
            Person person = new Person();

            String line = lineReader.nextLine();
            String[] attributes = line.split(",");

            person.createPerson(attributes);
            persons.add(person);

        }
        lineReader.close();
        return persons;

    }

    public static void main(String args[]) {
        try{
            //readByLine(person);
            for (Person eleman : readByLine() ) {
                // System.out.println(eleman.name + " " + eleman.city + " " + eleman.number);
                System.out.printf("%-15s%-10s%-10s%n",eleman.name,eleman.city,eleman.number);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
    }

}
