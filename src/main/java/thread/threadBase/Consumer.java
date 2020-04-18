package thread.threadBase;

public class Consumer extends Thread{

    private final MyClass myClass;


    public Consumer(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run() {
        for (int i=0;i<4;i++){
            System.out.println("threadBase.Consumer "+myClass.getName());
        }
    }
}
