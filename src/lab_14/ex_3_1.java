package lab_14;

class Counter {
    private static int count = 0;  // статическое поле
    private int id;

    public Counter() {
        id = ++count;  // каждый новый объект получает уникальный id
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }
}

// Использование:
public class ex_3_1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Создано объектов: " + Counter.getCount()); // 3
        System.out.println("ID первого: " + c1.getId()); // 1
        System.out.println("ID второго: " + c2.getId()); // 2
    }
}

