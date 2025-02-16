import java.util.Arrays;

public class Majority_elem_sorting {
    public static int majorityElem(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    public static void main(String[] args) {
        int arr[] = {7,2,7,1,4,7,7};
        System.out.println(majorityElem(arr));
    }
}
