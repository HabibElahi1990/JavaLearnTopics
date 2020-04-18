package generics;

public interface InterfaceGeneric<T extends Comparable<T>> {
    T min();
}
