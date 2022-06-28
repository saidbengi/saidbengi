package day29_staticKeyword;

public class C01_Static {

    String okulIsmi="Yildiz koleji";
      static String okulTelefonu="3124545676";

    public static void staricMethod(){
        System.out.println("Statik method calisti");
    }

    public void staticOlmayanMethod(){
        System.out.println("Static olmayan method calisti");
    }

}
