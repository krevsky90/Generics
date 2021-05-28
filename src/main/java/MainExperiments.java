import java.util.ArrayList;
import java.util.List;

public class MainExperiments {
    public static void main(String[] args) {

        /**
         * + 2) � ��� �������?
         *     List<?> list
         *     List<Object> list
         *     �����:
         *         List<?> list - ���� � ����������� �����
         *         List<Object> list - ���� � ����� �����
         *         You can assign List<String>, List<Integer> to List<?>
         *         but you can not assign List<String> to List<Object>.
         */
        List<?> listOfAnyType;
        List<Object> listOfObjectType;
        //ok:
        listOfAnyType = new ArrayList<String>();
        listOfAnyType = new ArrayList<Integer>();

        //not ok:
//        listOfObjectType = new ArrayList<String>();
    }

    /**
     * 1) � ��� �������?
     * Set<? extends MyClass>
     * Set<T extends MyClass>
     * �����:  ������� ����������, ����� ����� �������� ���������� � ���� ��������.
     * ��������, ����� ������ ���������� �������� ������������� ����. �� �� ����� ������� ��� ?, �� ����� ������� T
     * ������:
     */
//    private static ? gPrint(List<? extends Number> l) {
//        for (Number n : l) {
//            System.out.println(n);
//        }
//    }
    private static <T extends Number> T gPrintA(List<T> l) {
        T res = null;
        for (T n : l) {
            System.out.println(n);
            res = n;
        }

        return res;
    }


}
