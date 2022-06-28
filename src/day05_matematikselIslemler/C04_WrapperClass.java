package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        // primitive data turu ile non-primitive arasindaki farklar nelerdir?

        String str="Java";
        int sayi=10;


        System.out.println(str.toUpperCase()); // JAVA

        // non-primitive data turleri data depolamak yaninda birçok faydali method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        //primitive data turleri sadece degerleri saklarlar(container)

        //primitive data turleri icin de bazi method'lar gerekli oldugunda
        //java ara bir cozum uretmistir
        //java her bir primitive data turunu non-primitive olarak kullanabilmek icin
        //ozel Class'lar olusturmus ve bunlara Wrapper Class adini vermistir

        double sayi2=20.5;

        // sayi2 primitive oldugundan sayi2. dedigimizde hic bir method gelmez

        Double sayi3=15.2;

        // sayi3 wrapper Class olan Double class'ini kullandıgından
        //sayi3. dedigimizde bircok method gelir


    }
}
