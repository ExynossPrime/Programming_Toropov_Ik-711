package lab_3;

public class ex_D {
    public static void main(String[] args) {
        Integer input = Integer.valueOf(System.console().readLine());
        if (input >= 100 && input <= 999) {
            String output = String.valueOf(input);
            char[] arr = output.toCharArray();
            int sum = Integer.parseInt(String.valueOf(arr[0])) +
                      Integer.parseInt(String.valueOf(arr[1])) +
                      Integer.parseInt(String.valueOf(arr[2]));
            System.out.println("Сумма цифр введного цисла - " + sum);
        } else {
            System.out.println("Значение должно быть числом в интервале от 100 до 999");
        }


    }
}
