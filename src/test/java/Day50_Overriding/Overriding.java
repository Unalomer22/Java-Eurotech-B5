package Day50_Overriding;

public class Overriding {
    /*
    1) Parent Class daki bir methodu Child Class a göre özellestirerek kullanmak isterseniz "Overriiding" yapabilirsiniz
    2) a) Overriding yaparken "Method signature (name + parametre)" a dokunulmaz.
        b) Overriding yaparken "Access Modifier lar belli kurallara göre degistirilebilirler.
        c) Overriding yaparken "return type " lar belli kurallara göre degistirilebilirler.
        d) Overriding yaparken "method body" degistirilir zaten "Overriding" in amaci budur. Ama method body i degistir,eden kullanirsaniz Java CTE vermez.
        Ama Overriding de method body i degistirmmemek mantiksizdir.
        e) Overriding yapabilmek icin "parent-child" relationship sarttir.Yani inheritance olmadan overriding olmaz.
        f) Override edilen method parentteki methoddur ve Java o methoda "Overridden Method " denir. Child Class daki method ise "Overriding Method" olarak adlandirilir.
     3) Overriding methodunun basina @Override" annotation ini koyarsaniz Java yaptiginiz overriding i kontrol eder , herhangi bir yanlislik varsa CTE verir.
     4) "Overriding Method" un access modifier i ya "Overridden Method" ile ayni olur veya daha genis olur.
     5) Return type lar primitive ise "Overriding method " un return type i "Overridden Method" ile ayni olmalidir.
     6) "Overridden Method" un return type i void ise "Overriding Method" un da return type i void olmalidir
     7) Return Type Wrapper Class ise "Overriding Method" un return type i "Overidden Method" ile ayni olmalidir.
     8) Return type lar arasinda parent-child relationship varsa "Overriding Method" un return type i ya  "Overidden Method" ile ayni olmali
     veya "Overidden Method" un child class i olmalidir.
     9) Static method lar @override edilemezler.
     10) final method lar @override edilemezler.
     11) private method lar @override edilemezler.
     12) " Polymorphism nedir? Cok bicimlilik demek. Polymorphism "Overloading " ve "Overriding" den olusur.
                                Overloading==> public void add(){}
                                public void add(int i){}
                                public void add(int i, String s){}
                    Overriding ==>  public void multiply(){sout("3*4")}
                                    public void multiply(){sout("1*2*3")}
                                     public void multiply(){sout("5*4*3")}
       "Overloading " ve "Overriding" arasindaki farklar nelerdir?
       1)
     */



}
