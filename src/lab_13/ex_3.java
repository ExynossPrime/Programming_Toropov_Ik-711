package lab_13;

public class ex_3 {

}


//// Поверхностное копирование через присваивание
//MyClass obj1 = new MyClass();
//MyClass obj2 = obj1; // obj1 и obj2 ссылаются на один объект
//
//// Глубокое копирование через конструктор
//public MyClass(MyClass original) {
//    this.field1 = original.field1;
//    this.nested = new NestedClass(original.nested);
//}
//
//
//
//class MyClass implements Cloneable {
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone(); // поверхностное копирование
//    }
//}
//
//
//
//interface MyInterface {
//    void method1();
//    default void method2() { /* реализация */ }
//}
//
//
//class Subclass extends Superclass {
//    Subclass() {
//        super(); // вызов конструктора родителя
//    }
//}
//
//
//class Subclass extends Superclass {
//    Subclass() {
//        super("параметр"); // должен быть первой строкой
//    }
//}
//
//
//@Override
//void method() {
//    super.method(); // вызов метода суперкласса
//}
//
//
//System.out.println(super.field);
