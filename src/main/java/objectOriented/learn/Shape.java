package objectOriented.learn;

/**
 * Created by h.elahi on 6/8/2019.
 */
interface Shape {

    void draw();
    default void draw(String test){
        System.out.println("Test");
    }
}
