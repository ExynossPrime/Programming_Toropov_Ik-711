package lab_9.module_1.ex_4;

public class ex_4 {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 3, 12);
        dog.sayGav();
        System.out.println("Имя: " + dog.getName());
        System.out.println("Возраст: " + dog.getAge());
        System.out.println("Вес: " + dog.getWeight());
    }
}
