package lab_16.ex_1;

public class ex_1 {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
//        new Thread(producer).start();
//        new Thread(consumer).start();

        Thread tp = new Thread(producer);
        Thread tc = new Thread(consumer);

        tp.setDaemon(true);
        tc.setDaemon(true);

        tp.start();
        tc.start();

        try {
            Thread.sleep(100); // УВЕЛИЧЕННОЕ ВРЕМЯ
        } catch (InterruptedException e) {}

        System.out.println("\nГлавный поток завершен\n");
        System.exit(0);
    }
}

