package lab_16.ex_1;

public class Store
{
    private int counter = 0;

    public synchronized void get() {
        while (counter < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        counter--;
        System.out.println("-1 : товар забрали");
        System.out.println("\tколичество товара на складе : " + counter);
        notify();
    }

    public synchronized void put() {
        while (counter >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        counter++;
        System.out.println("+1 : товар добавили");
        System.out.println("\tколичество товара на складе : " + counter);
        notify();
    }
}

