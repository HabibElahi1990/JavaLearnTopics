package lambda;

@FunctionalInterface
public interface StringFunc<T> {
    T func(String n);
}
