package wildcards;

import wildcards.structure.ISuperClass;
import wildcards.structure.SubClass;
import wildcards.structure.SubSubClass;
import wildcards.structure.SuperClass;

import java.util.*;

/**
 * https://javarevisited.blogspot.com/2011/09/generics-java-example-tutorial.html
 * <p>
 * <? extends SomeType> - bounded wildcard
 */
public class BoundedWildcards {
    public static void main(String[] args) {
        //5. Bounded wildcards:
        // ��������� ��� ���������� ���, ����� � ��� ���� �����������
        List<? extends Number> numList5 = new ArrayList<Integer>();
        //cannot be compiled since there is restriction of type: it should be Number or extend it/its child type
        //numList5 = new ArrayList<String>();

        //6. compiled properly
        List<? extends Number> numList6 = new ArrayList<Integer>();
        numList6 = new ArrayList<Double>();
        //or
        List<? extends SuperClass> intList6 = new ArrayList<>();
        intList6 = new ArrayList<SubClass>();
        /**
         * ����: <?> �����, ��� <T> ���, ��� ����� ��������� read/remove ��������, �� ���� ����
         * �.�. ��� �������� �� �������� ������� ������������ ����� � �������
         */

        //7. to sum numbers with different types using wildcard
        //���������, ��� ������� ������� � ��������� ���� � �������
        // List<? extends Number> numList = new ArrayList<>();
        // numList.add(new Double(4.5));
        //�� ���������!
        //���� ��������� Arrays.asList!
        Double res = sum(Arrays.asList(new Double(4.5), new Float(2.2)));
        System.out.println("res = " + res);

        //8. super
        /**
         * my hierarchy:
         * ISuperClass
         *             SuperClass
         *                 SubClass
         *                     SubSubClass
         */
        // Set<? super SubClass> s = new HashSet<SubSubClass>(); illegal
        Set<? super SubClass> s = new HashSet<SuperClass>();    //legal
        List<? super SubClass> intList8 = new ArrayList<SubClass>();
        intList8.add(new SubClass(5));

        //������: ������ ����� ��������� �������� ������? (SubSubClass)
        //�����: ������ ��� ��� �� �������� ���� ��������� � �����
        intList8.add(new SubSubClass(2));

        //������� �������� super ���������
        ISuperClass sClass = new SubClass(1);
        //        intList8.add(sClass); compile error, ������ ��� ���� �� ����� ������ ����� ���� �� ��������.
        // ��� ����� ����� ������ ������ � �� �� ���� ��������� � ���� ���������? super
    }

    //to sum numbers with different types
    public static Double sum(List<? extends Number> numList) {
        Double result = 0.0;
        for (Number num : numList) {
            result += num.doubleValue();
        }
        return result;
    }
}
