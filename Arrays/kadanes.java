public class kadanes{
    public static int kadanes_algo(int arr[]){
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i = 1; i<arr.length; i++){
            maxEnding = maxEnding + arr[i];
            maxEnding = Math.max(maxEnding, arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(kadanes_algo(arr));;
    }
}