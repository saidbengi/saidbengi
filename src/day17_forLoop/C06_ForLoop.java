package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        // verilen iki harf ve aralarindaki harfleri yazdiran
        // bir kod yaziniz

        char harf1 = 'c';
        char harf2 = 's';

        for (char i = harf1; i <= harf2; i++) {
            System.out.print(i + " ");
        }

        double baslangic = 10;
        double bitis = 20;
        double artis = 0.2;
        // baslangic ve bitis sayilari arasinda artis miktari ile olusacak
        // tum sayilari yazdiriniz

        for (double i = baslangic; i <= bitis; i+=artis) {
            System.out.print(i+" ");
        }

    }
}
