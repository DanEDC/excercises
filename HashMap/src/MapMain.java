package src;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, Integer> map0 = new HashMap<>();
        map0.put("fifteen", 15);
        map0.put("ten", 10);
        map0.put("eight", 8);

        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map0);

        Map<String, Integer> map3 = new MyHashMap<>();
        map3.putAll(map1);

        System.out.println(map0.keySet());
        System.out.println(map1.keySet());

        System.out.println(map2.keySet());
        System.out.println(map3.keySet());

        System.out.println(map0.values());
        System.out.println(map1.values());

        System.out.println(map0.entrySet());
        System.out.println(map1.entrySet());


        System.out.println(map0.size());
        System.out.println(map1.size());

        System.out.println(map0.isEmpty());
        System.out.println(map1.isEmpty());

        System.out.println(map0.containsKey("ten"));
        System.out.println(map1.containsKey("ten"));

        System.out.println(map0.containsKey("five"));
        System.out.println(map1.containsKey("five"));

        System.out.println(map0.containsValue(10));
        System.out.println(map1.containsValue(10));

        System.out.println(map0.containsValue(5));
        System.out.println(map1.containsValue(5));

        System.out.println(map0.get("ten"));
        System.out.println(map1.get("ten"));

        map0.remove("eight");
        map1.remove("eight");

        System.out.println(map0.containsKey("eight"));
        System.out.println(map1.containsKey("eight"));
        System.out.println(map0.containsKey("ten"));
        System.out.println(map1.containsKey("ten"));

        System.out.println(map0.containsValue(8));
        System.out.println(map1.containsValue(8));

        map0.clear();
        map1.clear();

        System.out.println(map0.size());
        System.out.println(map1.size());
    }
}
