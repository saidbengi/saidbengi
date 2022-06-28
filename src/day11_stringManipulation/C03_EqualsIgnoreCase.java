package day11_stringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        // kullaniciya derse katilip katilmak istemedigini sorun
        // evet derse, cevabini "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini "Sonraki derse bekleriz" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Derse Katilmak ister misiniz ? \nEvet veya Hayir yaziniz");
        String cevap=scanner.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("Cevabiniz = "+ cevap +" " + "derse katiliminiz onaylanmistir");
        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("Cevabiniz = " + cevap + " " + "Sonraki derse bekleriz");
        }else {
            System.out.println("Lutfen evet veya hayir yaziniz");
        }



    }
}
