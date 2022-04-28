package com.company;

//private, static and final method we can not override, private does give visibility but not compile time error
//when u override access specifier should be same or wider never assign weaker access specifier in child class
//when u throw exception u in child class u can throw child class exception. can not throw super class of that exception
class Parent{
    Parent(int a){
        System.out.println("Parent class Constructor");
    }
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void add(int a, int b) throws NullPointerException{
        System.out.println("Parent class sum = "+(a+b));
    }

    void show(){
        System.out.println("from parent show");
    }

}
//compiler will add default constructor by default with below line
//Child(){
//    super()
//}
//if you modified constructor in parent class then u have to modify constructor in child class. u need to add super with parameter
//this indicate current class instance and this() will invoke current class constructor
//super is super class instance and super() indicate super class constructor
// super() or this() must be the first line of any constructor. u can not invoke super() and this() at one time from one constructor

public class Child extends Parent{

    Child(){
        this(5);
//        super(4);

        System.out.println("from default child");
    }
    Child(int a){
        super(5);
        System.out.println("from parameter child");

    }
    String education;

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    void add(int a, int b) throws NullPointerException{
        System.out.println("child class sum = "+(a+b));
    }

    void show(){
        System.out.println("from child show");
    }
    public static void main(String[] args) {
        Child obj = new Child();
        obj.setName("Mahesh");
        obj.setAge(67);
        obj.setEducation("MBA");
        obj.add(6,7);

        Parent p = new Child();
        p.show();

    }
}
