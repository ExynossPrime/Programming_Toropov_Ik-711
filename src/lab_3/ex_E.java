package lab_3;

public class ex_E {
    public static void main(String[] args) {
        Integer input_Q = Integer.valueOf(System.console().readLine());
        Integer input_W = Integer.valueOf(System.console().readLine());
        Float divide = Float.valueOf(input_Q) / Float.valueOf(input_W);
        System.out.println(divide);
    }
}
