package day36_inheritance;

public class Muhasebe extends Personel {

    protected int saatUcreti;
    protected String statu;
    protected int maas;

    protected int maasHesapla(){
        int maas=saatUcreti*8*30;
        return maas;
    }
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
