package generic_type; /**
 * Created by krevsky on 22.08.2019.
 */

/**
 * Example of Generic Type
 *
 * @param <T>
 */
public class BoxGenericType<T> {
    private T v;

    public BoxGenericType(T v) {
        this.v = v;
    }

    public T getV() {
        return v;
    }

    public String getType() {
        return this.v.getClass().getName();
    }

    public void setV(T v) {
        this.v = v;
    }
}
