//brute-force-method

public class Majority_elem_method1 {
    public static int majorityElem(int arr[]){
        for(int i=0; i<arr.length; i++){
            int count = 0;
            int n = arr.length;
            for(int j=0; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > n/2) return arr[i];
        }
        return -1;   
    }

    public static void main(String[] args) {
        int arr[] = {5,5,1,4,5,1,5};
        System.out.println(majorityElem(arr));;
    }
}
