package lab_9.module_1.ex_2;

public class Program {
    public static void main(String[] args) {
        Person kate = new Person("Kate", 38);
        System.out.println(kate.getAge()); // 38
        kate.setAge(33);
        System.out.println(kate.getAge()); // 33
        kate.setAge(112345);
        System.out.println(kate.getAge()); // 33
    }
}
