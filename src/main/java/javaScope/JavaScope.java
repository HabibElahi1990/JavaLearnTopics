package javaScope;

public class JavaScope {

    private Integer i=getNum();

    {
        System.out.println("initial scope");
        i=15;
    }

    public JavaScope(Integer i) {
        System.out.println("initial constructor");
        this.i = i;
    }

    private Integer getNum() {
        System.out.println("initial property");
        return 10;
    }

    public static void main(String[] args) {
        JavaScope javaScope = new JavaScope(20);
        System.out.println(javaScope.i);
        /*
        initial property
        initial scope
        initial constructor
        20
         */
    }
}
