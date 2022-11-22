package Map_HW_1_3;

import java.util.*;

public class MapStringList {

    private final Map<String, List<Integer>> stringListMap = new HashMap<>();
    private static final Random RANDOM = new Random();

    public MapStringList() {

        for (int i = 0; i < 5; i++) {
            List<Integer> integerList = new ArrayList<>(3);
            for (int j = 0; j < 3; j++) {
                integerList.add(RANDOM.nextInt(1000));
            }
            stringListMap.put(String.valueOf(i), integerList);
        }
    }
        public Set<Map.Entry<String, List<Integer>>> getEntries () {
            return stringListMap.entrySet();
        }
        public Map<String, Integer> getTransformedMap () {
            Map<String, Integer> result = new HashMap<>();
            for (Map.Entry<String, List<Integer>> entry : stringListMap.entrySet()) {
                int sum = 0;
                for (int i = 0; i < entry.getValue().size(); i++) {
                    sum += entry.getValue().get(i);
                }
                result.put(entry.getKey(), sum);
            }
            return result;
        }

        @Override
        public String toString () {
            return "MapStringList{" +
                    "stringListMap=" + stringListMap +
                    '}';
        }
    }
