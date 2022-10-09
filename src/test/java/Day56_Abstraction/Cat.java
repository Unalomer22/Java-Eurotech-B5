package Day56_Abstraction;

public class Cat extends Animal{
    /*
    public String name;
    public String color;
*/
    @Override
    public void createSound(){
        System.out.println(this.name + " miyavliyor");
    }
    @Override
    public void sleep(){
        System.out.println(this.name + " Su an uyuyor..Zzzzz");
    }
    /*
    This method has already implemented in Base Class
    public String printInfo(){
        return "My name is : " + this.name + " "+ "My color is : " + this.color;
    }
    */

}
