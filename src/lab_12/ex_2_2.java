package lab_12;

public class ex_2_2 {
    public static void main(String[] args) {
        Person2 tom = new Person2("Tom");
        tom.display();
        Person2 sam = new Employee2("Sam", "Oracle");
        sam.display();
    }
}
class Person2 {
    String name;
    public String getName() { return name; }
    public Person2(String name){
        this.name=name;
    }
    public void display(){
        System.out.printf("Person %s \n", name);
    }
}
class Employee2 extends Person2{
    String company;
    public Employee2(String name, String company) {
        super(name);
        this.company = company;
    }
    @Override
    public void display(){
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}

