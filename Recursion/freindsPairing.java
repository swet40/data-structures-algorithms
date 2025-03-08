public class freindsPairing {
    public static int pairingFrnds(int n){
        if(n==1 || n==2){
            return n;
        }

        // //single
        // int fnm1 = pairingFrnds(n - 1);

        // //pairing
        // int fnm2 = pairingFrnds(n-2);
        // int pairWays = (n-1) * fnm2;

        // int totWays = fnm1 + pairWays;
        // return totWays;

        return pairingFrnds(n-1) + (n-1)*pairingFrnds(n-2);
    }

    public static void main(String[] args) {
        System.out.println(pairingFrnds(3));
    }
}
