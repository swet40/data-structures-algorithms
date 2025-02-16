public class factorial {
    public static int calcfact (int n) {
        if (n==0 || n==1){
            return 1;
        }
        int calFact = calcfact(n-1);
        int fact_no = n*calFact;
        return fact_no;
    }

    public static void main(String[] args) {
        int n=5;
        int ans = calcfact(n);
        System.out.println(ans);
    }
    }

