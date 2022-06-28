package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime time= LocalTime.now();
        System.out.println(time);// 22:09:44.524039800

        //bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }
        LocalTime timeLoopSonrasi= LocalTime.now();
        System.out.println(timeLoopSonrasi);// 22:15:08.774132700

        double nano1=time.getNano();
        double nano2=timeLoopSonrasi.getNano();

        System.out.println("islem "+(nano2-nano1)+" nanosaniyede bitti");

        //ileri veya geriye gidebiliriz

        System.out.println(time.plusMinutes(1000));// 14:59:54.841144400

        // istersek zone id kullanara istedigimiz bolgenin saati icin de obje olusturabiliriz

    }
}
