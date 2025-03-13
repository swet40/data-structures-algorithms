public class oddOrEven {
    public static void oddEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even number");
        } else{
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n , int i){
        int bitmask = i<<1;
        if((n & bitmask) == 0){
            return 0;
        } else{
            return 1;
        }
    }

    public static void main(String[] args) {
        // oddEven(5);
        // oddEven(4);
        System.out.print(getIthBit(10, 2));
    }
}
