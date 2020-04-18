package generics;

/**
 * Created by Habib on 8/19/2019.
 */
public class GenericsTypeBounded<T extends Number>  {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}
