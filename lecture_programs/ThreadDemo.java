package lecture_programs;


class MyThread implements Runnable
{
    String s1;

    public MyThread(String s1) {
        this.s1 = s1;
    }
    
    public void run()
    {
        for(int i=0;i<5;i++)
            try{
                  System.out.println("MyThread is running.... " + s1);
                  Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        
    }
    
}

class ThreadDemo
{
    public static void main(String[] args)
    {
        System.out.println("Main thread is running....");
        
        MyThread m1 = new MyThread("First Thread");   // NEW BORN  -  CAN WORK AS A THREAD BUT NOT A THREAD
        Thread t1 = new Thread(m1); // CONVERTING YOUR RUNNABLE CLASS INTO THREAD CLASS
        
        MyThread m2 = new MyThread("Second Thread");
        Thread t2 = new Thread(m2);
        
        
        t1.start();   // GO Inside Ready Queue  -- waiting for its turn
        t2.start();
    }
}