package day12_stringManipulation;

import java.util.Scanner;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Bir kelime giriniz");
        String kelime = scan.next();

        int ilkKullanim = cumle.indexOf(kelime); // -1 veya index cikar
        int sonKullanim = cumle.lastIndexOf(kelime);

        if (ilkKullanim == (-1)) {
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (ilkKullanim == sonKullanim) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        } else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }

        String str = "Eclipse";
        System.out.println(str.lastIndexOf("p", 4)); // 4 dahil

    }
}
