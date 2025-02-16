public class trapping_rainwater {

    public static int trappingRainwater(int arr[]){
        int res = 0;
        
        for(int i=1; i<arr.length - 1; i++){

            //left 
            int left = arr[i];
            for(int j = 0; j<i; j++){
                left = Math.max(left, arr[j]);
            }

            //right
            int right = arr[i];
            for(int j = i+1; j<arr.length; j++){
                right = Math.max(right, arr[j]);
            }

            //update the result
            res += Math.min(left,right) - arr[i];

        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappingRainwater(arr));
    }
}
