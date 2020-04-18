package objectOriented.learn;

/**
 * Created by h.elahi on 6/8/2019.
 */
class Square implements Shape {

    //Encapsulation
    private Integer length;
    private Integer width;

    public void draw() {
        System.out.println("draw Square");
    }

    //
    Square() {}

    Square(Integer length, Integer width) {
        this.setLength(length);
        this.setWidth(width);
    }

    protected void area() {
        System.out.println("Square area : " + this.getLength() * this.getWidth());
    }

    Integer getLength() {
        return length;
    }

    private void setLength(Integer length) {
        this.length = length;
    }

    Integer getWidth() {
        return width;
    }

    private void setWidth(Integer width) {
        this.width = width;
    }
}
