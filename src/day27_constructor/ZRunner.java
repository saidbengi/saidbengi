package day27_constructor;

public class ZRunner {
    public static void main(String[] args) {

        Z obj1=new Z("Said","Bengi",44,true);
        System.out.println(obj1); // Isim : Said, Soyisim : Bengi, numara : 44, gercek mi : true

        Z obj2=new Z("Said","Usame",55);
        System.out.println(obj2);// Isim : Said, Soyisim : Usame, numara : 55, gercek mi : false

        Z obje3=new Z("Ali","Can",50);

    }
}
