package generics;

public class ConstructorGeneric {
    private double val;

    public <T extends Number> ConstructorGeneric(T val) {
        this.val = val.doubleValue();
    }

    public void showVal(){
        System.out.println("val is = "+val);
    }
}
