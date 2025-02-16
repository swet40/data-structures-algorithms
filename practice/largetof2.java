import java.util.Scanner;

public class largetof2 {
    public static void main(String[] args) {
        System.out.println("Enter the 1st number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a + " is greater");
        } else{
            System.out.println(b + " is greater");
        }
    }
}
