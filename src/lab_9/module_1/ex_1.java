package lab_9.module_1;

public class ex_1 {
    public static void main(String[] args) {
        Person Катя = new Person("Катя", 32, "пр. Гагарина", "+7 953 456 9876");
        Катя.вывестиИмя();
        Катя.вывестиВозраст();
        Катя.вывестиТелефон();
        Катя.вывестиАдрес();

        System.out.println(Катя.имя);
        System.out.println(Катя.адрес);
        System.out.println(Катя.возраст);
        System.out.println(Катя.телефон);
    }
}

class Person {
    String имя;
    protected int возраст;
    public String адрес;
    public String телефон;

    public Person(String имя, int возраст, String адрес, String телефон) {
        this.имя = имя;
        this.возраст = возраст;
        this.адрес = адрес;
        this.телефон = телефон;
    }

    public void вывестиИмя() {
        System.out.printf("имя: %s\n", имя);
    }

    void вывестиВозраст() {
        System.out.printf("возраст: %d\n", возраст);
    }

    public void вывестиАдрес() {
        System.out.printf("адрес: %s\n", адрес);
    }

    protected void вывестиТелефон() {
        System.out.printf("телефон: %s\n", телефон);
    }
}