package collection;

import java.util.HashMap;
import java.util.Set;

public class ReverseKeyandValue {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,String> temp = new HashMap<>();

        map.put("ADC","Physics hero");
        map.put("APC","Magic hero");
        map.put("T","Tank");

        System.out.println("Initialize the Map");
        System.out.println(map);
        //找到map中的keys 并使用set存放；
        Set<String> keys = map.keySet();

        for (String key : keys){
            String value = map.get(key);
            temp.put(value,key);
        }
        map.clear();
        map.putAll(temp);

        System.out.println("Operation finished");
        System.out.println(map);
    }
}
