package thread.threadBase;

import java.util.Timer;
import java.util.TimerTask;

public class ThreadDemo {
    public static void main(String[] args) {
        // for creating thread there are two ways for int . first extends Thread class
        // second implements of Runnable Interface and pass it two new Thread as arg

        //the first way
        ThreadExtendsThreadClass t1 = new ThreadExtendsThreadClass();
        t1.start();

        //the second way
        ThreadImplementRunnableInterface t2 = new ThreadImplementRunnableInterface();
        Thread t = new Thread(t2);
        t.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    if (!Thread.currentThread().isInterrupted())
                        //by Thread.sleep thread is stop for 2500 ms
                        Thread.sleep(1000);


                    while (Thread.currentThread().isAlive()) {
                        i = printNum(i);
                        if (i == 10000) {
                            break;
                        }

                    }


                    //by Thread.currentThread() can available current thread
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("error");
                }


            }


        };

        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r1);
        Thread th3 = new Thread(r1);
        th1.setPriority(Thread.MAX_PRIORITY);
        th3.setDaemon(true);
        th1.start();
        th2.start();
        th3.start();
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                th1.interrupt();
                th2.interrupt();
            }
        }
        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("join error");
        }

        System.out.println(th1.getName() + "-" + Thread.currentThread().getState());

        //th1 is run 9999
        //th2 is run 9999
        //th3 is run 7394 so that daemon
        PrimaryKey primaryKey=new PrimaryKey();
        Runnable getId1=()->{
            try {
                ID=primaryKey.getId();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ID);
        };

        Runnable getId2=()->{
            try {
                ID=primaryKey.getId();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ID);
        };

      //without synchronized for getId method both thread return 0 for id
      // but with synchronized Respectively thread1 return 0 and thread2 return 1
      Thread getIdTh1=new Thread(getId1,"getIdTh1");
      Thread getIdTh2=new Thread(getId2,"getIdTh2");
      getIdTh1.start();
      getIdTh2.start();

        MyClass myClass = new MyClass();
        new Producer(myClass).start();
        new Consumer(myClass).start();
        /*
        threadBase.Producer Habib
        threadBase.Producer Java
        threadBase.Producer Spring
        threadBase.Consumer Habib
        threadBase.Consumer Java
        threadBase.Producer Thread
        threadBase.Consumer Spring
        threadBase.Consumer Thread
         */

        //TimerTask is a class that  implements Runnable
        // thus TimerTask is a Thread
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis());
            }
        };
        Timer timer=new Timer();
        timer.schedule(timerTask,1,1000);
        /*
        1586810506862
        1586810507863
        1586810508863
        1586810509864
        1586810510864
        1586810511864
         */


    }

    private static int printNum(Integer i) {
        System.out.println(Thread.currentThread().getName() + "-" + i++ + " ");
        return i;
    }

    private static Integer ID;
}
