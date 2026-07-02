import java.util.*;

public static void depth_first_search(int startVertex){
    Stack<Integer> st = new Stack<>();
    ArrayList<Integer> visited = new ArrayList<>();

    st.push(startVertex);
    while(startVertex != 0){
        int currentIndex = st.pop();
        System.out.println(currentIndex + " ");

        visited.add(currentIndex);

        for(int neighbour : adjacency)
    }
}