package Day5;

public class OdevPrintln {

    public static void main(String[]args){
        String baslik;
        float itemOne, itemTwo, itemThree, itemFour, subTotal, indirim,totalAmount,cash;
        baslik = "LOVE,\t\tTAY PODCAST";
        itemOne = 23.50f;
        itemTwo = 3.21f;
        itemThree = 67.98f;
        itemFour = 12.39f;
        indirim = 15f;
        cash = 105f;

        subTotal = itemOne + itemTwo + itemThree + itemFour;

        totalAmount = subTotal - indirim;

        //System.out.println("LOVE,\t\tTAY PODCAST");
        System.out.println(baslik);
        System.out.println("----------------------");
        System.out.println();
        System.out.println();
        System.out.println("ITEM ONE\t\t" + itemOne);
        System.out.println();
        System.out.println("ITEM TWO\t\t" + itemTwo);
        System.out.println("");
        System.out.println("ITEM THREE\t\t" + itemThree);
        System.out.println();
        System.out.println("ITEM FOUR\t\t" + itemFour);
        System.out.println("\n");
        System.out.println("----------------------");
        System.out.println("SUBTOTAL\t\t" + subTotal);
        System.out.println("LOYALTY LISTENER " + indirim);
        System.out.println("----------------------");
        System.out.println("TOTAL AMOUNT\t" + totalAmount +
                "\nCASH\t\t\t" + cash +
                "\nCHANGE\t\t\t" + (cash - totalAmount));

        System.out.println("----------------------");
        System.out.println("THANK YOU FOR LISTENING");
        System.out.println("----------------------");
    }



}
