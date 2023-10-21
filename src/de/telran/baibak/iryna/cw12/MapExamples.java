package de.telran.baibak.iryna.cw12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {

    /*HashMap не гарантирует порядок
    put -  добавление элемента
    get- достать элемент по ключу, выведет значение
    containsKey - поиск элемента по ключу, вернет true or false
    keySet - выведет сет из неповторяющихся ключей, выведет только ключи
    keySet - выведет сет из  ключей и значений

    Диапазон Integer -2^31 - 2^31-1

    load factor - соотношение между числом элементов, хранящимся в таблице и
    ее общей емкостью(75% - хороший показатель,)

    * */
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Tom", 32);
        hashMap.put("Mary", 25);
        hashMap.put("John", 54);
        hashMap.put("Elena", 32);

        System.out.println(hashMap);

        Integer value = hashMap.get("Tom");
        System.out.println(value);
        System.out.println(hashMap.containsKey("Mary"));

        Set<String> keySet = hashMap.keySet();
        System.out.println(keySet);
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> e:entries) {
            System.out.println("Key= " + e.getKey());
            System.out.println("Value= " + e.getValue());
        }

        for (String key: hashMap.keySet()) {
            Integer v = hashMap.get(key);
            System.out.println("Key: " + key + " value " + v);
        }

    }
}
