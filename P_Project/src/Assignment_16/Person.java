package Assignment_16;

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
    private int salary;
    public void inputData(int age, String name, int salary){
        setAge(age);
        setName(name);
        this.salary=salary;

    }
    public void display(){
        System.out.println("Employee's Name: "+getName());
        System.out.println("Employee's age: "+getAge());
        System.out.println("Employee's Salary: "+salary);
    }
}
