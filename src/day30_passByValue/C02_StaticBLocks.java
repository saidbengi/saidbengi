package day30_passByValue;

public class C02_StaticBLocks {
    {
        /*
        static olmayan bloklar ise obje olusturulurken calisir

        static bloklar sadece 1 kere en basta calisir ama
        static olmayan bloklar her obje olusturulurken yeniden calisir
         */
        System.out.println("static olmayan blok calisti");
    }

    static {
        System.out.println("static blok calisti");

    }
    public static void main(String[] args) {
        System.out.println("main method basi");
        C02_StaticBLocks obj=new C02_StaticBLocks();
        C02_StaticBLocks obj2=new C02_StaticBLocks();

    }
}
