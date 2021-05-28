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
        //������ ��������� ��-�� ����, ��� LowerBoundTest ��������� ��������� Comparable<Object>.
        // ������� ���� �������� - Lower bounded wildcard ("����������� �����").
        // ���� ����������� � ���, ��� ���������� ������������� ����� �� ������ ��� �,
        // �� � ��� ��� ���������� (������������ �����) - �� ����� max2

        //���� �������� private static <T extends Comparable<T>> T max1(Collection<T> c) {
        //�� ����������� �����, �� ����������� �� � ��������
//        LowerBoundTest t1max = max1(tl); // ������

        LowerBoundTest t2max = max2(tl); // ��� ������
    }

    //����� ���������� ��������� � ���������
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
