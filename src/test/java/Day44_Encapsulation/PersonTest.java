package Day44_Encapsulation;

public class PersonTest {
public static void main(String[] args){

    Person person = new Person();
    //person.name = "Mehmet";
    //person.age = 40;

    person.setName("Mehmet");
    person.setAge(40);

    person.print();

    System.out.println(person.getName());
    System.out.println(person.getAge());

    System.out.println();

    Person person2 = new Person();
    // person2.name = "Ayse";
    //person2.age = -30;

    person2.print();

    person2.setName("Ayse");
    person2.setAge(-30);

    System.out.println(person2.getName());
    System.out.println(person2.getAge());

}
}
