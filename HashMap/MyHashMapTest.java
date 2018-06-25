package pl.coderstrust.MyHash;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MyHashMapTest {

    @Test
    public void shouldReturnMapSize() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        int size = map1.size();

        //then
        int exp = 3;
        assertEquals(exp, size);
    }

    @Test
    public void shouldCheckIfMapEmpty() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        boolean chk = map1.isEmpty();

        //then
        boolean exp = false;
        assertEquals(exp, chk);
    }

    @Test
    public void shouldCheckIfContainsKey() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        boolean chk = map1.containsKey("ten");

        //then
        boolean exp = true;
        assertEquals(exp, chk);
    }

    @Test
    public void shouldCheckIfContainsValue() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        boolean chk = map1.containsValue(8);

        //then
        boolean exp = true;
        assertEquals(exp, chk);
    }

    @Test
    public void shouldGetValueCorrespodningToKey() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        int chk = map1.get("ten");

        //then
        int exp = 10;
        assertEquals(exp, chk);
    }

    @Test
    public void shouldRemoveMapElement() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        map1.remove("ten");
        boolean chk = (map1.containsKey("ten") || map1.containsValue(10));

        //then
        boolean exp = false;
        assertEquals(exp, chk);
    }

    @Test
    public void shouldCopyAllMap() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        Map<String, Integer> map2 = new MyHashMap<>();
        map2.putAll(map1);
        boolean chk = (map2.containsKey("fifteen") && map2.containsKey("ten") && map2.containsKey("eight")
                && map2.containsValue(15) && map2.containsValue(10) && map2.containsValue(8));

        //then
        boolean exp = true;
        assertEquals(exp, chk);
    }

    @Test
    public void shouldClearMap() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        map1.clear();
        boolean chk = (map1.containsKey("fifteen") || map1.containsKey("ten") || map1.containsKey("eight")
                || map1.containsValue(15) || map1.containsValue(10) || map1.containsValue(8));

        //then
        boolean exp = false;
        assertEquals(exp, chk);
    }

    @Test
    public void shouldReturnKeySet() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        int giv = map1.keySet().size();

        //then
        int exp = 3;
        assertEquals(exp, giv);
    }

    @Test
    public void shouldReturnValuesCollection() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        int giv = map1.values().size();

        //then
        int exp = 3;
        assertEquals(exp, giv);
    }

    @Test
    public void shouldReturnEntrySet() {

        //given
        Map<String, Integer> map1 = new MyHashMap<>();
        map1.put("fifteen", 15);
        map1.put("ten", 10);
        map1.put("eight", 8);

        // when
        int giv = map1.entrySet().size();

        //then
        int exp = 3;
        assertEquals(exp, giv);
    }
}