package Day34;

public class StringRewiew {
    public static void main(String[] args) {
        String myStr = " Hello ";

        char result = myStr.charAt(0);
        System.out.println("result = " + result);
        System.out.println("myStr uzunluk = " + myStr.length());

        System.out.println("length with trim : " + myStr.trim().length());
        System.out.println(myStr + " length " + myStr.length());
        myStr = myStr.trim();
        System.out.println("Trim...: " + myStr  + " length " + myStr.length());

        System.out.println("Concat.....");
        String firstName = "Jhon ";
        String lastName = new String("Doe");

        System.out.println(firstName.concat(lastName)); // Jhon Doe
        System.out.println(firstName + lastName);

        //Contains
        System.out.println("Contains method");

        String myStr1 ="Hello";
        System.out.println(myStr1.contains("Hel"));
        System.out.println(myStr1.contains("e"));
        System.out.println(myStr1.contains("hi"));

        System.out.println();
        System.out.println("indexof method");
        System.out.println("--------------");

        /*
            public int indexOf(String str)
            public int indexOf(String str, int fromIndex)
            public int indexOf(int char)
            public int indexOf(int char, int fromIndex)
         */

        String myStr2 = "Hello planet earth, you are a great planet.";

        System.out.println("First occurrence index of word planet " + myStr2.indexOf("planet")); // first occurrence
        int index = myStr2.indexOf("planet");
        System.out.println("Next occurrence index of word planet " +  myStr2.indexOf("planet", index + 1)); //next occurrence after first one
        index = myStr2.indexOf("planet", index + 1);
        System.out.println("Next occurrence index of word planet " +  myStr2.indexOf("planet", index + 1));

        //Finding Char
        System.out.println("First occurrence index of char 'p' " + myStr2.indexOf('a'));

        System.out.println();
        System.out.println("replace method");
        System.out.println("--------------");

        String myStr3 = "Site is eurotechstudy.com";
        System.out.println("myStr3_original = " + myStr3);

        System.out.println(myStr3.replace("com","net"));
        myStr3 = myStr3.replace("com","net");
        System.out.println("myStr3_original = " + myStr3);

        System.out.println();
        System.out.println("equals method");
        System.out.println("--------------");

    }
}
