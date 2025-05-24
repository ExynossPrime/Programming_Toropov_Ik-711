package lab_10;

import javax.swing.*;

public class ex_2 {
    public static void main(String[] args) {
        String text = "Значения ряда Тейлора для синуса:\n";

        for (int k = 0; k < 5; k++) {
            text += "Слагаемое " + (k + 1) + ": " + MyMath.sin(MyMath.PI / 4, k) + "\n";
        }

        text += "\nЗадание выполнил Торопов Данила Дмитриевич - 20 мая 2025 г.\n";

        JOptionPane.showMessageDialog(null, text);
    }
}

class MyMath {
    final static double PI = 3.14159265;

    static double sin(double x, int n) {
        double s = 0.0;
        for (int i = 1; i <= n + 1; i++) {
            s += Math.pow(-1, i - 1) * Math.pow(x, 2 * i - 1) / fact(2 * i - 1);
        }
        return s;
    }

    static long fact(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
