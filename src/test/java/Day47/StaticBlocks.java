package Day47;

public class StaticBlocks {
    static int number;
    static String name;

    static {
        System.out.println("En üstteki en önce calisir");
    }

    static {
        number = 15;
        name = "Hayir Sever";
        System.out.println("Static block has executed");

        System.out.println("number in static block = " + number);
        System.out.println("name in static block = " + name);
    }
    static {
        number = 12;
        name = "Evet Sever";
        System.out.println("2. kez Static block has executed");
        System.out.println("number in static block = " + number);
        System.out.println("name in static block = " + name);

    }
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);

        if(args[0] == "a"){
            System.out.println(" a parametresi cagrildi");
        }
        if(args[1] == "b"){
            System.out.println(" a parametresi cagrildi");
        }
        System.out.println("Main method executed");

        number = 45;
        name = "Ahmet Falanca";

        System.out.println("number in main method = " + number);
        System.out.println("name in main method = " + name);



    }

}
