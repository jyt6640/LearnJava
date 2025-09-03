package ch15.myQuestion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); // key 중복, value 90 -> 95로 수정

        System.out.println("총 Entry 수 : " + map.size());
        System.out.println("홍길동 : " + map.get("홍길동"));

        System.out.println("======================");

        // 🔥 전체 key-value 출력
        for (Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println("======================");

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            int value = map.get(key);
            System.out.println(key + " : " + value);
        }

        System.out.println("======================");

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Entry<String, Integer> entry = iterator2.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println("======================");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
            if(iterator2.next().getKey().equals("홍길동")) {
                iterator2.remove();
            }
        }
        System.out.println("총 Entry 수 : " + map.size());
    }
}
