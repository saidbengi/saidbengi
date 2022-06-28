package day24_lists;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        int arr[] = {};

        // bu array'e 5 ekleyelim
        C06_Arrays obj = new C06_Arrays();
        arr = obj.arrayeElemanEkle(arr, 5);
        System.out.println(Arrays.toString(arr)); // [5]

        // bir de 3 ekleyelim

        arr= obj.arrayeElemanEkle(arr,3);
        System.out.println(Arrays.toString(arr));// [5, 3]

       // bir list olusturalim

        List<Integer>sayilarList = new ArrayList<>();
        System.out.println(sayilarList);

        sayilarList.add(5); // [5]
        sayilarList.add(3); // [5,3]
        sayilarList.add(0,7); // [7, 5, 3]
        sayilarList.add(2,7); // [7, 5, 7, 3]
        System.out.println(sayilarList);

        System.out.println(sayilarList.size()); // list'in karakter sayisini verir => 4

        System.out.println(sayilarList.isEmpty()); // list'in bos olup olmadigini kontrol eder => false





    }
}
