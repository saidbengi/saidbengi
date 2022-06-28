package day12_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        String email = "mulkiyeayboy@gmail.com";
        String arananString = "@gmail.com";

        if (!email.contains(arananString)) {
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.endsWith(arananString)) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontol edin");
        }


    }
}
