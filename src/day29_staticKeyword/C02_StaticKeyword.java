package day29_staticKeyword;

import static day29_staticKeyword.C01_Static.okulTelefonu;

public class C02_StaticKeyword {
    public static void main(String[] args) {


        // baska class'daki static class uyelerine
        // ulasabilmek isin sadece clasIsmi.staticUyeIsmi
        // yazmamiz yeterlidir

        System.out.println(okulTelefonu);// 3124545676
        okulTelefonu="5449867964641";
        System.out.println(okulTelefonu); // 5449867964641

        // Baska class'daki static olmayan class uyelerini
        // ancak obje olusturarak ulasabiliriz
        // ve obje ile yapilan atamalar sadece o obje icin gecerli olur

        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();

        System.out.println(obj2.okulIsmi); // Yildiz koleji
        obj2.okulIsmi="Sabir koleji";
        System.out.println(obj2.okulIsmi); // Sabir koleji
        System.out.println(obj1.okulIsmi);// Yildiz koleji

    }
}
