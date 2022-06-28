package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Guzeldir";

        // Biz string method'larini arka arkaya kullanabiliriz
        // mesela ikinci kelimesinin ilk harfini kucuk olarak yazdiralim

        //str.charAt(5); boyle yazdigimizda sonuc artik String degil char olacaktir
        //dolasiyla String'de yapmak istedigimiz tum degisilikleri
        //once yapip sonra charAt() method'unu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));// JAVA GUZELDİR

        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));// JAVA GUZELDIR







    }
}
