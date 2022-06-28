package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[] = {3, 4, 7};

        // arr[3]=8; array'de olmayan bir index'e atama yapamayiz

        // arr={1,3,6}; var olan bir array'e ayni boyutta bile olsa direk
        // yeni degerler iceren bir array atayamayiz

        arr = new int[4];
        System.out.println(Arrays.toString(arr));


        int arryeni[] = new int[5];

        arr = arryeni;
        System.out.println(Arrays.toString(arr));// [0, 0, 0, 0, 0]
        arryeni[0] = 2;
        arryeni[3] = 5;
        arr = arryeni;
        System.out.println(Arrays.toString(arr));

        // bir array'e icinde hazir elementlerin oldugu yeni bir array atamak isterseniz
        // bunu {1,2,3} seklinde yazarak degil
        // new int[3] diyerek olusturup sonra deger atayarak tamamladigimiz bir array'i
        // assign ederek yapabaliriz

        int arrEnyeni[]={1,2,3,4,5};
        arr=arrEnyeni;
        System.out.println(Arrays.toString(arr));// [1, 2, 3, 4, 5]

    }
}
