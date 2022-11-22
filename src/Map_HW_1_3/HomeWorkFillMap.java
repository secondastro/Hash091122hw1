package Map_HW_1_3;


import java.util.LinkedHashMap;
import java.util.Map;


//Домашнее задание 1 - 3
public class HomeWorkFillMap {
    public static void main(String[] args) {
        MapStringInteger mapStringInteger = new MapStringInteger();
        mapStringInteger.addKeyValue("red", 123);
        mapStringInteger.addKeyValue("green", 124);
        mapStringInteger.addKeyValue("black", 125);

        mapStringInteger.addKeyValue("black", 777);

        System.out.println(mapStringInteger);
// Домашнее задание 2 - 1
        MapStringList mapStringList = new MapStringList();

        System.out.println(mapStringList);

        System.out.println(mapStringList.getTransformedMap());

        //Домашнее задание 2-2
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(4, "test 4");
        linkedMap.put(2, "test 2");
        linkedMap.put(7, "test 7");
        linkedMap.put(9, "test 9");
        linkedMap.put(3, "test 3");
        linkedMap.put(5, "test 5");
        linkedMap.put(8, "test 8");
        linkedMap.put(1, "test 1");
        linkedMap.put(6, "test 6");
        linkedMap.put(10, "test 10");
        for (Map.Entry<Integer, String> entry : linkedMap.entrySet()) {
            System.out.printf("%d : %s%n ", entry.getKey(), entry.getValue());
        }
    }
}
