import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 2: множество целых чисел");
        setOfIntegers();
    }

    private static void setOfIntegers() {
        Set<Integer> integers = new HashSet<>(20);
        Random random = new Random();
        while (integers.size() < 20) {
            integers.add(random.nextInt(0, 1000));
        }
        System.out.println(integers);
        Iterator<Integer> integerIterator = integers.iterator();
        while (integerIterator.hasNext()) {
            int integer = integerIterator.next();
            if (integer % 2 != 0) {
                integerIterator.remove();
            }
        }
        System.out.println(integers);
    }
}
