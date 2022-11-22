package Map_HW_1_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapStringInteger {
    private final Map<String, Integer> stringIntegerMap = new HashMap<>();


    public void addKeyValue(String str, Integer val) {
        if (this.stringIntegerMap.containsKey(str)) {
            if (this.stringIntegerMap.get(str).equals(val)) {
                throw new IllegalStateException("Такая пара ключ-значение уже существует");
            } else {
                this.stringIntegerMap.put(str, val);
            }
        } else {
            this.stringIntegerMap.put(str, val);
        }
    }

    public Set<Map.Entry<String, Integer>> getEntries() {
        return this.stringIntegerMap.entrySet();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MapStringInteger)) return false;
        MapStringInteger mapStringInteger = (MapStringInteger) o;
        return stringIntegerMap.equals(mapStringInteger.stringIntegerMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stringIntegerMap);
    }

    @Override
    public String toString() {
        return "MapStringInteger{" +
                "stringIntegerMap=" + stringIntegerMap +
                '}';
    }
}
