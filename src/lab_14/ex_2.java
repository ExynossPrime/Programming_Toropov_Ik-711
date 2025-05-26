package lab_14;

public class ex_2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("иван", 1000.0);
        BankAccount account2 = new BankAccount("иван", 2000.0);

        // Тестируем переопределенные методы
        System.out.println(account1);  // toString()
        System.out.println("Владелец: " + account1.owner());  // owner() в верхнем регистре
        System.out.println("Счета равны: " + account1.equals(account2));  // equals() по владельцу
    }
}

// Простая запись для банковского счета
record BankAccount(String owner, double balance) {

    // Переопределяем toString() для красивого вывода
    @Override
    public String toString() {
        return "Счет владельца " + owner + ": " + balance + " руб.";
    }

    // Переопределяем owner() - возвращаем имя с заглавной буквы
    @Override
    public String owner() {
        return owner.toUpperCase();
    }

    // Переопределяем equals() - счета равны только при одинаковом владельце
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BankAccount other) {
            return this.owner.equals(other.owner);
        }
        return false;
    }
}


