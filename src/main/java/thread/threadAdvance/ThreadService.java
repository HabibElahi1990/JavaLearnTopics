package thread.threadAdvance;

public class ThreadService {
    public void sendInteger(Integer num){
        System.out.println(Thread.currentThread().getName()+" - num is "+num);
    }
}
