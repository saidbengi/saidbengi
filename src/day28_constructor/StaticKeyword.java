package day28_constructor;

import static day28_constructor.Rope.swing;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
        /* Static veriable'lar direk class'a baglidir
           Class icerisinde yapilan her turlu degisiklik static variable'larda kalici olur

           Instance veriable'lar ise obje'ye baglidi
           instance veriable'lara sadece obje uzerinden erisilebilir
           ve bir obje uzerinden erisilerek yapilan degisiklik
           instance variable'in degerini tum objeler icin kalici olarak degistirmez
           sadece o obje icin onstance veriable degerini kalici olarak degistirir

         */
        System.out.println("Sayi1 : " + sayi1);// 0
        // System.out.println("Sayi2 : "+sayi2); static olmadigi icin main method'a direk kullanamayiz

        StaticKeyword obj = new StaticKeyword();
        System.out.println("Sayi2 : " + obj.sayi2);// 0

        sayi1++;
        obj.sayi2++;

        System.out.println("Sayi1 : " + sayi1);// 1
        System.out.println("Sayi2 : " + obj.sayi2);// 1

        System.out.println(obj.sayi1);// 1

        StaticKeyword obj2 = new StaticKeyword();

        System.out.println(obj2.sayi1);// 1
        System.out.println(obj2.sayi2);// 0

        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi1);// 2
        System.out.println(obj2.sayi2);// 1

        System.out.println(obj.sayi1);// 2
        System.out.println(obj.sayi2);// 1

        obj.sayi1++;
        obj.sayi2++;

        System.out.println(obj.sayi1);// 3
        System.out.println(obj.sayi2);// 2

        System.out.println(obj2.sayi1);// 3
        System.out.println(obj2.sayi2);// 1

    }
    public static void play() {
        swing();
        // climb();
    }
}


