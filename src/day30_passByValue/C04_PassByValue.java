package day30_passByValue;

public class C04_PassByValue {
    // eger bir method'ta yapilan degisikligin kalici olmasini istiyorsak
    // iki yontem kullanabiliriz
    // 1- variable'i class level da static olarak olusturabilirim

    static double etiketFiyat;
    static double indirimYuzdesi;
    public static void main(String[] args) {


        etiketFiyat=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
        indirimYuzdesi=15;
        kaliciIndirimYap();
        indirimYuzdesi=5;
        kaliciIndirimYap();
    }


    public static void kaliciIndirimYap(){
     etiketFiyat*=(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : "+etiketFiyat);
    }

}
