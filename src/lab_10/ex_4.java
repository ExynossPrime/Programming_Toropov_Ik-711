package lab_10;

public class ex_4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Торопов Данила Дмитриевич");
        System.out.println("20 мая 2025 г.\n");

        Department originalDept = new Department("Исследования");
        Employee original = new Employee("Иван Сидоров", 35, originalDept);

        // Создание копий
        Employee shallowCopy = original.shallowClone();
        Employee deepCopy = original.deepClone();

        // Модификация данных в копиях
        shallowCopy.updateDepartment("Тестирование");
        deepCopy.updateDepartment("Разработка");

        // Вывод результатов
        System.out.println("[Оригинал]\n" + original);
        System.out.println("\n[Поверхностная копия]\n" + shallowCopy +
                "\nИзменения затронули оригинал: " +
                (original.toString().contains("Тестирование") ? "ДА" : "НЕТ"));
        System.out.println("\n[Глубокая копия]\n" + deepCopy +
                "\nИзменения затронули оригинал: " +
                (original.toString().contains("Разработка") ? "ДА" : "НЕТ"));
    }
}

// Класс для демонстрации вложенного объекта
class Department implements Cloneable {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Основной класс с логикой клонирования
class Employee implements Cloneable {
    private String name;
    private int age;
    private Department department;

    public Employee(String name, int age, Department department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Поверхностное копирование
    public Employee shallowClone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    // Глубокое копирование
    public Employee deepClone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.department = (Department) this.department.clone();
        return cloned;
    }

    public void updateDepartment(String newName) {
        this.department.setName(newName);
    }

    @Override
    public String toString() {
        return String.format("%s, %d лет | Отдел: %s", name, age, department.getName());
    }
}

