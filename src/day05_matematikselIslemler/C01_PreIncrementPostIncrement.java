package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;
        // bu sayiyi bir artirmak istersen
        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println("pre- incrementen once "+ sayi); //12
        //eger 11. ve 12. satirda yaptigim 2 islemi tek satirda yaparsam
        //java iki islemden once hangisini yapacagini bilmek ister
        // once artirir sonra yazdirirsak java yeni degeri yazdirir
        //ama once yazdirir sonra artirirsak , bu durumda eski deger yazdirilir
        System.out.println("pre - incerement satirinde "+ ++sayi); //13  once artir sonra yazdir.
        System.out.println(sayi);//13
        System.out.println("post-incerement satirinde"+ sayi++);//13 once yazdir sonra arttir
        System.out.println("post incerement satirinden sonra" + sayi); // 14


    }
}
