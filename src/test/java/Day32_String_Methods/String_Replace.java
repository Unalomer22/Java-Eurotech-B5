package Day32_String_Methods;

public class String_Replace {

    public static void main(String[] args) {

        String str = " Berlin is capital of Germany";
        str = str.replace("Berlin","London");
        System.out.println("str1 = " + str); // London is capital of Germany

        str = str.replace("Germany","England");
        System.out.println("str2 = " + str); // London is capital of England

        str = str.replace("London","Ankara").replace("England","Turkei");
        System.out.println("str3 = " + str); // Ankara is capital of Turkei

        System.out.println("************************************");

        String email = "isim_soyisim@gmail.com";
        String company = "eurotechstudy";
        String baba = "kalb";
        email = email.replace("gmail", company);
        System.out.println("email = " + email);// isim_soyisim@eurotechstudy.com
        email = email.replace("isim",baba);
        System.out.println("email = " + email); // kalb_soykalb@eurotechstudy.com
        System.out.println("************************************");

        String cumle = "Coding is fun, it is my hobby";
        cumle = cumle.replace(" ", "");// cumledeki tum bosluklari kaldirdik
        System.out.println("cumle = " + cumle);// Codingisfun,

        System.out.println("************************************");

        cumle = cumle.replace(",", "!!!");
        System.out.println("cumle = " + cumle);// Codingisfun!!!itismyhobby

        cumle = cumle.replace("",")(");
        System.out.println("cumle = " + cumle);// )(C)(o)(d)(i)(n)(g)(i)(s)(f)(u)(n)(!)(!)(!)(i)(t)(i)(s)(m)(y)(h)(o)(b)(b)(y)(
    }
}
