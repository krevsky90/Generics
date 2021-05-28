package wildcards.structure;

/**
 * Created by krevsky on 22.08.2019.
 */
public class SuperClass implements ISuperClass {
    protected int v;

    public SuperClass(int i) {
        this.v = i;
    }

    public int getV() {
        return this.v;
    }
}
