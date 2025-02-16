import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter the number to be checked:");
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();

        if(n==2){
            System.out.println("2 is prime");
        }
        else{
            boolean isPrime  = true;
            for(int i=2 ; i<= Math.sqrt(n) ; i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("Prime");
            }else{
                System.out.println("not prime");
            }
        }
}
}
