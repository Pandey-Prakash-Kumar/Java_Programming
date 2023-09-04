package assignment_15;
import java.util.Scanner;
class Person {
    private String name;
    private int age;
    public Person(){

    }
    public Person(String name){
        this.name = name;
    }
    public Person(int age){
        this.age = age;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

}
class Employee{
    private int empId;
    private String name;
    private double salary;
    static int empInstance = 0;
    static
    {
         empInstance+=1;

    }
    private int generateEmpId(){
        empId=empInstance++;
        return empId++;

    }

    public int getEmpId() {
        return generateEmpId();
    }

    private void setEmpId(int empId){
        this.empId=empId;
    }
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public Employee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name=sc.next();
        System.out.println("Enter your age: ");
        this.salary = sc.nextDouble();
    }
}

class Box{
    private int length, breadth, height;
    public Box(){

    }
    public Box(int length){
        this.length=length;
    }
    public Box(int length,int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

}
class Time{
    private int hr,min,sec;
    public Time(){

    }
    public Time(int min){
        this.min = min;
    }
    public Time(int hr, int min, int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }

}

class Customer{
    int id;
    String name;
    String phone;
    String email;
    public Customer(int id, String name, String phone, String email){
        this.id =id;
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
    public Customer(int id, String name, String phone){
        this.id =id;
        this.name=name;
        this.phone=phone;
    }


}