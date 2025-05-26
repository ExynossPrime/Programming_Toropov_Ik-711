package lab_14;

class DatabaseConnection {
    private static String connectionString;
    private static boolean isInitialized = false;

    // Статический инициализатор
    static {
        System.out.println("Инициализация подключения к базе данных...");
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        isInitialized = true;
        System.out.println("База данных инициализирована");
    }

    public static String getConnectionString() {
        return connectionString;
    }

    public static boolean isReady() {
        return isInitialized;
    }
}

// Использование:
public class ex_3_3 {
    public static void main(String[] args) {
        System.out.println("Начало программы");

        // При первом обращении к классу выполнится статический инициализатор
        System.out.println("Статус БД: " + DatabaseConnection.isReady());
        System.out.println("Строка подключения: " + DatabaseConnection.getConnectionString());
    }
}
