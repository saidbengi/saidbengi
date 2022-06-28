package day20_scope_Arrays;

public class C01_Scope {

    int sayi;
    String bransİsmi="Java";
    boolean okuldaMi;

    public static void main(String[] args) {

        // sayi=10; sayi veariable'i static olmadigi icin main method'dan direk kullanilamaz
        // instance variable'lara static method'lardan ulasabilmek icin obje olusturmamiz gerekir

        C01_Scope obj1=new C01_Scope();
        System.out.println(obj1.sayi); // 0
        obj1.sayi=10;
        System.out.println(obj1.sayi); // 10
        obj1.bransİsmi="SQL";
        System.out.println(obj1.bransİsmi); // SQL
        System.out.println(obj1.okuldaMi);// false

        C01_Scope obj2=new C01_Scope();
        System.out.println(obj2.sayi); // 0
        System.out.println(obj2.bransİsmi); // Java

        obj1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);// false


    }

}
