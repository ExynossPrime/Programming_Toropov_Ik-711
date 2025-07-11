package lab_9.module_1.ex_2;

public class Person {
    private String name;
    private int age = 1;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110000000) {
            this.age = age;
        }
    }
}
