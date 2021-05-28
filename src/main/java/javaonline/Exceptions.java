package javaonline;

public abstract class Exceptions<T extends Throwable> {

    abstract void process() throws T; // ok

    void doWork() {
        try {
            System.out.println("");
//            process();  // compile-time error
//        } catch (T e) { // compile-time error
            // ������������ ���, �������� � �������� ���������, � catch-���������� ������
        } finally {
            //empty
        }
    }

    //����� ������������� ����������, ��� �������� �������� generic-����������,
    // �� ��������� ������ ���� ������ �����.
    // ��� ����������� ����������� ����� �� ����������� Java generic'�� - ������ ������� ������,
    // ��������� �������� new, ��� �������� �������� ���������� generic'�.
    void doThrow(T except) throws T {
        throw except; // ok
    }
}