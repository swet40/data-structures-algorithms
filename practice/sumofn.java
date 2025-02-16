import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        System.out.println("Enter the range :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
