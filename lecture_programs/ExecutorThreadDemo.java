package lecture_programs;
import java.util.concurrent.*;

class Task implements Runnable {

    private String name;

    public Task(String s) {
        name = s;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " - task number - " + i);
                Thread.sleep(1000);
            }
            System.out.println(name + " complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExecutorThreadDemo {

    public static void main(String[] args) {
        
        //CREATING RUNNABLE OBJECTS
        Runnable r1 = new Task("task 1");
        Runnable r2 = new Task("task 2");
        Runnable r3 = new Task("task 3");
        Runnable r4 = new Task("task 4");
        Runnable r5 = new Task("task 5");
        
        //CREATING FIXED SIZE THREAD POOL
        ExecutorService pool = Executors.newFixedThreadPool(3);
        
        //GIVING TASK TO FREE THREADS IN THE POOL
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        
        //SHUTING DOWN THE POOL
        pool.shutdown();
    }
}
