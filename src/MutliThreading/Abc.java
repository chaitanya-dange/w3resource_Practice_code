package MutliThreading;

public class Abc {
    public static void main(String []args) throws InterruptedException {
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("in thread 1 oprations");
            }
        });

        System.out.println( t1.getState());
        t1.start();
        System.out.println( t1.getState());
//        Thread.sleep(1000);
      System.out.println( t1.getState());

    }





}
