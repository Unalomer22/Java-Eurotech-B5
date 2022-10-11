package Day64_Collections_List;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Ornek {

    public static void main(String[] args) {
        System.out.println("List interface in Java");

        Vector<String> vctr=new Vector<String>();
        vctr.add("Elma");
        vctr.add("Armut");
        vctr.add("Kayısı");
        vctr.add("Erik");
        vctr.add("Karpuz");
        vctr.add("Kavun");

        Enumeration<String> enumer = vctr.elements();

        while(enumer.hasMoreElements())
        {
            String value=(String) enumer.nextElement();
            System.out.println(value);
            vctr.remove(value);
        }

    }


}
