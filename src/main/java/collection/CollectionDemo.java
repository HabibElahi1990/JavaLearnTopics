package collection;

/**
 * Created by h.elahi on 5/16/2019.
 */
public class CollectionDemo {

    public static void main(String[] args) {
        JavaCollectionImplementation javaList = new JavaCollectionImplementation();

//        Queue is like Array List
//        Array List methods
        javaList.arrayListMethod();

//        linked List Method
        javaList.linkedListMethod();

//        set list Collection
        javaList.setCollection();

//        map list Collection
        javaList.mapCollection();

//        stack list Method
        javaList.stackMethod();

        //Queue list Method
        javaList.queueCollection();

        //spliterator list method
        javaList.spliteratorCollection();
    }
}
