package lab_11;

class MyClass{
    // Имя объекта (текстовое поле):
    String name;
    // Конструктор класса:
    MyClass(String name){
        this.name=name;
    }
    // Метод для отображения имени объекта:
    void show(){
        System.out.println("Объект с именем \"" + name + "\".");
    }
}

public class ex_2 {
    // Статический метод для изменения ссылки на объект:
    static void ChangeRef(MyClass obj){
        // Создается локальный объект:
        MyClass tmp = new MyClass("Локальный Объект");
        // Ссылка на локальный объект присваивается аргументу метода:
        obj = tmp;
        // Проверка имени объекта, на который ссылается аргумент:
        obj.show();
    }
    public static void main(String[] args){
        // Создание объекта:
        MyClass obj = new MyClass("Основной Объект");
        // Проверка имени объекта:
        obj.show();
        // Попытка изменить ссылку на объект:
        ChangeRef(obj);
        // Проверка результата:
        obj.show();
    }
}

