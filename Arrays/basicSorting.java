import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class basicSorting {
    
    public static void sortBubble(Integer arr[]){
        
        int cout = 0;
        for(int turn = 0; turn < arr.length-1; turn++){
            int didSwap = 0;  
            for(int j = 0; j < arr.length-1-turn; j++){
                cout++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){  
                break;
            }
        }
        System.out.println("turns: " + cout);
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(Integer arr[]){
        for(int i=0; i<arr.length -1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(Integer arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while( prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7}; // Already sorted
        countingSort(arr);
        // Arrays.sort(arr, 0, 3);
        // Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}

