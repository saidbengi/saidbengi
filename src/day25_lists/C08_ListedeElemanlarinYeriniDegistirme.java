package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {

        // Verilen bir listede , istenen iki index'teki elementlerin yerini
        // kalici olarak degistiren bir method olusturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex=2;
        int ikinciIndex=5;

        sayilar=swapElements(sayilar,ilkIndex,ikinciIndex);
    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {

        // bir temp sayi olusturup
        // verilen indexlerdeki sayilari yer degistirin
        // indexleri konrol edip sinirin otesinde index verildiyse uyari mesaji yazdirin




        return sayilar;
    }
}
