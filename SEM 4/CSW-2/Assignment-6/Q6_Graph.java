import java.util.*;
public class Q6_Graph {
    private int vertices;
    private int[][] adjMatrix;
    private Map<Integer, List<Integer>> adjList;

    public Q6_Graph(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
        adjList = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            adjList.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;

        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public void displayAdjMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayAdjList() {
        System.out.println("Adjacency List:");
        for (int node : adjList.keySet()) {
            System.out.print(node + " -> ");
            for (int neighbor : adjList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q6_Graph graph = new Q6_Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.displayAdjMatrix();
        graph.displayAdjList();
    }
}
