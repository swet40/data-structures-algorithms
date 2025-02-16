public class Majority_elem_moores {
    public static int majorityElem(int arr[]){
        int ans =0, count =0;
        for(int i=0; i<arr.length; i++){
            if(count == 0){
                ans = arr[i];
                count = 1;
            } else{
                if(ans == arr[i]){
                    count++;
                } else{
                    count --;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,5,4,5,5};
        System.out.println(majorityElem(arr));;

    }
}
