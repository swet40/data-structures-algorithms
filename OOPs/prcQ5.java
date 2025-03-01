public class prcQ5 {
    public static void main(String[] args) {
        Vehicle obj1 = new car();
        obj1.print1();

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}

class car extends Vehicle{
    void print1(){
        System.out.println("Derived class(car)");
    }
}