import java.util.ArrayList;
import java.util.List;

public class MainExperiments {
    public static void main(String[] args) {

        /**
         * + 2) в чем разница?
         *     List<?> list
         *     List<Object> list
         *     ответ:
         *         List<?> list - лист с НЕИЗВЕСТНЫМ типом
         *         List<Object> list - лист с ЛЮБЫМ типом
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
     * 1) в чем разница?
     * Set<? extends MyClass>
     * Set<T extends MyClass>
     * ответ:  разница начинается, когда нужно повторно обратиться к типу элемента.
     * например, метод должен возвращать значение передаваемого типа. Мы не можем вернуть тип ?, но можем вернуть T
     * пример:
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
