package objectOriented.learn;


/**
 * Created by h.elahi on 5/16/2019.
 */

/*
*this example we use nested class (Circle,Square,Rectangular,...) and on interface(Shape)
* we implementation Polymorphism by interface in circle , square
*
 */
class ObjectOrientedConcepts {

    public static void main(String[] args) {
        //OOPSConcepts
        OOPSConcepts();
    }

    public static void OOPSConcepts(){
        Shape sh=new Circle();
        sh.draw();//draw Circle

        Shape sha=new Square();
        sha.draw();//draw Square

        Square sq=new Square(5,5);
        sq.area();//Square area : 25

        Rectangular rectangular=new Rectangular(10,12);
        rectangular.area();//Rectangular area : 120
    }
}

