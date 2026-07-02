import java.util.*;
import bank.bank;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing");
    }

    public void itscolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    Integer age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println((this.age));
    }

    Student(Student s2){
        this.name = name;
        this.age = age;
    }

    Student(){
    }
}

public class OOPs{
    public static void main(String[] args) {
        bank bank1 = new bank();
        bank.Account act1 = bank1.new Account();
        act1.name = "cust1";
    }
}