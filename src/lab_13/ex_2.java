package lab_13;

import javax.swing.*;

public class ex_2 {
    public static void main(String[] args){
        // Создание объектов:
        AssignObj objA=new AssignObj();
        AssignObj objB=new AssignObj("Второй объект!");
        // Отображение текстовых полей объектов:
        objA.show();
        objB.show();
        // Присваивание объекта:
        objA=objB;
        // Изменение поля первого объекта:
        objA.text="Изменён второй объект!";
        // Текстовое поле первого объекта:
        objA.show();
    }
}

class AssignObj{
    // Текстовое поле класса:
    String text;
    // Конструктор класса (без аргумента):
    AssignObj(){
        text="Новый объект!";
    }
    // Конструктор класса (с одним аргументом):
    AssignObj(String str){
        text=str;
    }
    // Метод для отображения текста:
    void show(){
        JOptionPane.showMessageDialog(null, text);
    }
}