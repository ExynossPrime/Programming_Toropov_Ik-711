package lab_6;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ex_1 {
    public static void main(String[] args) {
        int[] arr = {};

        System.out.println("Тип массива - " + arr.getClass());
        System.out.println("Суперкласс типа массива - " + arr.getClass().getSuperclass());
        System.out.println("Доступные методы: ");
        for (Method m : arr.getClass().getMethods()) {
            System.out.println(m.getName());
        }

        Object obj = new int[]{3, 6, 9};
        int[] arr1 = (int[]) obj;
        System.out.println(obj);
        System.out.println(Arrays.toString(arr1));
    }
}
