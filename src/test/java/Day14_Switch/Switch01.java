package Day14_Switch;

public class Switch01 {
    public static void main(String[] args) {
        int sayi = 8;

        switch (sayi){
            case 5:
                System.out.println(" Sayi bestir");
                break ;
            case 6:
                System.out.println(" Sayi alti dir");
                break;

            default:
                System.out.println(" Sayi 5 ve 6 nin disindadir");
        }


        System.out.println(" if else ile cozum");

        if ( sayi==5){
            System.out.println(" Sayi bes tir");
        }else if ( sayi == 6){
            System.out.println(" Sayi alti dir");
        }else{
            System.out.println(" Sayi 5 ve 6 nin disindadir");
        }
    }


    }



