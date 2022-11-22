package iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
//Задача на итератор, от 09.11.22, ДЗ 2 -2
public class HomeWorkIterator {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>(20);
        Random random = new Random();
        while (integers.size() < 20) {
            integers.add(random.nextInt(1000));
        }
        Iterator<Integer> integerIterator = integers.iterator();
        while (integerIterator.hasNext()) {
            if (integerIterator.next() % 2 != 0) {
                integerIterator.remove();
            }
        }
        System.out.println(integers);
    }
}
