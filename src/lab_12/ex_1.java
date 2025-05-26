package lab_12;

public class ex_1{
    public static void main(String[] args) {
        Employee1 sam = new Employee1("Sam", "Microsoft");
        sam.display();  // Sam
        sam.work();     // Sam works in Microsoft
    }
}
class Person1 {
    String name;
    public String getName(){ return name; }
    public Person1(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Name: " + name);
    }
}
class Employee1 extends Person1{
    String company;
    public Employee1(String name, String company) {
        super(name);
        this.company=company;
    }
    public void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }
}

