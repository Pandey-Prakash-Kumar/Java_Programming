package assignment_18;

public class Person1 {
    private String name;
    private int age;
    Person1(){
        this("Rahul",23);
    }
    Person1(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class Employee extends Person1{
    double salary;
    Employee(){
        this(24500.0);
    }
    Employee(double salary){
        this.salary=salary;
    }
    public void showEmployeeData(){
        System.out.println("Name: ");
        System.out.println("Age: ");
        System.out.println("Salary: "+salary);

    }
}
