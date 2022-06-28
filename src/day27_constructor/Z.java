package day27_constructor;

public class Z {

    String isim;
    String soyisim;
    int num;
    boolean gercekMi;

    public Z(String ism, String soyism, int no, boolean grc) {

        isim = ism;
        soyisim=soyism;
        num = no;
        gercekMi = grc;

    }

    public Z(String isim, String soyisim, int num) {
        this.isim=isim;
        this.soyisim=soyisim;
        this.num=num;
    }

    public String toString(){
        return("Isim : "+ isim+", Soyisim : "+soyisim+", numara : "+num);
    }
}
