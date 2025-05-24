package lab_11;

class Kласс_1 {
    int chislo;
    char simvol;
    Kласс_1(int number, char symbol) {
        chislo = number;
        simvol = symbol;
    }
    void show() {
        System.out.println("В методе show() печатаются поля объекта: chislo = " + chislo + " simvol = " + simvol);
    }
}

public class ex_1 {
    public static void main(String[] args) {
        Kласс_1 obj = new Kласс_1(2, 'a');
        System.out.println("main 15: в методе obj.show() будут напечатаны начальные значения полей объекта obj");
        obj.show();

        ПримерРаботы.Изменить(obj);
        System.out.println("main 23: в методе obj.show() будут напечатаны поля объекта obj после работы метода Изменить(obj)");
        obj.show();

        ПримерРаботы.Изменить(obj.chislo, obj.simvol);
        obj.show();
    }
}

class ПримерРаботы {
    static void Изменить(Kласс_1 obj) {
        obj.chislo = 2;
        obj.simvol = 'b';
        System.out.println("В методе Изменить(Kласс_1 obj) печатается Изменение полей объекта: поле chislo = " + obj.chislo + ", chislo = " + obj.chislo + ", поле simvol = " + obj.simvol);
    }

    static void Изменить(int number, char symbol) {
        number = 3;
        symbol = 'c';
        System.out.println("В методе Изменить(int number, char symbol) печатается не поля объекта, а изменённые базовые аргументы, : number = " + number + " symbol = " + symbol);
    }
}

