package day36_inheritance;

public class Memur extends Muhasebe{

    public static void main(String[] args) {
        Memur memur1=new Memur();
        // memur1 objesi Memur class'inin objesi olmasina ragmen
        // inherit ettigi Muhasebe ve onun da Parent'i olan Personel
        // class'larindaki tum datalari alabilir

        // Personel class'indan
        memur1.persNo=1001;
        memur1.isim="Said";
        memur1.soyisim="Bengi";
        memur1.adres="Mersin";
        memur1.tel="5538863696";

        // Muhasebe class'indan
        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas=memur2.maasHesapla();
        System.out.println(memur2);
    }
}
