package Day50_Overriding;

public class Animal {

    public void ses() { // overriden method
        System.out.println("Hayvanlar ses cikarir");
    }

    protected int add(){
        return 3+4;
    }
    public Integer multiply(){
        return 3*4;
    }
    public Animal create(){
        return  new Animal();
    }
    public void eat(){
        System.out.println("Yerler");
    }
}
