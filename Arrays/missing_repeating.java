import java.util.Arrays;

public class missing_repeating{
    public static int[] find(int[] nums){
        int n = nums.length;
        int[] hash = new int[n+1];
        
        for(int i = 0; i<n; i++){
            hash[nums[i]]++;
        }
        int missing = -1;
        int repeating = -1;

        for(int i = 1; i<=n; i++){
            if(hash[i] == 0) missing = i;
            if(hash[i] == 2) repeating = i;

            if(repeating != -1 && missing != -1) break;

        }
    return new int[]{missing, repeating};

    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 2};
        System.out.print(Arrays.toString(find(nums)));
    }
}