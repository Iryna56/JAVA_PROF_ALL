package algorithms_1210;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(4);
        countElmRepeat(array); // 1,1,2,3,4,4  => 1:2, 2:1, 3:1, 4:2
    }

    private static void countElmRepeat(ArrayList<Integer> array) {
        Map<Integer, Integer> repeatMap = new HashMap<>();

        for(Integer elm : array){
            if(repeatMap.containsKey(elm)) {
                repeatMap.put(elm, repeatMap.get(elm) + 1);
            } else {
                repeatMap.put(elm, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : repeatMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
