package arrays;

/**
 * Generic Holder for holding contents of different object type
 * Generic in Java eliminates casting required while calling get(index) from client code
 *
 * @param <T> Read more: https://javarevisited.blogspot.com/2011/09/generics-java-example-tutorial.html#ixzz6IlQ6J8WD
 */
public class Holder<T> {
    private T[] content;
    private int index = 0;

    /**
     * Casting code may generate warning about "unsafe cast"
     * which can be suppressed by using annotation @SuppressWarnings("unchecked")
     * with a proper comment that why it will not compromise type-safety.
     * This is also one of the Java Generics best practices suggested in all time classic book Effective Java by Joshua Bloch.
     *
     * @param size
     */
    @SuppressWarnings("unchecked")
    public Holder(int size) {
//        content = new T[size];            //compiler error - generic array creation
        content = (T[]) new Object[size];    //workaround - casting Object[] to generic Type
    }

    public void add(T v) {
        content[index] = v;
        index++;
    }

    public T get(int index) {
        return content[index];
    }
}
