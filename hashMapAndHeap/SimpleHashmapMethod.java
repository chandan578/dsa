package dsa.hashMapAndHeap;


import java.util.HashMap;
import java.util.Set;

/**
 * SimpleMethod
 */
public class SimpleHashmapMethod {

    public static void main(String[] args) {
        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("Bihar", 200);
        hMap.put("Up", 250);
        hMap.put("Bangal", 120);
        hMap.put("Jharkhand", 220);
        System.out.println(hMap);

        hMap.put("Bihar", 300);
        hMap.put("Delhi", 500);
        System.out.println(hMap);

        System.out.println(hMap.get("Bihar"));
        System.out.println(hMap.get("Chennai"));
        
        System.out.println(hMap.containsKey("Bihar"));
        System.out.println(hMap.containsKey("Chennai"));

        Set<String> keys = hMap.keySet();
        System.out.println(keys);  

        for (String key : hMap.keySet()) {
            Integer val = hMap.get(key);
            System.out.println(key + " " + val);
        }
    }
}