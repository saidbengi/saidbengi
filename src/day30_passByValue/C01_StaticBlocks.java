package day30_passByValue;

public class C01_StaticBlocks {
    static {// class calismaya baslamadan  yapmamiz gereken on  atamalar varsa onlari yapar
        /*
        static block class ilk calismaya basladiginda devreye girer
        ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
        yazildigi satirin hic bir onemi yoktur , class icerisinde istenen yerde yazilabilir
        static block birden fazda olursa , bloklar yukaridan asagi dogru sirayla calisir
         */
        System.out.println("static block calisti");
    }
    C01_StaticBlocks(){
        System.out.println("Constuructor calisti");
    }
    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj; // objeyi tanimladik ama assing etmedik
        new C01_StaticBlocks();// burada constructor calisti
        System.out.println("main method sonu");
    }
}
