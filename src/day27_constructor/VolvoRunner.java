package day27_constructor;

public class VolvoRunner {
    public static void main(String[] args) {
        Volvo arb1=new Volvo();
        System.out.println(arb1.marka);// Volvo
        arb1.yakit="Dizel";
        arb1.elektikliMi=false;
        System.out.println(arb1.maxHiz);// 240
        System.out.println(arb1.otomatikPilot);// false
        System.out.println(arb1.toString()); // Model : null Yakit : Dizel Max Hiz : 240

        Volvo arb2=new Volvo();
        arb2.yakit="Elektrikli";
        arb2.elektikliMi=true;
        arb2.model="XC90";
        arb2.yil=2023;
        arb2.maxHiz=arb2.maxHizAta();
        System.out.println(arb2.otomatikPilot);
        System.out.println(arb2.toString());






    }
}
