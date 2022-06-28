package day14_stringManipulation;

public class    C04_IsimGizleme {
    public static void main(String[] args) {

        //Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234

        String isim="oguzhan";
        String soyisim="BALKAYA";
        String kKno="1234567890123456";

        String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yenisoyisim=soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\S","*");

        String yeniKkNo="**** **** ****" + kKno.substring(12);

        System.out.println("Isim-soyisim : " + yeniIsim + "" + yenisoyisim+
                "\nkart no :" + yeniKkNo);



    }
}
