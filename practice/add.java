public class add {

    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("A  = " + a);
        System.out.println("B  = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a,b);
    }
}
