package day30_passByValue;

public class C05_PassByValue {
    // Kalici indirim icin  ikinci yontem
    public static void main(String[] args) {
        double etiketFiyat=100;
        double indirimYuzdesi=10;
        etiketFiyat=kaliciIndirimYap(etiketFiyat,indirimYuzdesi);
        System.out.println("main method'da indirim sonrasi etiket fiyati : "+etiketFiyat);


    }
    public static double kaliciIndirimYap(double etiketFiyat, double indirimYuzdesi){
        etiketFiyat*=(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : "+etiketFiyat);
        return etiketFiyat;
    }
}
