public class quickSort {
    
    public static void printAll(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[], int si, int ei){
        
    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};
        QuickSort(arr, 0, arr.length-1);
        printAll(arr);
    }
}
