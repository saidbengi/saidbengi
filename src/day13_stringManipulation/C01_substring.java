package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));
        // yukardaki String'i Mehmet hoca ile IT cok guzel
        System.out.println("Mehmet hoca " + str.substring(5));
        System.out.println(str.replace("Java", "Mehmet hoca"));

        System.out.println(str.substring(9));// yazilan index inclusive

        // Eger bir index'den sona kadar olan parcayi degil
        // belirli bir parcayi almak istersek
        // 2 parametre yazmak gerekir str.substring(baslangicIndexi i bitisIndexi)
        // baslangic indexi ==> inclusive/dahil
        // bitis indexi ==> eclusive/haric

        System.out.println(str.substring(0,5));// Java
        System.out.println(str.substring(0,1));// J
        // bana 5.harfi String olarak bulun
        String harf=str.substring(5,6);// i bana 6. harfi String olarak bulun
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7));// hiclik dondurur

        // System.out.println(str.substring(5,2));// bitis index'i baslangic indexinden kucuk olamaz

        System.out.println(str.substring(str.length()-1));// son harfi verir

        System.out.println(str.substring(str.length()-5)); // son 5 harfi yazdiralim

        System.out.println(str.substring(str.length())); // son harften sonraki kismi yani hiclik verir

    }
}
