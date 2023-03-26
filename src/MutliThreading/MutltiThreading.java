package MutliThreading;

public class MutltiThreading implements Runnable {
    public static void main(String[] args) {
        MutltiThreading mt1= new MutltiThreading();

        mt1.run();

        Thread.currentThread();
        Thread t1= new Thread(mt1);

        t1.start();
        Thread.currentThread();
    }


    @Override
    public void run() {
        System.out.println("We are in run method");
    }
}
