package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        // iki String array olusturunuz ve bu array’lerdeki ortak
        // elemanlari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String arr[]={"Ali","Ayse","Can","Fatma"};
        String arr2[]={"Can","Evren","Emsal","Fatma","Emre","Ali"};

        List<String> ortakElemanlar=new ArrayList<>();

        for (String each:arr) {
            for (String each2:arr2) {

                if (each.equals(each2)){
                    ortakElemanlar.add(each);
                }
            }
        }


        if (ortakElemanlar.isEmpty()){
            System.out.println("Ortak eleman yok");
        }else {
            System.out.println("İki array'deki ortak elemanlar : "+ortakElemanlar);
        }
    }
}
