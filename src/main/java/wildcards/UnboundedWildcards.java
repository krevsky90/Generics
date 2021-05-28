package wildcards;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * https://javarevisited.blogspot.com/2011/09/generics-java-example-tutorial.html
 * <p>
 * <?> - unbounded wildcard
 */
public class UnboundedWildcards {
    public static void main(String[] args) {
        //2. compiled
        List<?> intList = new ArrayList<Integer>();

        //3.
        List<?> intList2 = new ArrayList<Integer>();
        //cannot be compiled
        /**
         * ��� ������������� ����� �� �� �����, ������ ���� �������� ����� ���� �������.
         * ��� ����� ����� ����������� ������, �.�. ���� �� ���������� ���� ��������,
         * �� �� ����� �� ���������� �������� � ��� ������, ��������������� ��� �����, ��������� ��������.
         * �� ��������� ���� ��������, ���������� �� ��������� �������� ������, ������� ����� �������� ���������� ���
         */
//        intList2.add(new Integer(10));
        /**
         * ���� ����� ������� ������ �� ���������, �.�. ��� type-safety
         * ��� ���������
         */
        intList2.remove(new Integer(1));

        //4. bad practice but it works
        List<?> numList4 = new ArrayList<Integer>();
        numList4 = new ArrayList<String>();

        //5. Example of application
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);
        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("100");
        printList(strList);
    }

    private static void printList(List<?> list) {
        for (Object l : list)
            System.out.println("{" + l + "}");
    }
}
