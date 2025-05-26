package lab_14;

class MathConstants {
    public static final double PI = 3.14159;
    public static final double E = 2.71828;
    public static final int MAX_VALUE = 100;

    // Метод для вычисления площади круга
    public static double circleArea(double radius) {
        return PI * radius * radius;
    }
}

// Использование:
public class ex_3_2 {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = MathConstants.circleArea(radius);
        System.out.println("Площадь круга: " + area);
        System.out.println("Число π: " + MathConstants.PI);
    }
}

