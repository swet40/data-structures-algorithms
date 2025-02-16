import java.util.Arrays;

public class sum_triangle_array {
    public static void printtri(int[] a){
        if(a.length <1){// case
            return;
        }

    //creating a new array
    int[] temp = new int[a.length -1];
    for(int i=0; i<a.length-1; i++){
        int x= a[i] + a[i+1];
        temp[i] = x;
    }

    printtri(temp);
    System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        printtri(a);
    }
}
