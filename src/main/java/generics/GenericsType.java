package generics;

/**
 * Created by Habib on 8/19/2019.
 */

/*
*by define T in GenericsType<T> we can create kind types from  types
* like String ,Integer and ...
*/
/*
* we can define generics interface like Comparable<T>
 */
public class GenericsType<T extends Comparable<T>> implements Comparable<T>,InterfaceGeneric<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int compareTo(T o) {
        return 0;
    }
    /*
    * we can define generics method
     */
    public static <T> Boolean equalGenericsType(GenericsType<? extends T> gt1,GenericsType<? extends T> gt2){
        if(gt1.getT().equals(gt2.getT())){
            return true;
        }
        return false;
    }

    @Override
    public T min() {
        return t;
    }
}
