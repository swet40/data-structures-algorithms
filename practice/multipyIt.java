public class multipyIt {
    public static int MultipyIt(int a, int b) {
        int product = a * b;
        return product;
    }

//     public static void main(String[] args) {
//         int a = 5;
//         int b = 4;
//         int prod = MultipyIt(a, b);
        
//         System.out.println("Product is : " + prod);
//         prod = MultipyIt(20, 5);
//         System.out.println("Product is : " + prod);
//     }

public static int factorial(int n) {
    int f = 1;

    for(int i=1; i<=n;i++){
        f = f * i;
    }
    return f;
}
public static void main(String[] args) {
    System.out.println(factorial(5));
}
}



