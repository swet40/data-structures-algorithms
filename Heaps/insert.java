import java.util.*;

public class insert {

    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par,temp);
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public void heapify(int i){
            int minIdx = i;
            int left = 2*i+1;
            int right = 2*i+2;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(arr.get(i), temp);
            }
        }

        public int remove() {
            int data = arr.get(0);

            //swap
            int temp = arr.get(0);
            arr.set(0, arr.size()-1);
            arr.set(arr.size()-1,temp);
        }
    }
    public static void main(String[] args) {
        
    }
}
