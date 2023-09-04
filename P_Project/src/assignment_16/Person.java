package assignment_16;

public class Person {
    private String name;
    private int age;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

}
class Employee extends Person{
    private double salary;
    public void inputEmployee(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter name, age and salary of Employee");
        setName(sc.nextLine());
        setAge(sc.nextInt());
        salary=sc.nextDouble();


    }
    public void display(){
        System.out.println("Employee's Name: "+getName());
        System.out.println("Employee's age: "+getAge());
        System.out.println("Employee's Salary: "+salary);
    }
}
