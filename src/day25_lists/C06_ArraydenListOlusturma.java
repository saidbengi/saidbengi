package day25_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {

        // verilen bir array'i listeye cevirin

        String arr[] = {"A", "B", "C"};
        List<String> arraydenList = Arrays.asList(arr);

        // arrayden liste cevirdigimiz zaman yeni list'in uzzunlugunu degistiremeyiz
        // dolasiyla bu yeni list ile add(), remove() , clear() gibi methodlar calistirmaik
        // istedigimizde Exception olusur
        // arraydenList.add("J"); // UnsupportedOperationException

        System.out.println("20.satirda list : "+arraydenList);
        arr[1]="F";

        System.out.println("23.satirda Array : "+ Arrays.toString(arr));

        System.out.println("25.satirda List :"+ arraydenList);

        arraydenList.set(0,"Y");
        System.out.println("28.satirda Array : "+ Arrays.toString(arr));

        System.out.println("30.satirda List :"+ arraydenList);

    }
}
