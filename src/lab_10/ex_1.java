package lab_10;

import javax.swing.*;

public class ex_1 {
    public static void main(String[] args) {
        // Создание объекта:
        MyClass A = new MyClass(10, 200);

        // Изменение значения статического поля (использована ссылка на класс):
        MyClass.N2 = 50;

        // Отображение полей объекта:
        A.show();

        // Создание нового объекта:
        MyClass B = new MyClass(1, 2);

        // Отображение полей первого объекта:
        A.show();

        // Изменение статического поля (использована ссылка на объект):
        B.N2 = -1;

        // Изменение нестатического поля объекта:
        B.N2 = 2;

        // Проверка значений первого объекта:
        A.show();
    }
}

class MyClass {
    // Статическое поле класса:
    static int N2;
    // Нестатическое поле:
    int N1;

    // Конструктор класса:
    MyClass(int n1, int n2) {
        N1 = n1;
        N2 = n2;
        String text = "Создан новый объект!\n";
        text += "Статическое поле: " + N1 + "\n";
        text += "Нестатическое поле: " + N2;
        JOptionPane.showMessageDialog(null, text);
    }

    // Метод для отображения значений полей:
    void show() {
        String text = "Поля объекта:\n";
        text += "Статическое поле: " + N1 + "\n";
        text += "Нестатическое поле: " + N2;
        JOptionPane.showMessageDialog(null, text);
    }
}

