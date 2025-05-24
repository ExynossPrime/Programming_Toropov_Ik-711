package lab_8;

public class ex_1 {
    public static void main(String[] args) {
        Собака Co61 = new Собака("Шарик", "овчарка", 3);
        Co61.displayInfo();
    }
}

class Собака {
    private String кличка;
    private String порода;
    private int возраст;

    {
        System.out.printf("кличка: %s \t порода: %s \t возраст %d\t\n", кличка, порода, возраст);
        кличка = "Шарик";
        порода = "овчарка";
        возраст = 2;
        System.out.printf("кличка: %s \t порода: %s \t возраст %d\t\n", кличка, порода, возраст);
    }

//    System.out.printf("кличка: %s \t порода: %s \t возраст %d\t\n", кличка, порода, возраст);

    Собака(String x, String y, int z) {
        кличка = x;
        порода = y;
        возраст = z;
        System.out.printf("кличка: %s \t порода: %s \t возраст %d\t\n", кличка, порода, возраст);
    }

    void displayInfo() {
        System.out.printf("кличка: %s \t порода: %s \t возраст %d\t\n", кличка, порода, возраст);
    }
}
