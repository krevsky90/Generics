import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * http://java-online.ru/java-generic.xhtml
 */
public class ExtraExamples {
    public static void main(String[] args) {
        addAll(new ArrayList<Integer>(), new ArrayList<Integer>());
        addAll(new ArrayList<Integer>(), new ArrayList<Object>());
    }

    //Метод копирования из одной коллекции в другую
    private static <M, N extends M> void addAll(Collection<N> c, Collection<M> c2) {
        for (Iterator<N> i = c.iterator(); i.hasNext(); ) {
            N o = i.next();
            c2.add(o);
        }
    }
}
