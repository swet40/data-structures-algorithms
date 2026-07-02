import java.util.*;

public class shape {
    public void area(){
        System.out.println("printing area of shapes");
    }
}

class circle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

class triangle extends shape{
    public void area(int l, int b){
        System.out.println(0.5*l*b);
    }
}

class equilateraltriangle extends triangle{
    public void area(int l){
        System.out.println(0.5*l*l);
    }
}