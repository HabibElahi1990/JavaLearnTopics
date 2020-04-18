package javaExceptionHandling.example;

public class PersonInfoException extends Exception{

    private int code;

    public PersonInfoException() {
        super();
    }
    public PersonInfoException(Integer code, String msg) {
        super(msg);
        this.code=code;
    }

    @Override
    public String toString() {
        return this.code+ " : " +super.toString();
    }
}
