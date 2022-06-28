package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer, String> myMap() {
        Map<Integer, String> sinifList = new HashMap<>();
        sinifList.put(101, "Ali, Can, Dev, 2000");
        sinifList.put(102, "Veli, Yan, QA, 2006");
        sinifList.put(103, "Ali, Yan, C#, 2005");
        sinifList.put(104, "Said, Bengi, QA, 1998");
        sinifList.put(105, "Dudu, Bengi, C#, 1997");
        return sinifList;
    }
}