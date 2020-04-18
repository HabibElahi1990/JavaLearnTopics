package thread.threadBase;

public class PrimaryKey {
    private static int id;

    //without synchronized for getId method both thread return 0 for id
    // but with synchronized Respectively thread1 return 0 and thread2
    public synchronized static int getId() throws InterruptedException {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        return id++;
    }

}
