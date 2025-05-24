package lab_9.module_1.ex_4;

public class Dog {
    private String name;
    private int age;
    private int weight;

    // Конструктор с параметрами
    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Конструктор без параметров
    public Dog() {
    }

    // Метод "Гав-гав!"
    public void sayGav() {
        System.out.println("Гав-гав!");
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
