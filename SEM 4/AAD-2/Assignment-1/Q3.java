import java.util.LinkedList;

public class Q3 {
    public static void main(String[] args) {
        int n=4;
        LinkedList<Integer>[] a = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            a[i] = new LinkedList<Integer>();
        }
        a[0].add(1);
        a[0].add(2);
        a[1].add(2);
        a[2].add(3);
        System.out.println("Breadth-First Search starting from vertex 0:");
        BFS(0, a);
    }

    static void BFS(int start, LinkedList<Integer>[] a) {
        boolean visited[] = new boolean[a.length];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : a[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
