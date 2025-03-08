public class basics {

    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.println(n); 
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }

    //sum of n natural numbers
    public static int sum(int n){
        if(n==1){ //base case
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = n + snm1;
        return sn;
    }

    //fibonacci series
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int Fibnm1 = fib(n-1);
        int Fibnm2 = fib(n-2);
        int fn = Fibnm1 + Fibnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurance(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }

    public static int lastOccurance(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if(n == 0) return 1;
        
        return x * power(x, n-1);
    }

    //Time Complexity= O(log n)
    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }

        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {

        System.out.println(optimizedPower(2, 4));
    }

}
