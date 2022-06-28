package day16_MethodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {

        // verilen String'i tersten yazdiran bir kod yazdirin

        String str="Ey edip adanada pide ye";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));

        }
    }
}
