package lab_14;

class MathUtils {

    // Статические методы для математических операций
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

// Использование:
public class ex_3_4 {
    public static void main(String[] args) {
        System.out.println("5 + 3 = " + MathUtils.add(5, 3));
        System.out.println("5 * 3 = " + MathUtils.multiply(5, 3));
        System.out.println("2^8 = " + MathUtils.power(2, 8));
        System.out.println("17 простое? " + MathUtils.isPrime(17));
    }
}

