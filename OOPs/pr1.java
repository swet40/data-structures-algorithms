public class pr1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "abcd";
        s1.roll = 23;
        s1.password = "2345";
        s1.marks[0] = 100;
        s1.marks[1] = 30;
        s1.marks[2] = 50;

        student s2 = new student(s1);
        s2.password = "abcd";
        
        fish.eat();
                dog.eat();
            }
        }
        
        class student{
            String name;
            int roll;
            String password;
            int marks[];
        
            student(String name){
                marks = new int[4];
                this.name = name;
            }
        }
        
        class Animal{
            String name();
            
            static void eat(){
        System.out.println("eats");
    }

    void sleep(){
        System.out.println("sleeps");
    }

}

class dog extends Animal{
    int legs;

    void bark(){
        System.out.println("barks");
    }
}

class fish extends Animal{
    int furs;

    void swim(){
        System.out.println("swims");
    }
}
