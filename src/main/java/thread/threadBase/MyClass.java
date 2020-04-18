package thread.threadBase;

public class MyClass {
    private String name;
    private volatile Boolean waitFlg = true;

    public synchronized void setName(String name) {
        while (!waitFlg)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        this.name = name;
        waitFlg = false;
        notify();
    }

    public synchronized String getName() {
        while (waitFlg)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        waitFlg = true;
        notify();
        return name;
    }
}
