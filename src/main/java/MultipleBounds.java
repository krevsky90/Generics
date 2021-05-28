/**
 * https://habr.com/ru/company/sberbank/blog/416413/
 * <p>
 * ����� �� ���������� ��� ���������� ������ ��� ������ ������������� � ������� �������,
 * �������� <T> ��� <E>, �� ������� ���������� ����.
 * ���������� ���� � ��� ������������������� �������������,
 * ������� ����� ������������ � �������� ���� � ���� ������ ��� ������.
 * <p>
 * NOTE: ����������� �� ������ ������!
 */
public class MultipleBounds {
    // recursive - ������ ��� Comparable ����� <T>
    // multiple - ������ ��� T ����������� �� ������ Object, � ����� ����������� ��������� Comparable
    public <T extends Object & Comparable<T>> T recursiveMultipleBoundMethod() {
        T res = null;

        return res;
    }


}
