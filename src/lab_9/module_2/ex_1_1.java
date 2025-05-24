package lab_9.module_2;

public class ex_1_1 {
    public static void main(String[] args) {
        Name Name_1 = new Name();
        Name_1.setFirstName("John");
//        System.out.println(Name_1.firstName);
        System.out.println(Name_1.getFirstName());
    }
}

class Name {
    private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}

