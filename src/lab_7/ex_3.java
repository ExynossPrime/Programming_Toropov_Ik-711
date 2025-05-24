package lab_7;

public class ex_3 {
    public static void main(String[] args) {
        int data = 10;
        System.out.println("Данные до обработки в main " + data);
        obrabotkaData(data);
        System.out.println("Данные после обработки в main = " + data);
    }

    private static void obrabotkaData(int data) {
        data = data * 10;
        System.out.println("Данные после обработки в функции " + data);
    }
}
