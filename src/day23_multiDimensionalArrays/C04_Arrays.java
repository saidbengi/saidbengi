package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        // kullaniciya kac elementlik bir array olusturacagini sorun
        // array'i olusturup elemenleri kullanicidan alip array'e atayin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kac elementli bir array istediginizi yaziniz");
        int uzunluk = scanner.nextInt();

        int arr[] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array icin " + (i+1) + ". eleman giriniz");
            arr[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));

    }
}
