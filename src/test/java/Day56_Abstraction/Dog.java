package Day56_Abstraction;

public class Dog extends Animal {
   /* Miras aldigi siniftan gelen propertiler
    public String name;
    public String color;
*/
    @Override
    public void createSound(){
        System.out.println(this.name + " havliyor");
    }
    @Override
    public void sleep(){
        System.out.println(this.name + " uyuyor..Zzzzz");
    }

    /* This method has already implemented in Base Class
    @Override
    public String printInfo(){
        return "My name is : " + this.name + " "+ "My color is : " + this.color;
    }

     */
}
