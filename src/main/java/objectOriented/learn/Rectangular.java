package objectOriented.learn;

/**
 * Created by h.elahi on 6/8/2019.
 */ //Inheritance
class Rectangular extends Square {

    Rectangular(Integer length, Integer width) {
        super(length, width);
    }

    //Polymorphism
    @Override
    protected void area() {
        System.out.println("Rectangular area : " + super.getLength() * super.getWidth());
    }
}
