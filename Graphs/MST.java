import java.util.*;

public class MST {

    public static int mincost(int n, int city[][]){
        boolean[] visited = new boolean[n];
        long miniCost = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        visited[0] = true;
        for(int j = 0; j<n; j++){
            if(city[0][j] > 0){
                pq.offer(new int[]{city[0][j], j});
            }
        }
        int connected = 1;
        while(!pq.isEmpty() && connected< n){
            int[] curr = pq.poll();
            int cost = curr[0];
            int node = curr[1];

            if(visited[node]) continue;
            visited[node] = true;
            miniCost += cost;
            connected++;

            for(int j = 0; j<n; j++){
                if(!visited[j] && city[node][j] > 0){
                    pq.offer(new int[]{city[node][j],j});
                }
            }
            
        }
        return (int) miniCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int city[][] = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                city[i][j] = sc.nextInt();
            }
        }
        System.out.println(mincost(n, city));;
    }
}
