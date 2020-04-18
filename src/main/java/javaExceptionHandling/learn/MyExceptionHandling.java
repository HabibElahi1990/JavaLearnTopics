package javaExceptionHandling.learn;

/**
 * Created by h.elahi on 5/16/2019.
 */
public class MyExceptionHandling extends Exception{

    private Integer errorCode;
    private String errorMessage;

    /**
     * @param errorCode
     * @param errorMessage
     */
    MyExceptionHandling(Integer errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    MyExceptionHandling() {
        super();
    }

    @Override
    public String toString() {
        return this.errorCode.toString().concat(" : ").concat(this.errorMessage);
    }



}
