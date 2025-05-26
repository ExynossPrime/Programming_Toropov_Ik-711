package lab_12;

public class ex_3 {
public static void main(String[] args)
{
    Employee3 sam = new Employee3("Sam", "Leman Brothers");
    sam.display();
    Client3 bob = new Client3("Bob", "Leman Brothers");
    bob.display();
}
}
abstract class Person3
{
    private String name;
    public String getName() { return name; }
    public Person3(String name){
        this.name=name;
    }
    public abstract void display();
}
class Employee3 extends Person3
{
    private String bank;
    public Employee3(String name, String company)
    {
        super(name);
        this.bank = company;
    }
    public void display()
    {
        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
class Client3 extends Person3
{
    private String bank;
    public Client3(String name, String company)
    {
        super(name);
        this.bank = company;
    }
    public void display()
    {
        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}

