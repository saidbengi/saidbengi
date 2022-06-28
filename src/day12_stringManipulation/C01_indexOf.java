package day12_stringManipulation;

import java.util.Scanner;

public class C01_indexOf {
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

        int index = cumle.indexOf(kelime); // -1 veya index cikar
        int index2 = cumle.indexOf(kelime, index + 1);
        if (index == (-1)) {
            System.out.println("Girilen kelime cumlede kullanilmamis");
        } else if (index2 == (-1)) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        } else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }


    }
}
