public class subArraya {

    public static void maxSumArrays(int numbers[]){
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        int ts=0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end= j;
                
                currSum = 0;
                for(int k=start; k<=end; k++){
                    // System.out.print(numbers[k]+ " ");
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxsum < currSum){
                    maxsum = currSum;
                }
                // System.out.print("-> Sum: "+ sum);
                // System.out.println();
            }

        }
        System.out.println("Max-Sum=" + maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        maxSumArrays(numbers);
    }
}
