public class calci {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2,3));
        System.out.println(calc.sum((float)1.43,(float)3.02));
        System.out.println(calc.sum(1,60));
    }
}

class Calculator{
    int sum(int a, int b, int c){
        return a+b+c;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b){
        return a+b;
    }
}