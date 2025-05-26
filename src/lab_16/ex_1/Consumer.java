package lab_16.ex_1;

public class Consumer implements Runnable {
    Store store;
    Consumer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}
