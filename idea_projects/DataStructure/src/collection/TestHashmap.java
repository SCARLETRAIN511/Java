package collection;

import java.util.HashMap;

public class TestHashmap {
    public static void main(String[] args) {
        HashMap<String,Hero> heroMap = new HashMap<String,Hero>();
        heroMap.put("Gareen", new Hero("Gareen1"));
        System.out.println(heroMap);
        heroMap.put("Gareen",new Hero("Gareen2"));
        System.out.println(heroMap);
}
}
