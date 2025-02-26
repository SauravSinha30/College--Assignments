import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Q5 {
    public static class Edge implements Comparable<Q5.Edge> {
        int src, dest, weight;
        Edge(int s, int d, int w) { src = s; dest = d; weight = w; }
        public int compareTo(Q5.Edge e) { return this.weight - e.weight; }
    }
    public static class DSU {
        int[] start, end;
        public DSU(int n) {
            start = new int[n];
            end = new int[n];
            for (int i = 0; i < n; i++)
                start[i] = i;
        }
        public int find(int x) {
            return start[x] == x ? x : (start[x] = find(start[x]));
        }
        public void union(int x, int y) {
            int a = find(x);
            int b = find(y);
            if (a != b) {
                if (end[b] < end[b])
                    start[a] = b;
                else if (end[a] > end[b])
                    start[b] = a;
                else { start[b] = a;
                    end[a]++; }
            }
        }
    }
    static void kruskalMST(int V, int[][] graph) {
        List<Q5.Edge> edges = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            for (int j = i + 1; j < V; j++) {
                if (graph[i][j] != 0) {
                    edges.add(new Q5.Edge(i, j, graph[i][j]));
                }
            }
        }
        Collections.sort(edges);
        Q5.DSU dsu = new Q5.DSU(V);
        int mstWeight = 0;
        for (Q5.Edge e : edges) {
            if (dsu.find(e.src) != dsu.find(e.dest)) {
                dsu.union(e.src, e.dest);
                System.out.print(e.src + " - " + e.dest + " : " + e.weight+" -> ");
                mstWeight += e.weight;
                System.out.println(mstWeight);
            }
        }
        System.out.println("Total MST Weight: " + mstWeight);
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
        kruskalMST(V, graph);
    }
}
