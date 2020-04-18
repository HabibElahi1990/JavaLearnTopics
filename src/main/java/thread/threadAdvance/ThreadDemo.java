package thread.threadAdvance;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.*;

public class ThreadDemo {
    public static void main(String[] args) {
        // use semaphore
        semaphoreMethod();

        //countDownLatch
        countDownLatchMethod();

        //Executors
        ExecutorMethod();


    }

    public static void semaphoreMethod() {
         /*
        when we use semaphore for Synchronizers
        we demonstrate permit for semaphore like 1 or 2 and so forth
        finally in the count of permit threads cas run and execute of run`s commands
        in semaphore if permit equals 1 thread 1 start and finish then thread2 start and finish and so on
        if permit equals 2 thread 1 start thread 2 start too when thread 1 or 2 finish thread 3 start
        it means 2 thread run concurrently
        if permit 3 it means 3 thread run concurrently
        and so on
         */
        Semaphore semaphore = new Semaphore(1);
        Runnable run = () -> {
            try {
                semaphore.acquire();
                String name = Thread.currentThread().getName();
                System.out.println(name + " start ");
                Thread.sleep(100);
                System.out.println(name + " end ");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
//        for (int i = 0; i < 10; i++)
//            new Thread(run).start();


        /*
        Thread-1 start
        Thread-1 end
        Thread-6 start
        Thread-6 end
        Thread-7 start
        Thread-7 end
        Thread-8 start
        Thread-8 end
        Thread-5 start
        Thread-5 end
        Thread-3 start
        Thread-3 end
        Thread-0 start
        Thread-0 end
        Thread-2 start
        Thread-2 end
        Thread-9 start
        Thread-9 end
        Thread-4 start
        Thread-4 end
         */

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ;
        System.out.println("**************************************\n");

        Semaphore sem = new Semaphore(2);
        Runnable r1 = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " run ");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " finish ");
                sem.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        };

        Runnable r2 = () -> {
            try {
                sem.acquire();
                System.out.println(Thread.currentThread().getName() + " run ");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " finish ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread th1 = new Thread(r1);//producer
        Thread th2 = new Thread(r2);//consumer

        th1.start();
        th2.start();

        /*

        Thread-0 run
        Thread-1 run
        Thread-1 finish
        Thread-0 finish
         */
    }

    public static void countDownLatchMethod() {

        /*
        when we use CountDownLatch and permit size
        each thread started
        if every thread use await() in means current thread must wait until other thread s became finish
        for this event other thread must use countDown() that say job from thread is finish
         */
        CountDownLatch latch = new CountDownLatch(2);
        Runnable r1 = () -> {
            System.out.println(Thread.currentThread().getName() + " start ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end ");
            latch.countDown();
        };

        Runnable r2 = () -> {

            System.out.println(Thread.currentThread().getName() + " start ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end ");
            latch.countDown();
        };


        Runnable r3 = () -> {
            try {
                latch.await();
                System.out.println(Thread.currentThread().getName() + " start ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end ");
        };
        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();

        /*
        Thread-1 start
        Thread-0 start
        Thread-1 end
        Thread-0 end
        Thread-2 start
        Thread-2 end
         */

    }

    public static void ExecutorMethod(){
        ExecutorService e= Executors.newFixedThreadPool(2);
        Runnable runnable=()->{
            for (int i=0;i<3;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        };
        e.execute(new Thread(runnable));
        e.execute(new Thread(runnable));

        e.shutdown();

        /*
        pool-1-thread-2 0
        pool-1-thread-1 0
        pool-1-thread-2 1
        pool-1-thread-1 1
        pool-1-thread-2 2
        pool-1-thread-1 2
         */

        ExecutorService ex=Executors.newFixedThreadPool(4);
        Queue<Integer> integerQueue=new ArrayDeque<>();
        integerQueue.add(5);
        integerQueue.add(4);
        integerQueue.add(1);
        integerQueue.add(3);
        for (Integer num:integerQueue) {
            Callable<Integer> integerCallable = new QueueCallable(num);
            Future<Integer> integerFuture=ex.submit(integerCallable);

            try {
                if(integerFuture.get()!=null){
                    System.out.println(num+" is Done ");
                    integerQueue.remove(num);
                }
            } catch (InterruptedException | ExecutionException e1) {
                e1.printStackTrace();
            }
        }
        /*
        pool-2-thread-1 - num is 5
        5 is Done
        pool-2-thread-2 - num is 4
        4 is Done
        pool-2-thread-3 - num is 1
        1 is Done
        pool-2-thread-4 - num is 3
        3 is Done
         */
        ex.shutdown();
    }
}

class QueueCallable implements Callable<Integer>{
    private Integer num;

    public QueueCallable(Integer num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        ThreadService threadService=new ThreadService();
        threadService.sendInteger(num);
        return num;
    }
}

