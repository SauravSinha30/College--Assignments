import java.util.Arrays;

public class Q6 {
    public static void primMST(int V, int[][] graph) {
        boolean[] mstSet = new boolean[V];
        int[] key = new int[V];
        int[] parent = new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = -1;
            for (int i = 0; i < V; i++)
                if (!mstSet[i] && (u == -1 || key[i] < key[u]))
                    u = i;

            mstSet[u] = true;
            for (int v = 0; v < V; v++)
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }
        int weight = 0;
        for (int i = 1; i < V; i++){
            System.out.println(parent[i] + " - " + i + " : " + graph[i][parent[i]]);
            weight+=graph[i][parent[i]];
        }
        System.out.println("Total MST Weight:"+weight);
    }
    public static void main(String[] args) {
        int V = 5;
        int[][] graph = {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };
        primMST(V, graph);
    }
}
