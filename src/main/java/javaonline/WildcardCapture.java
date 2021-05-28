package javaonline;

import java.util.List;

/**
 * ��� ��� ��� ���� ����� �� ������ 1 �� readme.txt ��� Set<T> vs Set<?>
 */
public class WildcardCapture {
    //�������� ����������� � ���, ��� ����� List.set() �� ����� �������� � List<?>,
    // ��� ��� ��� �� �������� ��� List. � ���� �� ���������� ������� Producer Extends Consumer Super,
    // �.�. List<?> ����������� List<? extends Object>, � ��� ������, ��� ����� ���� �������� ��������, �� �� ���������

    // ��� ������� ���� �������� ���������� Wildcard Capture (��� "Capture helpers"),
    // �.�. ���������� ����������.
    // ������� ��� ���� ����� � ����������������� ���������� � ����� ��� ������������ ������ ������ ������.
    private static void swap(List<?> list, int i, int j) {
        swap2(list, i, j);
//        list.set(i, list.get(j)); // ������
    }

    private static <T> void swap2(List<T> list, int i, int j) {
        list.set(i, list.get(j));
    }
}
