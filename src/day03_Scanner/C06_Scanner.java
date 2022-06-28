package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Soru 6 Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagıdaki sekilde yazdirin
        //Isım - soyisim : Said Bengi


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Isim - soyisim : " +isim + " " + soyisim );
    }
}
