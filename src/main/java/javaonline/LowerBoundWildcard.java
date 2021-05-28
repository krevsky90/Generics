package javaonline;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * http://java-online.ru/java-generic.xhtml
 */
public class LowerBoundWildcard {
    public static void main(String[] args) {
        //6. Lower bounded wildcard
        List<Integer> il = Arrays.asList(1, 2, 3);
        Integer I = max1(il);
        List<LowerBoundTest> tl = Arrays.asList(new LowerBoundTest(), new LowerBoundTest());
        //Ошибка возникает из-за того, что LowerBoundTest реализует интерфейс Comparable<Object>.
        // Решение этой проблемы - Lower bounded wildcard ("Ограничение снизу").
        // Суть заключается в том, что необходимо реализовывать метод не только для Т,
        // но и для его супертипов (родительских типов) - см метод max2

        //если написать private static <T extends Comparable<T>> T max1(Collection<T> c) {
        //то компилиться будет, но зависимость от Т пропадет
//        LowerBoundTest t1max = max1(tl); // Ошибка

        LowerBoundTest t2max = max2(tl); // НЕТ ошибки
    }

    //Метод нахождения максимума в коллекции
    private static <T extends Comparable<T>> T max1(Collection<T> c) {
        T max = c.iterator().next();
        for (T t : c) {
            if (max.compareTo(t) >= 0) {
                max = t;
            }
        }

        return max;
    }

    private static <T extends Comparable<? super T>> T max2(Collection<T> c) {
        T max = c.iterator().next();
        for (T t : c) {
            if (max.compareTo(t) >= 0) {
                max = t;
            }
        }

        return max;
    }

    private static class LowerBoundTest implements Comparable<Object> {
        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
}
