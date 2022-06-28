package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";
        // istersek char olarak verdigimiz bir harfin indexini bize dondurur
        System.out.println(str1.indexOf('J'));// 0

        // istersek bir harf ya da metin olarak verdigimiz String'in indexini dondurur
        System.out.println(str1.indexOf("l"));// 19

        System.out.println(str1.length()-1);// 35

        System.out.println(str1.indexOf("aska")); // 10


        //ayni harften birden fazla varsa ?
        System.out.println(str1.indexOf("b")); // 5 buldugu ilk dogru eslesmenin indexini dondurur


        System.out.println(str1.indexOf('b' , 5));
        // bu method'da java aramaya fromIndex olarak yazdigimiz index'den baslar
        // (inclusive)


        //verilen String'deki 2.a harfinin index'ini bulalim

        int ilkIndex= str1.indexOf('a');// 1
        System.out.println(ilkIndex);
        System.out.println(str1.indexOf('a', ilkIndex+1) ); // 3

        //verilen String'deki 2.b harfinin index'ini bulalim

        int ilkbIndex= str1.indexOf("b");// 5
        System.out.println(ilkbIndex);
        System.out.println(str1.indexOf("b", ilkbIndex+1) ); // 9

        // 20. index'ten sonra guzel aratalim
        System.out.println(str1.indexOf("guzel",20)); // 31



        // String'de olamyan bir harf aratsak

        System.out.println(str1.indexOf("y")); // y yok demesi lazim ama return type'ı index
        // yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih etmistir

        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gercersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mailinizi yazin");
        String mail=scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
        }else {
            System.out.println("Mailiniz kabul edildi");
        }

        // OZET : indexOf method'u icierise yazilan String veya char'in
        // metinde hangi index'de oldugu bize dondurur
        // eger aradigimiz metin veya char yoksa , olmadiginin delili olarak
        // bize -1 dondurur


    }
}
