package Day43;

public class ConstructorChain {

    public ConstructorChain(){
        System.out.println("default constructor called");
    }

    public ConstructorChain(String a){
        this();
        System.out.println(a);

    }
    ConstructorChain(String a, int b){
        this("abc");
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
         ConstructorChain abcConstructor = new ConstructorChain();
         ConstructorChain abcConstructor1 = new ConstructorChain("Merhaba");

         ConstructorChain abc1 = new ConstructorChain("Ahmet",5);
    }




}
