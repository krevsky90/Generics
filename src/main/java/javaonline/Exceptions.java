package javaonline;

public abstract class Exceptions<T extends Throwable> {

    abstract void process() throws T; // ok

    void doWork() {
        try {
            System.out.println("");
//            process();  // compile-time error
//        } catch (T e) { // compile-time error
            // использовать тип, заданный в качестве параметра, в catch-выражени€х Ќ≈Ћ№«я
        } finally {
            //empty
        }
    }

    //можно сгенерировать исключение, тип которого задаетс€ generic-параметром,
    // но экземпл€р должен быть создан извне.
    // Ёто ограничение порождаетс€ одним из ограничений Java generic'ов - нельз€ создать объект,
    // использу€ оператор new, тип которого €вл€етс€ параметром generic'а.
    void doThrow(T except) throws T {
        throw except; // ok
    }
}