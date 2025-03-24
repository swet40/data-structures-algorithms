import java.util.*;

public class demo {
    public static void swap(ArrayList<Integer> list,int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(8);  //O(1)
        list.add(4);
        list.add(12);
        list.add(9);
        list.add(14);

        // System.out.println(list.size());

        //print the arraylist
        // for(int i = 0; i<list.size(); i++){
        //     System.out.print(list.get(i));
        // }
        // System.out.println();

        //Reverse print - O(n)
        // for(int i = list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // list.add(1, 9);

        // System.out.println(list);

        // //Get Operation
        // int element = list.get(0);
        // System.out.println(element);

        // //Delete
        // list.remove(2);
        // System.out.println(list);

        //Set
        // list.set(2,10);
        // System.out.println(list);

        //contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(10));

        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i<list.size(); i++){
        //     if(max < list.get(i)){
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);
        // int idx1 = 2, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
