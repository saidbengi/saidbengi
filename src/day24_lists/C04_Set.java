package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);// [Aykut, Yusuf, Ilker, Oguzhan]

        isimler.set(1,"Seckin"); // Yusuf gitti , yerine Seckin geldi
        System.out.println(isimler);// [Aykut, Seckin, Ilker, Oguzhan]

        // daha onceden listede var olanlari da arsiv gibi tutmak istiyorsak

        List<String> logList = new ArrayList<>();

        logList.add(isimler.set(2,"Cosmos"));
        System.out.println(isimler); // [Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logList); // [Ilker]





    }
}
