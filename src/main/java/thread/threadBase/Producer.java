package thread.threadBase;

import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread {
    private final MyClass myClass;


    public Producer(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run() {
        List<String> stringList = new ArrayList<>() {{
            add("Habib");
            add("Java");
            add("Spring");
            add("Thread");
        }};
        for (String str:stringList) {
            System.out.println("threadBase.Producer " +str);
            myClass.setName(str);
        }
    }
}
