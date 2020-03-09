package collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.lang.StrictMath;

public class TestHashmap {
    public static void main(String[] args) {
        List<Hero> hs = new ArrayList<>();
        System.out.println("Start initialization");
        for (int i = 0;i<30000;i++){
            Hero h = new Hero("Hero" + random());
            hs.add(h);
        }

        HashMap<String, List<Hero>> heromap = new HashMap<>();
        for (Hero h : hs){
            List<Hero> list =heromap.get(h.name);
            if (list == null){
                list = new ArrayList<>();
                heromap.put(h.name,list);
            }
            list.add(h);
        }
        System.out.println("Initialize finish");
        System.out.println("Start searching");
        findByMap(heromap);
        findByiteration(hs);
    }

    private static List<Hero> findByMap(HashMap<String,List<Hero>> m){
        long start = System.currentTimeMillis();
        List<Hero> result = m.get("Hero555");
        long end = System.currentTimeMillis();
        System.out.printf("Through map searching, find %d heros, take time of %d millisecond %n",result.size(),end-start);
        return result;
    }

    private static List<Hero> findByiteration (List<Hero> hs){
        long start = System.currentTimeMillis();
        List<Hero> result = new ArrayList<>();
        for (Hero h : hs){
            if (h.name.equals("Hero555")){
                result.add(h);
            }
        }
        long end = System.currentTimeMillis();
        System.out.printf("Through for searching, find %d heros, take time of %d millisecond %n",result.size(),end-start);
        return result;
    }

    public static int random(){
        return ((int)(Math.random()*900)+100);
    }

}
