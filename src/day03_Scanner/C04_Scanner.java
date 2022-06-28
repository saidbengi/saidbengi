package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Scanner kullanmak icin 3 adim takip ediyoruz
        //1.adim kendimize bir scanner olusturmak

        Scanner scan= new Scanner(System.in);  // esitligin sagında yeni bir scanner olusturulur
                                               // ve olusturulan bu scanner scan variable'na assign edilir
        //2.adim kullanıcıdan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdırın

        System.out.println("Lutfen isminizi giriniz");

        //3.adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin

        //String kullaniciIsmi=scan.next(); // SADECE ilk kelimeyi alir (ilk space'e kadar olan bolumu alir)

        String kullaniciIsmi= scan.nextLine(); // satir sonuna kadar girilen tum degerleri alir

        System.out.println("Kullanicinin girdigi isim: "+kullaniciIsmi);



    }
}
