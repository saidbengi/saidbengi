package day03_Scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {


        int sayi1=10;
        int sayi2=20;
        System.out.println("Swap'dan once sayi1: " + sayi1 + ", sayi2 : "+ sayi2);
        //1.adim bos bir variable olusturup
        //sayi1'i ona atayalım
        int temp=sayi1;
        //2.adim sayi1'e yeni degerini atayalim
        sayi1=sayi2;
        //3.adım sayi2'ye temp'e yedekledigimiz sayi1 degerini atayalim
        sayi2=temp;
        System.out.println("Swap'dan sonra sayi1: " + sayi1 + ", sayi2 : "+ sayi2);


    }
}
