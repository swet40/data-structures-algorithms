public class rainwater_method2 {
    public static int trapping_rainwater(int arr[]){
        int n = arr.length;

        int left[] = new int[n];

        int right[] = new int[n];
        int res = 0;

        //fill left array
        left [0] = arr[0];
        for(int i = 1; i<n; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }

        //fill right array
        right[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }

        //trapped rainwater
        for(int i = 1; i<n-1; i++){
            int minOf2 = Math.min(left[i-1],right[i+1]);
            if(minOf2 > arr[i]){
                res += minOf2 - arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,3,1,0,4};
        System.out.println(trapping_rainwater(arr));
    }
}
