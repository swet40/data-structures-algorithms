public class Preix_sum_max_subArray {
    public static int prefix_algo(int arr[]){
        int res = arr[0];

        for(int i=0; i<arr.length; i++){
            int currsum = 0;
            for(int j=i; j<arr.length; j++){
                currsum = currsum + arr[j];
                res = Math.max(res, currsum);
            }
            // System.out.println();
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,7,8};
        System.out.print(prefix_algo(arr));
    }
}
