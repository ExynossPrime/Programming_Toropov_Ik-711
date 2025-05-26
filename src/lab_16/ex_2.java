package lab_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class ex_2 {
    // Главная точка входа в программу, Main Thread
    public static void main(String[] args) {
        // Title
        System.out.println("Cat Fights Console!");
        // Список ссылок-нитей к котам
        List<Cat> catThreads = new ArrayList<>();
        int life = 100000;

        // Создаём и настраиваем несколько котов, добавляем в catThreads
        Collections.addAll(catThreads,
                new Cat("Tom", life, "Thread Tom"),
                new Cat("Cleocatra", life, "Thread Cleocatra"),
                new Cat("Dupli", life, "Thread Dupli"),
                new Cat("Toodles", life, "Thread Toodles")
        );

        // Запускаем котов
        for(Cat cat : catThreads) {
            cat.getThread().start();
        }

        // Ждём, чтобы каждый кот завершил работу, вызываем join() у каждого потока
        for(Cat cat : catThreads) {
            try {
                cat.getThread().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Последний выживший — первый элемент cats
        System.out.println(String.format("Кот-победитель: %s!!!", Cat.cats.get(0)));
    }
}

// Это класс «кот»
class Cat implements Runnable {
    // Статический потокобезопасный список «живых» котов
    public static CopyOnWriteArrayList<Cat> cats = new CopyOnWriteArrayList<>();

    // Имя и количество жизней
    private String name;
    private volatile int life;
    private Thread thread;

    // Конструктор: задаём параметры и добавляем объект в статический список
    public Cat(String name, int life, String threadName) {
        this.name = name;
        this.life = life;
        cats.add(this);
        thread = new Thread(this, threadName);
        System.out.println(String.format("Кот %s создан. HP: %d", this.name, this.life));
    }

    // Атака. Принимает текущего кота и кота-противника. Метод синхронизирован
    public static synchronized void attack(Cat thisCat, Cat enemyCat) {
        // Проверка: если у атакующего нет жизней — не атакует
        if (thisCat.getLife() <= 0) { return; }

        // Если противник имеет жизни
        if (enemyCat.getLife() > 0) {
            enemyCat.decrementLife();
            System.out.println(String.format("Кот %s атаковал кота %s. Жизни %s: %d", thisCat.getName(), enemyCat.getName(), enemyCat.getName(), enemyCat.getLife()));
        }

        // Если противник не имеет жизней
        if (enemyCat.getLife() <= 0) {
            // Удаляем противника из списка котов
            Cat.cats.remove(enemyCat);
            System.out.println(String.format("Кот %s покидает бой.", enemyCat.getName()));
            System.out.println(String.format("Оставшиеся коты: %s", Cat.cats));
            System.out.println(String.format("%s завершает свою работу.", enemyCat.getThread().getName()));
            // interrupt() — прервать работу thread
            enemyCat.getThread().interrupt();
        }
    }

    // Точка входа в поток
    @Override
    public void run() {
        System.out.println(String.format("Кот %s идёт в бой.", name));
        // Пока котов больше 1
        while (Cat.cats.size() > 1) {
            // Атакуем произвольного кота из оставшихся, кроме себя
            Cat.attack(this, getRandomEnemyCat(this));
            try {
                Thread.sleep(100 + new Random().nextInt(200));
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    // Возвращает произвольный объект Cat из cats, кроме самого себя
    private Cat getRandomEnemyCat(Cat deleteThisCat) {
        // Создаем лист-копию из основного листа cats
        List<Cat> copyCats = new ArrayList<>(cats);
        // Удаляем текущего кота, чтобы он не попал в качестве противника
        copyCats.remove(deleteThisCat);
        // Возвращаем произвольного кота из оставшихся с помощью класса util.java.Random
        return copyCats.get(new Random().nextInt(copyCats.size()));
    }

    // Декремент жизней
    public synchronized void decrementLife() { life--; }

    // Нужен для корректного вывода
    @Override
    public String toString() { return name; }

    // Геттеры
    public String getName() { return name; }
    public int getLife() { return life; }
    public Thread getThread() { return thread; }
}

