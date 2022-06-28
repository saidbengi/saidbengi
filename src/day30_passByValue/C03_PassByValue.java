package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        Java Pass By Value bir programlama dilidir
        Yani; bir primitive veriable'i argument olarak bir method'a yollarsaniz
        Java o veriable'i degil , degerini(value) method'a aktarir (pass)
         */
        double etiketFiyat=100;
        yuzdeOnIndirimYap(etiketFiyat);// Sizin icin %10 indirimli fiyatimiz 100.0 TL
        yuzdeOnIndirimYap(etiketFiyat);// Sizin icin %10 indirimli fiyatimiz 100.0 TL

    }

    public static void yuzdeOnIndirimYap(double etiketFiyat) {
        etiketFiyat*=0.9;
        System.out.println("Sizin icin %10 indirimli fiyatimiz " + etiketFiyat +" TL");
    }
}
